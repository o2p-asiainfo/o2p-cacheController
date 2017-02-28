/** 
 * Project Name:o2p-cacheController 
 * File Name:TransforCacheServiceImpl.java 
 * Package Name:com.asiainfo.integretion.o2p.cachecontroller.smo.impl 
 * Date:2016年1月12日上午10:52:18 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integretion.o2p.cachecontroller.smo.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import com.ailk.eaap.op2.common.O2pDocumentHelper;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractFormatEx;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.ailk.eaap.op2.bo.NodeDescMapper;
import com.ailk.eaap.op2.bo.TransformerRule;
import com.asiainfo.integretion.o2p.cachecontroller.smo.ITransforCacheService;

@org.springframework.stereotype.Service(value="transforCacheService")
public class TransforCacheServiceImpl implements ITransforCacheService {

	private static final Log LOG = LogFactory.getLog(CacheServiceImpl.class);

	public void initMsgBody(TransformerRule transformerRule) {

		if (isNewVersionTransfomer(transformerRule)) {

			ContractFormatEx cf = transformerRule.getTarContractFormatEx();
			if(cf != null) {
				
				String conType = cf.getConType();
				String xsd = cf.getXsdFormat();
				if(!StringUtils.isEmpty(xsd)) {
					
					if(LOG.isDebugEnabled()) {
						
						LOG.debug("=====>xsd format: "+xsd);
					}
					
					if ("1".equals(conType)) {

						Document doc = null;
						try {
							
							doc = O2pDocumentHelper.parseText(xsd);
							clearDocValue(doc);
							if(LOG.isDebugEnabled()) {
								
								LOG.debug("clear doc content: "+doc.asXML());
							}
							cf.setMsgBody(doc);
						} catch (DocumentException e) {
							LOG.error("contractFormat.xsd_format error", e);
						} 
					} else if ("2".equals(conType)) {
						//json对象报序列化错误
						try {
							JSONObject json = JSONObject.fromObject(xsd);
							clearJsonValue(json);
							cf.setMsgBody(json.toString());
						} catch (JSONException e) {
							LOG.error("contractFormat.xsd_format error", e);
						} 
					}

					transformerRule.setTarContractFormatEx(cf);
				}
			}
		}
	}

	private boolean isNewVersionTransfomer(TransformerRule transformerRule) {

		Integer transType = transformerRule.getTransformerType();
		
		return transType != null && transType.intValue() == 0;
	}


	private void clearJsonValue(JSONObject json) {
		
		if(!json.isNullObject()) {
			
			Iterator<String> keys = json.keys();
			
			while (keys.hasNext()) {
				
				String key = keys.next();
				Object obj = json.get(key);
				
				if(!(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
					
					json.put(key, "");
				}  else if (obj instanceof JSONObject) {
					
					JSONObject jsonObj = (JSONObject) obj;
					clearJsonValue(jsonObj);
				} else if(obj instanceof JSONArray) {
					
					JSONArray jsonArray = (JSONArray) obj;
					for(Object o : jsonArray) {
						
						if(o instanceof JSONObject) {
							
							JSONObject jsonObj = (JSONObject)o;
							clearJsonValue(jsonObj);
						} else if(o instanceof String) {
							
							jsonArray.clear();
							break;
						}
					}
				}
			}
		}
	}

	private void clearDocValue(Document doc) {

		Element root = doc.getRootElement();
		clearElementValue(root);
	}

	private void clearElementValue(Element element) {

		List list = element.elements();
		// 递归方法
		for (Iterator its = list.iterator(); its.hasNext();) {
			Element childEle = (Element) its.next();
			String text = childEle.getText();
		
			if(!StringUtils.isEmpty(text) && !text.contains("<")) {
				
				childEle.setText("");
			}
			
			clearElementValue(childEle);
		}
	}

	public void buildNodeDesc(TransformerRule transformerRule) {

		if(isNewVersionTransfomer(transformerRule)) {
			
			List<NodeDescMapper> nodeDescMappers = transformerRule
					.getNodeDescMappers();
			ContractFormat cf = transformerRule.getTarContractFormat();
			buildNodeDescMap(nodeDescMappers, cf, transformerRule);
		}
	}

	private void buildNodeDescMap(List<NodeDescMapper> nodeDescMappers,
			ContractFormat cf, TransformerRule transformerRule) {
		
		if(cf != null) {
			List<Object> rootList = new ArrayList<Object>();
			List<NodeDesc> nodeDescs = cf.getNodeDescs();
			for(NodeDesc nodeDesc : nodeDescs) {
				
				Integer parentId = nodeDesc.getParentNodeId();
				//no parentId is first level node
				if(parentId == null || parentId <= 0) {
					//parent map
					Map<Object, Object> parentMap = new HashMap<Object, Object>();
					List<Object> parentList = new ArrayList<Object>();
					Object obj = nodeDesc.getNodeDescId();
					Object keyObj = getObject(obj, nodeDescMappers);
					parentMap.put(keyObj, parentList);
					
					addSubMap(nodeDesc.getNodeDescId(), parentList, nodeDescs, nodeDescMappers);
					
					rootList.add(parentMap);
				}
			}
			
			transformerRule.setRootNodeDescList(rootList);
		}
	}

	private Object getObject(Object obj, List<NodeDescMapper> nodeDescMappers) {

		for(NodeDescMapper ndm : nodeDescMappers) {
			
			NodeDesc nd = ndm.getTarNode();
			if(nd != null) {
				
				if(nd.getNodeDescId().intValue() == ((Integer)obj).intValue()) {

					return ndm;
				}
			}
		}
		
		return obj;
	}

	private void addSubMap(Integer parentId,
			List<Object> parentList, List<NodeDesc> nodeDescs, List<NodeDescMapper> nodeDescMappers) {

		for(NodeDesc nd : nodeDescs) {
			
			if(nd.getParentNodeId() != null && nd.getParentNodeId().intValue() ==  parentId.intValue()) {
				
				List<Object> subList = new ArrayList<Object>();
				Map<Object, Object> subMap = new HashMap<Object, Object>();
				Object obj = nd.getNodeDescId();
				Object keyObj = getObject(obj, nodeDescMappers);
				subMap.put(keyObj, subList);

				parentList.add(subMap);
				
				addSubMap(nd.getNodeDescId(), subList, nodeDescs, nodeDescMappers);
			}
		}
	}
}
