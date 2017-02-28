package com.asiainfo.integretion.o2p.cachecontroller.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder;
import com.ailk.eaap.op2.bo.Api;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.Auth;
import com.ailk.eaap.op2.bo.AuthObj;
import com.ailk.eaap.op2.bo.BizFunction;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.ConfProperties;
import com.ailk.eaap.op2.bo.Contract;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractNodeFuzzy;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.CtlCounterms2Comp;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.FuzzyEncryption;
import com.ailk.eaap.op2.bo.GetValueExpr;
import com.ailk.eaap.op2.bo.LogLevel;
import com.ailk.eaap.op2.bo.MainData;
import com.ailk.eaap.op2.bo.MessageFlow;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.ailk.eaap.op2.bo.CacheObj;
import com.ailk.eaap.op2.bo.CacheStrategy;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.bo.ProofEffect;
import com.ailk.eaap.op2.bo.RemoteCallInfo;
import com.ailk.eaap.op2.bo.RouteCondition;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.RoutePolicy;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.ServiceRela;
import com.ailk.eaap.op2.bo.ServiceRouteConfig;
import com.ailk.eaap.op2.bo.TechImpContralPo;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.bo.TechImplNode;
import com.ailk.eaap.op2.bo.Template;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;
import com.ailk.eaap.op2.bo.UsableMonitorConf;
import com.ailk.eaap.op2.bo.XmlNameSpace;
import com.asiainfo.integretion.o2p.cachecontroller.common.DaoCommon;
import com.asiainfo.integretion.o2p.cachecontroller.dao.ICacheDao;
import com.linkage.rainbow.util.ExprUtil;
import com.linkage.rainbow.util.expr.core.Expr;

@SuppressWarnings("unchecked")
@org.springframework.stereotype.Service(value="cacheDao")
public class CacheDaoImpl implements ICacheDao {
	private static final Log log = LogFactory.getLog(CacheDaoImpl.class);
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	@Value("${tokenEnableTime}")
	private String tokenEnableTime;

	
	public List<Api> getApis(String tenantId) {
		List<Map<String,String>> resultMap;
		resultMap = sqlSessionTemplate.selectList("loadCommon.getApis", tenantId);
		List<Api> resultList = new ArrayList<Api>();
		if(resultMap!=null){
			for (Map<String, String> map : resultMap) {
				Api api = new Api();
				api.setApiName(map.get("API_NAME"));
				api.setApiMethod(map.get("API_METHOD"));
				api.setContractVer(map.get("VERSION"));
				api.setApiId(ObjtoInt(map.get("API_ID")));
				api.setServiceId(ObjtoInt(map.get("SERVICE_ID")));
				api.setServiceCode(map.get("SERVICE_CODE"));
				api.setIsNeedUserAuth(map.get("IS_NEED_USER_AUTH"));
				resultList.add(api);
			}
		}
		return resultList;
	}

	@Override
	public List<Map<String, Object>> getApiOperations(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getApiOperations",tenantId);
	}
	@Override
	public List<ConfProperties> getConfProperties(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getConfProperties", tenantId);
	}
	@Override
	public List<ContractNodeFuzzy> getContractNodeFuzzy(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getContractNodeFuzzy",tenantId);
	}
	@Override
	public List<ContractVersion> getContractVer(String tenantId) {
		List<Map<String,String>> resultMap = sqlSessionTemplate.selectList("loadCommon.getContractVer",tenantId);
		List<ContractVersion> resultList = new ArrayList<ContractVersion>();
		if(resultMap!=null){
			for (Map<String, String> map : resultMap) {
				ContractVersion cv = new ContractVersion();
				cv.setState(map.get("STATE").toString());
				cv.setVersion(map.get("VERSION").toString());
				cv.setIsNeedCheck(map.get("IS_NEED_CHECK")==null?null:map.get("IS_NEED_CHECK").toString());
				Contract contract = new Contract();
				contract.setCode(map.get("CODE").toString());
				Object co = map.get("BASE_CONTRACT_ID");
				if(co!=null){
					String so = co.toString();
					contract.setBaseContractId(Double.valueOf(so).intValue());
				}
				cv.setContract(contract);
				cv.setContractVersionId(ObjtoInt(map.get("CONTRACT_VERSION_ID")));
				List<ContractFormat> contractFormats = getContractFormat(cv.getContractVersionId(), tenantId);
				for (ContractFormat contractFormat : contractFormats) {
					if(contractFormat.getReqRsp().equals("REQ")){
						cv.setReqContractFormat(contractFormat);
					}else{
						cv.setRspContractFormat(contractFormat);
					}
				}
				ContractVersion baseContractVersion = getContractFormatByContract(contract.getBaseContractId(), tenantId);
				cv.setBaseContractVersion(baseContractVersion);
				
				baseToSubCv(baseContractVersion,  cv);
				resultList.add(cv);
			}
		}
		return resultList;
	}
	
private void baseToSubCv(ContractVersion baseCv, ContractVersion cv) {
		
		if(baseCv != null) {
			
			ContractFormat reqCf = cv.getReqContractFormat();
			ContractFormat rspCf = cv.getRspContractFormat();
			
			reqCf = baseToSubFormat(baseCv.getReqContractFormat(), reqCf);
			rspCf = baseToSubFormat(baseCv.getRspContractFormat(), rspCf);
			
			cv.setReqContractFormat(reqCf);
			cv.setRspContractFormat(rspCf);
		}
	}


	/**
	 * 
	 * baseToSubFormat:(继承基类协议格式). <br/> 
	 * TODO(这里描述这个方法适用条件 – 可选).<br/> 
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
	 * 
	 * @author wuwz 
	 * @param baseCf
	 * @param cf 
	 * @since JDK 1.6
	 */
	private ContractFormat baseToSubFormat(ContractFormat baseCf, ContractFormat cf) {

		if(baseCf != null) {
			
			if(cf == null) {
				
				cf = baseCf;
				return cf;
			}
			List<NodeDesc> baseNodeList =  baseCf.getNodeDescs();
			List<NodeDesc> nodeList =  cf.getNodeDescs();
			for(NodeDesc baseNode : baseNodeList) {
				
				String baseJavaField = baseNode.getJavaField();
				//继承javaField相同的节点
				if(baseJavaField != null && !"".equals(baseJavaField)) {
					
					List<String> list = new ArrayList<String>();
					for(NodeDesc node : nodeList) {
						
						if(node != null) {
							
							list.add(node.getJavaField());
						}
					}
					
					if(!list.contains(baseJavaField)) {
						//添加基类节点
						nodeList.add(baseNode);
					}
				} 
				//继承nodeCode相同的节点
				else {
					
					String nodeCode = baseNode.getNodeCode();
					
					if(StringUtils.isEmpty(nodeCode)) {
						
						List<String> list = new ArrayList<String>();
						for(NodeDesc node : nodeList) {
							
							if(node != null) {
								
								list.add(node.getNodeCode());
							}
						}
						
						if(!list.contains(nodeCode)) {
							//添加基类节点
							nodeList.add(baseNode);
						}
					}
				}
			}
			
			//设置子类协议格式
			cf.setNodeDescs(nodeList);
		}
		
		return cf;
	}
	
	@Override
	public List<Map<String, Object>> getException(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getException",tenantId);
	}
	@Override
	public List<CtlCounterms2Comp> getFlow(String tenantId) {
		List<Map<String,Object>> resultList = sqlSessionTemplate.selectList("loadCommon.getCTL_COUNTERMS_2_COMP", tenantId);
		if(resultList!=null){
			List<CtlCounterms2Comp> flowList = new ArrayList<CtlCounterms2Comp>();
			for (Map<String, Object> map : resultList) {
				CtlCounterms2Comp flow = new CtlCounterms2Comp();
				flow.setSerInvokeInsId(ObjtoInt(map.get("SER_INVOKE_INS_ID")));
				flow.setCycleValue(ObjtoInt(map.get("CYCLE_VALUE")));
				flow.setCycleType(map.get("CYCLE_TYPE")==null?null:map.get("CYCLE_TYPE").toString());
				flow.setCutmsValue(ObjtoInt(map.get("CUTMS_VALUE")));
				flow.setCcCd(ObjtoInt(map.get("CC_CD")));
				String effectState = map.get("EFFECT_STATE")==null?"R":map.get("EFFECT_STATE").toString();
				flow.setEffectState(effectState);
				flowList.add(flow);
			}
			return flowList;
		}
		return null;
	}
	@Override
	public List<FuzzyEncryption> getFuzzyEncryption(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getFuzzyEncryption",tenantId);
	}
	@Override
	public List<LogLevel> getLogLevel(Object object) {
		List<Map<String, Object>> logLevelList = sqlSessionTemplate.selectList("loadCommon.getLogLevels", null);
		LogLevel logLevel = null;
		List<LogLevel> logLevels = new ArrayList<LogLevel>();
		for(Map<String, Object> map: logLevelList) {
			logLevel = new LogLevel();
			String logOutObject = (String)map.get("LOG_OUT_OBJECT");
			if(StringUtils.hasText(logOutObject)){
				logLevel.setLogOutObjects(Arrays.asList(logOutObject.split(",")));
			}
			else {
				logLevel.setLogOutObjects(new ArrayList<String>());
			}
			logLevel.setLogLevel((String)map.get("LOG_LEVEL"));
			logLevel.setRunningStatus((String)map.get("RUN_STATUS"));
			logLevels.add(logLevel);
		}
		return logLevels;
	}
	@Override
	public List<Api> getNeedUserAuthApi(String tenantId) {
		List<Map<String,String>> resultMap = sqlSessionTemplate.selectList("loadCommon.getNeedUserAuthApi",tenantId);
		List<Api> resultList = new ArrayList<Api>();
		if (resultMap!=null) {
			for (Map<String, String> map : resultMap) {
				Api api = new Api();
				api.setApiName(map.get("API_NAME"));
				api.setApiMethod(map.get("API_METHOD"));
				api.setApiId(ObjtoInt(map.get("API_ID")));
				api.setServiceId(ObjtoInt(map.get("SERVICE_ID")));
				resultList.add(api);
			}			
		}	
		return resultList;
	}
	@Override
	public List<RemoteCallInfo> getRemoteCallInfoList(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getRemoteCallInfo",tenantId);
	}
	@Override
	public List<Map<String, Object>> getRestConfigList(Map<String, String> param) {
		return sqlSessionTemplate.selectList("loadCommon.getRestConfigList",param);
	}
	@Override
	public List<Template> getTemplate(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getTemplate",tenantId);
	}
	@Override
	public Map<String, String> getVersions(String tenantId) {
		Map<String, String> map = new HashMap<String, String>();
		List<Map<String, String>> list = sqlSessionTemplate.selectList("loadCommon.getVersionList", tenantId);
		Iterator<Map<String, String>> it = list.iterator();
		while(it.hasNext()){
			Map<String, String> mapTemp = (Map<String, String>) it.next();
			map.put((String)mapTemp.get("MODULE_NAME"), mapTemp.get("VERSION").toString());
		}
		return map;
	}
	@Override
	public List<Map<String, Object>> getWsdlFileList(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getWsdlFileList",tenantId);
	}
	
	public ContractVersion getContractFormatByContract(Integer contractId, String tenantId){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("contractId", contractId);
		params.put("tenantId", tenantId);
		List<Map<String,String>> resultMap = sqlSessionTemplate.selectList("loadCommon.getContractFormatByContract", params);
		if(resultMap!=null){
			ContractVersion cv = new ContractVersion();
			for (Map<String, String> map : resultMap) {
				Object o = map.get("CONTRACT_VERSION_ID");
				String s = o.toString();
				Integer contractVerId=Double.valueOf(s).intValue();
				List<ContractFormat> contractFormats = getContractFormat(contractVerId, tenantId);
				String version = map.get("VERSION") == null ? null : map.get("VERSION").toString();
				cv.setVersion(version);
				for (ContractFormat contractFormat2 : contractFormats) {
					if(contractFormat2.getReqRsp().equals("REQ")){
						cv.setReqContractFormat(contractFormat2);
					}else{
						cv.setRspContractFormat(contractFormat2);
					}
				}
			}
			return cv;
		}
		return null;
	}
	
	public List<ContractFormat> getContractFormat(Integer contractVerId, String tenantId){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("contractVerId", contractVerId);
		params.put("tenantId", tenantId);
		List<Map<String,String>> formatresult = sqlSessionTemplate.selectList("loadCommon.getContractFormat",params);
		if(formatresult!=null){
			List<ContractFormat> contractFormats = new ArrayList<ContractFormat>();
			for (Map<String, String> formatMap: formatresult) {
				ContractFormat cf = new ContractFormat();
				cf.setConType(formatMap.get("CON_TYPE"));
				cf.setReqRsp(formatMap.get("REQ_RSP").toString());
				cf.setState(formatMap.get("STATE"));
				cf.setXsdDemo(DaoCommon.getLongText(formatMap.get("XSD_DEMO")));
				cf.setXsdFormat(DaoCommon.getLongText(formatMap.get("XSD_FORMAT")));
				cf.setXsdException(DaoCommon.getLongText(formatMap.get("XSD_EXCEPTION")));
				cf.setXsdHeaderFor(DaoCommon.getLongText(formatMap.get("XSD_HEADER_FOR")));
				Object tcpid = formatMap.get("TCP_CTR_F_ID");
				
				String tcpidStr = tcpid.toString();
				cf.setTcpCtrFId(Double.valueOf(tcpidStr).intValue());
				params.put("tcpid", tcpid);
				List<Map<String,Object>> nodeResult = sqlSessionTemplate.selectList("loadCommon.getNode",params);
				List<NodeDesc> nodeDescList = new ArrayList<NodeDesc>();
				for (Map<String, Object> nodeMap : nodeResult) {
					NodeDesc de = new NodeDesc();
					if (null != nodeMap.get("NODE_DESC_ID")) {
						de.setNodeDescId(Integer.valueOf(nodeMap.get("NODE_DESC_ID").toString()));
					}
					de.setIsNeedCheck(nodeMap.get("IS_NEED_CHECK")==null?null:nodeMap.get("IS_NEED_CHECK").toString());
					de.setNodeCode(nodeMap.get("NODE_CODE")==null?null:nodeMap.get("NODE_CODE").toString());
					de.setNodePath(nodeMap.get("NODE_PATH")==null?null:nodeMap.get("NODE_PATH").toString());
					if(nodeMap.get("NODE_LENGTH_CONS")!=null){
						de.setNodeLengthCons(nodeMap.get("NODE_LENGTH_CONS")==null?null:nodeMap.get("NODE_LENGTH_CONS").toString());
					}
					
					de.setNodeType(nodeMap.get("NODE_TYPE")==null?null:nodeMap.get("NODE_TYPE").toString());
					de.setNodeTypeCons(nodeMap.get("NODE_TYPE_CONS")==null?null:nodeMap.get("NODE_TYPE_CONS").toString());
					de.setNodeNumberCons(nodeMap.get("NODE_NUMBER_CONS")==null?null:nodeMap.get("NODE_NUMBER_CONS").toString());
					
					de.setNevlConsType(nodeMap.get("NEVL_CONS_TYPE")==null?null:nodeMap.get("NEVL_CONS_TYPE").toString());
					de.setNevlConsValue(nodeMap.get("NEVL_CONS_VALUE")==null?null:nodeMap.get("NEVL_CONS_VALUE").toString());
					de.setIsNeedSign(nodeMap.get("IS_NEED_SIGN")==null?null:nodeMap.get("IS_NEED_SIGN").toString());
					de.setJavaField(nodeMap.get("JAVA_FIELD")==null?null:nodeMap.get("JAVA_FIELD").toString());
					nodeDescList.add(de);
				}
				cf.setNodeDescs(nodeDescList);
				contractFormats.add(cf);
			}
			return contractFormats;
		}
		return null;
	}
	
	
	

	public Map<String, List<MainData>> getMainData(String tenantId) {
		try{
			Map<String,List<MainData>> resultMap = new Hashtable<String,List<MainData>>();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("tenantId", tenantId);
			List<Map<String,Object>> mainTypeMap = sqlSessionTemplate.selectList("loadCommon.getMainDataType",params);
			for (Map<String, Object> map : mainTypeMap) {
				String mdtSign = map.get("MDT_SIGN")==null?null:map.get("MDT_SIGN").toString();
				Integer mdtId = ObjtoInt(map.get("MDT_CD"));
				params.put("mdtId", mdtId);
				List<Map<String,Object>> mainMap  = sqlSessionTemplate.selectList("loadCommon.getMainDataForMDTypeID",params);
				if(mainMap!=null && !mainMap.isEmpty()){
					List<MainData> mainDataList = new ArrayList<MainData>();
					for (Map<String, Object> mp : mainMap) {
						MainData mainData = new MainData();
						mainData.setMaindId(ObjtoInt(mp.get("MAIND_ID")));
						mainData.setCepValues(mp.get("CEP_VALUES")==null?null:mp.get("CEP_VALUES").toString());
						mainData.setCepCode(mp.get("CEP_CODE")==null?null:mp.get("CEP_CODE").toString());
						mainData.setCepDes(mp.get("CEP_DES")==null?null:mp.get("CEP_DES").toString());
						mainData.setCepName(mp.get("CEP_NAME")==null?null:mp.get("CEP_NAME").toString());
						if(null != mp.get("CREATE_TIME")){
							mainData.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse(mp.get("CREATE_TIME").toString()));
						}else{
							mainData.setCreateTime(null);
						}
						if(null != mp.get("LASTEST_TIME")){
							mainData.setLastestTime(new SimpleDateFormat("yyyy-MM-dd").parse(mp.get("LASTEST_TIME").toString()));
						}else{
							mainData.setLastestTime(null);
						}
						mainData.setMdtCd(mp.get("MDT_CD")==null?null:mp.get("MDT_CD").toString());
						mainData.setState(mp.get("STATE")==null?null:mp.get("STATE").toString());
						mainDataList.add(mainData);
					}
					if(mdtSign != null) {
						resultMap.put(CacheKey.MainData + mdtSign, mainDataList);
					}
				}
			}
			return resultMap;
		}catch(Exception e){
			log.error("get main data error!", e);
			return null;
		}
	}

	public Map<String, ProofEffect> getProofValues(Integer servInvokeId, String tenantId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("servInvokeId", servInvokeId);
		params.put("tenantId", tenantId);
		List<Map<String,String>> resultMap = sqlSessionTemplate.selectList("loadCommon.getAllProofValues", params);
		if(resultMap!=null && resultMap.size()>0){
			Map<String,ProofEffect> resultList = new Hashtable<String,ProofEffect>();
			for (Map<String, String> map : resultMap) {
				Object peIdObj = map.get("PROOFE_ID");
				String peIdstr = peIdObj.toString();
				ProofEffect pe = null;
				if(resultList.get(peIdstr)!=null){
					pe = (ProofEffect)resultList.get(peIdstr);
				}else{
					pe = new ProofEffect();
					pe.setProofeId(Double.valueOf(peIdObj.toString()).intValue());
					pe.setProofCode(map.get("PT_CODE").toString());
					Object o2 = map.get("SER_INVOKE_INS_ID");
					String s2 = o2.toString();
					pe.setSerInvokeInsId(Double.valueOf(s2).intValue());
					Object o3 = map.get("STATUS");
					String s3 = o3.toString();
					pe.setStatus(s3);
				}
				Object pvIdObj = map.get("PV_ID");
				if(pvIdObj!=null){
					Object attrValueObj = map.get("ATTR_VALUE");
					Object prAtrObj = map.get("PR_ATR_SPEC_CD");
					if(prAtrObj!=null && attrValueObj!=null){
						String  attrSpecId = prAtrObj.toString();
						params.put("attrSpecId", attrSpecId);
						params.put("tenantId", tenantId);
						String str = (String)sqlSessionTemplate.selectOne("loadCommon.getProofTypeAtrSpec", params);
						if(str != null) {
							Object attobj = pe.getAtts().get(str);
							if(str.equals(EndpointAttr.IP_ADDRESS) || str.equals(EndpointAttr.MAC_ADDRESS)){
								List<String> addresslist = null;
								if(attobj==null){
									addresslist = new ArrayList<String>();
								}else{
									addresslist = (List<String>) attobj;
								}
								addresslist.add(attrValueObj.toString());
								pe.getAtts().put(str, addresslist);
							}else{
								pe.getAtts().put(str, attrValueObj.toString());
							}
						}
					}
				}
				resultList.put(pe.getProofeId()+"", pe);
			}
			return resultList;
		}
		return null;
	}
	
	public List<ProofEffect> getTechProofValues(Integer techImplId, String tenantId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("techImplId", techImplId);
		params.put("tenantId", tenantId);
		List<Map<String,String>> resultMapList = sqlSessionTemplate.selectList("loadCommon.getTechImplProofEffect", params);
		
		if(resultMapList!=null && resultMapList.size()>0){
			
			List<ProofEffect> resultList = new ArrayList<ProofEffect>();
			List<String> prIdList = new ArrayList<String>();
			for (Map<String, String> map : resultMapList) {
				Object piObj = map.get("PROOFE_ID");
				
				if(piObj != null && !prIdList.contains(piObj.toString())) {
					
					prIdList.add(piObj.toString());
					
					ProofEffect pe =  new ProofEffect();
					for (Map<String, String> map2 : resultMapList) {
						
						Object piObj2 = map2.get("PROOFE_ID");
						
						if(piObj2 != null && piObj.toString().equals(piObj2.toString())) {
							
							pe.setProofeId(Integer.parseInt(piObj2.toString()));
							pe.setProofCode(map2.get("PT_CODE"));
							pe.setStatus(map2.get("STATUS"));
							String attrValue = map2.get("ATTR_VALUE");
							String attrSpecCode = map2.get("ATTR_SPEC_CODE");
							
							pe.getAtts().put(attrSpecCode, attrValue);
						}
						
					}
					
					resultList.add(pe);
				}
			}
			return resultList;
		}
		
		return null;
	}

	public MessageFlow getMessageFlow(String messageflowId, String tenantId){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("messageflowId", messageflowId);
		params.put("tenantId", tenantId);
		List<Map<String,String>> msgFlowMaps = sqlSessionTemplate.selectList("loadCommon.getFlowByFlowID", params);
		if(msgFlowMaps!=null && msgFlowMaps.size()>0){
			Map<String ,String > msgFlowMap = msgFlowMaps.get(0);
			MessageFlow messageFlow = new MessageFlow();
			messageFlow.setMessageFlowId(Double.valueOf(messageflowId).intValue());
			messageFlow.setMessageFlowName(msgFlowMap.get("MESSAGE_FLOW_NAME"));
			messageFlow.setFirstEndpointId(ObjtoInt(msgFlowMap.get("FIRST_ENDPOINT_ID")));
			//init firstEndpoint
			messageFlow.setFirstEndpoint(this.getEndpoint(ObjtoInt(msgFlowMap.get("FIRST_ENDPOINT_ID")), tenantId));
			//init route configure
			messageFlow.setRouteConfigList(this.getServiceRouteConfig(messageFlow.getMessageFlowId()+"", tenantId));
			//init route condition
			this.buildServiceRouteCondition(messageFlow, tenantId);
			//init route
			this.buildRoute(messageFlow);
			//init endpoint attr item
			this.buildEndpointAttrMap(messageFlow);
			return messageFlow;
		}
		return null;
	}

	@Override
	public List<SerInvokeIns> getSerInvokeIns(String tenantId) {
		List<Map<String,String>> resultMap = null;
		Map<String,String> paramMap = new HashMap<String, String>();
		paramMap.put("tenantId", tenantId);
		resultMap = sqlSessionTemplate.selectList("loadCommon.getSerInvokeInsAndService",paramMap);
		List<SerInvokeIns> serInvokeInsList = new ArrayList<SerInvokeIns>();
		for (Map<String, String> map : resultMap) {
			SerInvokeIns serInvokeIns = new SerInvokeIns();
			serInvokeIns.setComponentId(ObjtoString(map.get("COMPONENT_ID")));
			serInvokeIns.setSerInvokeInsName(map.get("SER_INVOKE_INS_NAME"));
			serInvokeIns.setSerInvokeInsId(ObjtoInt(map.get("SER_INVOKE_INS_ID")));
			serInvokeIns.setServiceId(ObjtoInt(map.get("SERVICE_ID")));
			serInvokeIns.setComponentCode(ObjtoString(map.get("CODE")));
			serInvokeIns.setState(ObjtoString(map.get("STATE")));
			serInvokeIns.setLogLevel(ObjtoString(map.get("LOG_LEVEL")));
			serInvokeIns.setAuthExpress(ObjtoString(map.get("AUTH_EXPRESS")));
			
			List<Auth> auths = this.getAuth(serInvokeIns.getSerInvokeInsId(),tenantId);
			serInvokeIns.setAuths(auths);
			
			if(map.get("SERVICE_ID") != null) {
				List<Service> service = this.getService(ObjtoInt(map.get("SERVICE_ID")), tenantId);
				if(service!=null &&service.size()>0){
					serInvokeIns.setService(service.get(0));
				}
			}
			Object msgFlowId = map.get("MESSAGE_FLOW_ID");
			if(msgFlowId!=null){
				String msgflowidstr = msgFlowId.toString();
				serInvokeIns.setMessageFlow(getMessageFlow(msgflowidstr, tenantId));
			}
			serInvokeInsList.add(serInvokeIns);
		}
		return serInvokeInsList;
	}
	
	
	
	public List<Auth> getAuth(Integer SerInvokeInsId,String tenantId) {
		Map<String,String> paramMap = new HashMap<String, String>();
		paramMap.put("tenantId", tenantId);
		paramMap.put("SerInvokeInsId", SerInvokeInsId+"");
		List<Map<String,String>> resultList = sqlSessionTemplate.selectList("loadCommon.getAuth",paramMap);
		if(resultList!=null && resultList.size()>0){
			List<Auth> auths = new ArrayList<Auth>();
			for (Map<String, String> map : resultList) {
				Auth auth = new Auth();
				auth.setAuthFormula(map.get("AUTH_FORMULA")==null?null:map.get("AUTH_FORMULA").toString());
				auth.setAuthId(ObjtoInt(map.get("AUTH_ID")));
				auth.setAuthObjOp(map.get("AUTH_OBJ_OP")==null?null:map.get("AUTH_OBJ_OP").toString());
				auth.setAuthObjType(map.get("AUTH_OBJ_TYPE")==null?null:map.get("AUTH_OBJ_TYPE").toString());
				auth.setReqOrRsp(map.get("REQ_OR_RSP")==null?null:map.get("REQ_OR_RSP").toString());
				auth.setState(map.get("STATE")==null?null:map.get("STATE").toString());
				if(map.get("AUTH_PATH")!=null){
					AuthObj authObj = new AuthObj();
					authObj.setAuthObjId(ObjtoInt(map.get("AUTH_OBJ_ID")));
					authObj.setAuthPath(map.get("AUTH_PATH").toString());
					auth.setAuthObj(authObj);
				}
				
				Map<String,String> authMap = new HashMap<String, String>();
				authMap.put("tenantId", tenantId);
				authMap.put("authId",  auth.getAuthId()+"");
				
				List<Map<String,String>> attlist = sqlSessionTemplate.selectList("loadCommon.findAuthAttr", authMap);
				if(attlist!=null && attlist.size()>0){
					Map<String, Object> attrMap = new Hashtable<String, Object>();
					for (Map<String, String> resultMap : attlist) {
						attrMap.put(resultMap.get("ATTR_SPEC_CODE").toString(), resultMap.get("ATTR_VALUE").toString());
					}
					auth.setAttrMap(attrMap);
					
					
				}
				auths.add(auth);
			}
			return auths;
		}
		return null;
	}
	
	
	private void buildServiceRouteCondition(MessageFlow  service, String tenantId){
		if(service.getRouteConfigList()!=null && service.getRouteConfigList().length >0){
			for(ServiceRouteConfig config: service.getRouteConfigList()){
				if(RoutePolicy.CONTENT_BASED.equals(config.getRoutePolicy().getRuleStrategyCode())){
					config.getRoutePolicy().setRouteCondition(getTreeRouteConditionById(config.getRoutePolicy().getRouteCondId(), tenantId));
				}
			}
		}
	}
	
public List<RouteCondition> findAllRouteConditionById(Integer routeCondId, String tenantId) {
    	List<Map<String,Object>> list = null;
    	List<Map<String,Object>> orderedList=new ArrayList<Map<String,Object>> ();
    	Map<String, Object> params = new HashMap<String, Object>();
		params.put("routeCondId", routeCondId);
		params.put("tenantId", tenantId);
		list =sqlSessionTemplate.selectList("loadCommon.findAllRouteConditionById", params);
		orderAllRouteCondition(list,orderedList, tenantId);
		list=orderedList;
		List<RouteCondition> routeConditionList = new ArrayList<RouteCondition>();
		if(list!=null && list.size()>0){
			for (Map<String, Object> map : list) {
				RouteCondition routeCondition = new RouteCondition();
				routeCondition.setRouteCondId(ObjtoInt(map.get("ROUTE_COND_ID")));
				routeCondition.setUpRouteCondId(ObjtoInt(map.get("UP_ROUTE_COND_ID")));
				routeCondition.setGetValueExprId(ObjtoInt(map.get("GET_VALUE_EXPR_ID")));
				routeCondition.setOperatorId(ObjtoInt(map.get("OPERATOR_ID")));
				if(map.get("OPERATOR_CODE")!=null){
					routeCondition.setOperatorCode(map.get("OPERATOR_CODE").toString());
				}
				if(map.get("MATCH_VALUE")!=null){
					routeCondition.setMatchValue(map.get("MATCH_VALUE").toString());
				}
				routeCondition.setCondRelation(map.get("COND_RELATION")==null?null:map.get("COND_RELATION").toString());
				routeConditionList.add(routeCondition);
			}
		}
		return routeConditionList;
	}

	public void orderAllRouteCondition(List<Map<String,Object>> sourceList,List<Map<String,Object>> orderedList, String tenantId){
		List<Map<String,Object>> childList=new ArrayList<Map<String,Object>> ();
		if(null!=sourceList&&sourceList.size()>0){
			for(Map<String, Object> map : sourceList){
				orderedList.add(map);
			}
			for(Map<String, Object> map : sourceList){
				String routeId=ObjtoString(map.get("ROUTE_COND_ID"));
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("routeId", routeId);
				params.put("tenantId", tenantId);
				List<Map<String,Object>> allRouteCondition = sqlSessionTemplate.selectList("loadCommon.findAllRouteConditionByUpId", params);
				childList.addAll((Collection<? extends Map<String, Object>>) allRouteCondition);
			}	
			orderAllRouteCondition(childList, orderedList, tenantId);
		}
	}

	public RouteCondition getTreeRouteConditionById(Integer routeCondId, String tenantId) {
    	List<RouteCondition> list = findAllRouteConditionById(routeCondId, tenantId);
    	for(RouteCondition cond: list){
    		if(cond.getGetValueExprId()!= null){
    			cond.setGetValueExpr(getTreeExprById(cond.getGetValueExprId(), tenantId));
    		}
    	}
    	RouteCondition routeCond = null;    	
    	if(!list.isEmpty()){
    		routeCond = list.get(0);
    		if(!(routeCond.getRouteCondId().intValue()==routeCondId.intValue())){
    			for(RouteCondition cond: list){    	    		
    	    		if(routeCondId.intValue()==cond.getRouteCondId().intValue()){
    	    			routeCond = cond;
    	    			break;
    	    		}
    			}
    		}
    		routeCond.setChildRouteConditions(getChildRouteCondition(list, routeCond.getRouteCondId(), tenantId));
    	}
    	return routeCond;
    }

	private List<RouteCondition> getChildRouteCondition(List<RouteCondition> list, Integer routeCondId, String tenantId){
		List<RouteCondition> condList = new ArrayList<RouteCondition>();
		for(int i=0; i<list.size(); i++){  
			RouteCondition cond = list.get(i);
			if(routeCondId.intValue()==cond.getUpRouteCondId()) {
				condList.add(cond); 
				cond.setChildRouteConditions(getChildRouteCondition(list, cond.getRouteCondId(), tenantId));
			}
		}
		return condList;
	}

	public List<GetValueExpr> findAllExprById(Integer exprId, String tenantId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("exprId", exprId);
		params.put("tenantId", tenantId);
		List<Map<String,Object>> resultList = sqlSessionTemplate.selectList("loadCommon.findAllExprById", params);
		List<Map<String,Object>> orderedList=new ArrayList<Map<String,Object>> ();
		orderAllExpr(resultList,orderedList, tenantId);
		resultList=orderedList;
		if(resultList!=null && resultList.size()>0){
			List<GetValueExpr> getValueExprList = new ArrayList<GetValueExpr>();
			for (Map<String, Object> map : resultList) {
				GetValueExpr getValueExpr = new GetValueExpr();
				getValueExpr.setCondEvaluatorCode(map.get("COND_EVALUATOR_CODE").toString());
				getValueExpr.setCondEvaluatorId(Integer.valueOf(map.get("COND_EVALUATOR_ID").toString()));
				getValueExpr.setExprId(exprId);
				getValueExpr.setUpExprId(ObjtoInt(map.get("UP_EXPR_ID")));
				getValueExpr.setExpr(map.get("EXPR").toString());
				getValueExpr.setReqRsp(ObjtoString(map.get("REQ_RSP")));
				getValueExpr.setExprType(ObjtoString(map.get("EXPR_TYPE")));
				List<XmlNameSpace> xmlNameSpace = findNameSpaceByExprId(exprId.toString(), tenantId);
				getValueExpr.setXmlNameSpace(xmlNameSpace);
				getValueExprList.add(getValueExpr);
			}
			return getValueExprList;
		}else{
			return null;
		}
	}
	
	public void orderAllExpr(List<Map<String,Object>> sourceExpr,List<Map<String,Object>> orderedList, String tenantId){
		List<Map<String,Object>> childList=new ArrayList<Map<String,Object>> ();
		if(null!=sourceExpr&&sourceExpr.size()>0){
			for(Map<String, Object> map : sourceExpr){
				orderedList.add(map);
			}
			for(Map<String, Object> map : sourceExpr){
				int exprId=ObjtoInt(map.get("ROUTE_COND_ID"));
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("exprId", exprId);
				params.put("tenantId", tenantId);
				List<Map<String,Object>> allExpr = sqlSessionTemplate.selectList("loadCommon.findAllExprByUpExprId", params);
				childList.addAll((Collection<? extends Map<String, Object>>) allExpr);
			}	
			orderAllExpr(childList,orderedList, tenantId);
		}
	}

	private List<XmlNameSpace> findNameSpaceByExprId(String exprId, String tenantId){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("exprId", exprId);
		params.put("tenantId", tenantId);
		List<Map<String,Object>> resultList = sqlSessionTemplate.selectList("loadCommon.get0020", params);
		if(resultList!=null && resultList.size()>0){
			List<XmlNameSpace> xmlNameSpaceList = new ArrayList<XmlNameSpace>();
			for (Map<String, Object> map : resultList) {
				XmlNameSpace xmlNameSpace = new XmlNameSpace();
				xmlNameSpace.setNameSpaceDesc(map.get("NAME_SPACE_DESC").toString());
				xmlNameSpace.setNameSpaceUri(map.get("NAME_SPACE_URI").toString());
				xmlNameSpace.setNameSpacePrefix(map.get("NAME_SPACE_PREFIX").toString());
				xmlNameSpace.setNameSpaceId(Integer.valueOf(map.get("NAME_SPACE_ID").toString()));
				xmlNameSpaceList.add(xmlNameSpace);
			}
			return xmlNameSpaceList;
		}else{
			return null;
		}
	}

	public GetValueExpr getTreeExprById(Integer exprId, String tenantId) {
		GetValueExpr record = null;		
		List<GetValueExpr> list = findAllExprById(exprId, tenantId);    
		if(list!=null){
	    	for(Object obj: list){
	    		GetValueExpr expr = (GetValueExpr)obj;
	    		buildNameSpaceMap(expr);
	    	}
	    	if(!list.isEmpty()){
	    		record = (GetValueExpr)list.get(0);
	    		if(!(record.getExprId().intValue()==exprId.intValue())){
	    			for(Object obj: list){
	    	    		GetValueExpr expr = (GetValueExpr)obj;
	    	    		if(exprId.intValue()==expr.getExprId().intValue()){
	    	    			record = expr;
	    	    			break;
	    	    		}
	    			}
	    		}
	    		record.setChildExpr(getChildExpr(list, record.getExprId()));
	    	}
		}
	    return record;
	}
	
	private GetValueExpr getChildExpr(List<GetValueExpr> list, Integer exprId){
    	GetValueExpr getValueExpr = null;
    	for(Object obj: list){
    		GetValueExpr expr = (GetValueExpr)obj;
    		if(exprId.intValue()==expr.getUpExprId()) {    			
    			expr.setChildExpr(getChildExpr(list, expr.getExprId()));
    			getValueExpr = expr;
    			break;
    		}
    	}
    	return getValueExpr;
	}
	
	private void buildNameSpaceMap(GetValueExpr expr){
    	if(expr.getXmlNameSpace()!=null){
    		if(!expr.getXmlNameSpace().isEmpty()){
        		Map<String, String> map = new HashMap<String, String>();
    	    	for(XmlNameSpace ns : expr.getXmlNameSpace()){
    	    		map.put(ns.getNameSpacePrefix(), ns.getNameSpaceUri());
    	    	}
    	    	expr.setNameSpaceMap(map);
    	    	expr.setXmlNameSpace(null);	    	
        	}
    	}
    }
	
		
	private String getDataType(int dateTypeId){
		return (String)sqlSessionTemplate.selectOne("loadCommon.getDataType",dateTypeId);
	}
	
	/************************************mySql level******************************************/
	static int level = 0;
	private void getLevel(String routeId,Map<String, Object> levelMap){
		if(levelMap.get(routeId) == null){
			level = level + 1;
			 return;
	    }else{
	    	String upRouteId = levelMap.get(routeId).toString();
	    	level = level + 1;
	    	getLevel(upRouteId,levelMap);
	    }
	}
	
	private int getRouteLevel(String routeId,Map<String, Object> levelMap){
	    level = 0;
		getLevel(routeId,levelMap);
		return level;
	}
	/************************************mySql level******************************************/

	
	private ServiceRouteConfig[] getServiceRouteConfig(String msgFlowid, String tenantId){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("msgFlowid", msgFlowid);
		params.put("tenantId", tenantId);
		List<Map<String,Object>> list = sqlSessionTemplate.selectList("loadCommon.getServiceRouteConfig", params);
		Map<String, Object> levelMap = new HashMap<String, Object>();
		if(list!=null){
			for (Map<String, Object> map : list) {
				if(map.get("LEVEL") == null){
					levelMap.put(map.get("ROUTE_ID").toString(), map.get("UP_ID"));
				}
			}
		}
		if(list!=null){
			ServiceRouteConfig[] srcs = new ServiceRouteConfig[list.size()];
			int i = 0;
			for (Map<String, Object> map : list) {
				
				ServiceRouteConfig serviceRouteConfig = new ServiceRouteConfig();
				if(map.get("LEVEL") == null ){
					serviceRouteConfig.setLevel(this.getRouteLevel(map.get("ROUTE_ID").toString(), levelMap));
				}else{
					serviceRouteConfig.setLevel(Integer.valueOf(map.get("LEVEL").toString()));
				}
				serviceRouteConfig.setMessageFlowId(Integer.valueOf(msgFlowid));
				serviceRouteConfig.setSynAsyn(map.get("SYN_ASYN").toString());
				serviceRouteConfig.setState(map.get("STATE").toString());
				Object routeid = map.get("ROUTE_ID");
				String routeidstr = routeid.toString();
				serviceRouteConfig.setRouteId(Double.valueOf(routeidstr).intValue());
				int fromendpointId = ObjtoInt(map.get("FROM_ENDPOINT_ID"));
				int toendpointId = ObjtoInt(map.get("TO_ENDPOINT_ID"));
				Object routeidobj = map.get("ROUTE_POLICY_ID");
				String routeidstr2 = routeidobj.toString();
				String routepoliceId = Double.valueOf(routeidstr2).intValue()+"";
				Endpoint frompoint = getEndpoint(fromendpointId, tenantId);
				Endpoint topoint = getEndpoint(toendpointId, tenantId);				
				RoutePolicy rp = findRoutePolicy(routepoliceId, tenantId);
				serviceRouteConfig.setFromEndpoint(frompoint);
				serviceRouteConfig.setToEndpoint(topoint);
				serviceRouteConfig.setRoutePolicy(rp);
				serviceRouteConfig.setFromEndpointId(Integer.valueOf(fromendpointId));
				serviceRouteConfig.setToEndpointId(Integer.valueOf(toendpointId));
				srcs[i++] = serviceRouteConfig;
			}
			return srcs;
		}else{
			return null;
		}
	}
	
	private RoutePolicy findRoutePolicy(String routePolicyId, String tenantId){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("routePolicyId", routePolicyId);
		params.put("tenantId", tenantId);
		List<Map<String,Object>> list = sqlSessionTemplate.selectList("loadCommon.findRoutePolicy", params);
		if(list!=null &&list.size()>0){
			RoutePolicy routePolicy = new RoutePolicy();
			Map<String,Object> map = list.get(0);
			routePolicy.setRouteCondId(ObjtoInt(map.get("ROUTE_COND_ID")));
			routePolicy.setRoutePolicyId(ObjtoInt(map.get("ROUTE_POLICY_ID")));
			routePolicy.setRuleStrategyCode(map.get("RULE_STRATEGY_CODE").toString());
			routePolicy.setRuleStrategyId(ObjtoInt(map.get("RULE_STRATEGY_ID")));
			return routePolicy;
		}else{
			return null;
		}
	}
	
	public Endpoint getEndpoint(int endpointId, String tenantId){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("endpointId", endpointId);
		params.put("tenantId", tenantId);
		List<Map<String,Object>> endpoints = sqlSessionTemplate.selectList("loadCommon.getEndpoint", params);
		if(endpoints!=null && endpoints.size()>0){
			Map<String,Object> map = endpoints.get(0);
			Endpoint endpoint = new Endpoint();
			endpoint.setEndpointName(map.get("ENDPOINT_NAME").toString());
			endpoint.setEndpointSpecCode(map.get("ENDPOINT_SPEC_CODE").toString());
			endpoint.setEndpointSpecEnableLog(map.get("ENABLE_LOG")==null?null:map.get("ENABLE_LOG").toString());
			endpoint.setEndpointId(Integer.valueOf(endpointId));
			if(map.get("IN_DATA_TYPE_ID")!=null){
				endpoint.setInDataTypeCode(getDataType(ObjtoInt(map.get("IN_DATA_TYPE_ID"))));
			}
			if(map.get("OUT_DATA_TYPE_ID")!=null){
				endpoint.setOutDataTypeCode(getDataType(ObjtoInt(map.get("OUT_DATA_TYPE_ID"))));
			}
			if(map.get("ENDPOINT_ID")!=null){
				endpoint.setEndpointId(Integer.valueOf(map.get("ENDPOINT_ID").toString()));
			}
			endpoint.setEnableInTrace(map.get("ENABLE_IN_TRACE")==null?null:map.get("ENABLE_IN_TRACE").toString());
			endpoint.setEnableOutTrace(map.get("ENABLE_OUT_TRACE")==null?null:map.get("ENABLE_OUT_TRACE").toString());
			endpoint.setEnableInLog(map.get("ENABLE_IN_LOG")==null?null:map.get("ENABLE_IN_LOG").toString());
			endpoint.setEnableOutLog(map.get("ENABLE_OUT_LOG")==null?null:map.get("ENABLE_OUT_LOG").toString());
			List<EndpointAttr> attrs = this.findEndpointAttr(endpointId, tenantId);
			endpoint.setEndpointAttrList(attrs);
			return endpoint;
		}
		return null;
	}
	
	
	private List<EndpointAttr> findEndpointAttr(int endpointId, String tenantId){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("endpointId", endpointId);
		params.put("tenantId", tenantId);
		List<Map<String,Object>> list = sqlSessionTemplate.selectList("loadCommon.getEndpointAttr", params);
		if(list!=null){
			List<EndpointAttr> endpointattrs = new ArrayList<EndpointAttr>();
			for (Map<String, Object> map : list) {
				EndpointAttr endpointAttr = new EndpointAttr();
				endpointAttr.setEndpointAttrValueId(Integer.valueOf(map.get("ENDPOINT_ATTR_VALUE_ID").toString()));
				endpointAttr.setEndpointId(Integer.valueOf(map.get("ENDPOINT_ID").toString()));
				endpointAttr.setAttrValue(map.get("ATTR_VALUE")==null?null:map.get("ATTR_VALUE").toString());
				endpointAttr.setEndpointSpecId(Integer.valueOf(map.get("ENDPOINT_SPEC_ID").toString()));
				endpointAttr.setEndpointSpecAttrId(Integer.valueOf(map.get("ENDPOINT_SPEC_ATTR_ID").toString()));
				endpointAttr.setAttrSpecId(Integer.valueOf(map.get("ATTR_SPEC_ID").toString()));
				endpointAttr.setAttrSpecName(map.get("ATTR_SPEC_NAME").toString());
				endpointAttr.setAttrSpecCode(map.get("ATTR_SPEC_CODE").toString());
				endpointAttr.setNullable(Boolean.valueOf(map.get("NULLABLE").toString()));
				endpointAttr.setUpAttrSpecId(map.get("UP_ATTR_SPEC_ID")==null?null:Integer.valueOf(map.get("UP_ATTR_SPEC_ID").toString()));
				endpointattrs.add(endpointAttr);
			}
			return endpointattrs;
		}else{
			return null;
		}
	}
	
	private  Contract getContract(String contractId, String tenantId){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("contractId", contractId);
		paramMap.put("tenantId", tenantId);
		List<Map<String,String>> resultMap = sqlSessionTemplate.selectList("loadCommon.getContract",paramMap);
		if(resultMap!=null && resultMap.size()>0){
			Map<String,String> map = resultMap.get(0);
			Contract contract = new Contract();
			contract.setCode(map.get("CODE").toString());
			return contract;
		}
		return null;
	}
	
	public List<Service> getService(Integer serviceId, String tenantId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("serviceId", serviceId);
		paramMap.put("tenantId", tenantId);
		List<Map<String,String>> resultMap = sqlSessionTemplate.selectList("loadCommon.getAllService",paramMap);
		List<Service> resultList = new ArrayList<Service>();
		for (Map<String, String> map : resultMap) {
			ContractVersion cv = new ContractVersion();
			cv.setVersion(map.get("VERSION").toString());
			Contract ca = this.getContract(ObjtoInt(map.get("CONTRACT_ID"))+"", tenantId);
			cv.setContract(ca);
			Service s = new Service();
			s.setServiceCnName(map.get("SERVICE_CN_NAME"));
			s.setServiceId(ObjtoInt(map.get("SERVICE_ID")));
			s.setServiceCode(map.get("SERVICE_CODE").toString());
			s.setServiceVersion(map.get("SERVICE_VERSION").toString());
			s.setState(map.get("STATE").toString());
			s.setContractVersion(cv);
			List<Map<String,String>> busCodeMap = sqlSessionTemplate.selectList("loadCommon.getFunctionCode", paramMap);
			if(busCodeMap!=null){
				for (Map<String, String> map2 : busCodeMap) {
					String busCode = map2.get("CODE").toString();
					s.setBusCode(busCode);
				}
			}
			List<Map<String,String>> relaMap = sqlSessionTemplate.selectList("loadCommon.getServiceRela", paramMap);
			if(relaMap!=null && relaMap.size()>0){
				ServiceRela serviceRela = new ServiceRela();
				for (Map<String, String> map3 : relaMap) {
					Object regObj = map3.get("REG_SERVICE_ID");
					String strObj = regObj.toString();
					serviceRela.setOpenServiceId(Double.valueOf(strObj).intValue());
					s.setRelaService(getService(Double.valueOf(strObj).intValue(),tenantId).get(0));
					s.setServiceRelaType(map3.get("SER_RELA_TYPE"));
				}
			}
			resultList.add(s);
		}
		return resultList;
	}
	
	private Map<String, String> getTechAttr(int techId, String tenantId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("techId", techId);
		paramMap.put("tenantId", tenantId);
		List<Map<String, String>> resultList = sqlSessionTemplate.selectList("loadCommon.getTechAttr", paramMap);
		if (resultList != null && resultList.size() > 0) {
			Map<String, String> attrMap = new Hashtable<String, String>();
			for (Map<String, String> map : resultList) {
				attrMap.put(map.get("ATTR_SPEC_CODE"), map .get("ATTR_SPEC_VALUE") == null ? "" : map.get("ATTR_SPEC_VALUE").toString());
			}
			return attrMap;
		}
		return null;
	}

public List<TechImpl> getTechImpl(String tenantId) {
		List<Map<String,Object>> resultList = sqlSessionTemplate.selectList("loadCommon.getTechImpl",tenantId);
		if(resultList!=null && resultList.size()>0){
			List<TechImpl> tis = new ArrayList<TechImpl>();
			for (Map<String, Object> map : resultList) {
				TechImpl ti = new TechImpl();
				ti.setTechImplId(Double.valueOf(map.get("TECH_IMPL_ID").toString()).intValue());
				ti.setTechImplName(map.get("TECH_IMPL_NAME")==null?null:map.get("TECH_IMPL_NAME").toString());
				if(map.get("COMM_PRO_CD")!=null){
					ti.setCommProCd(map.get("COMM_PRO_CD").toString());
				}
				if(map.get("COMPONENT_ID") != null) {
					ti.setComponentId(map.get("COMPONENT_ID").toString());
				}
				if(map.get("USEALBE_STATE") != null) {
					ti.setUsealbeState(map.get("USEALBE_STATE").toString());
				}
				if(map.get("SER_TECH_IMPL_ID") != null) {
					ti.setSerTechId(Double.valueOf(map.get("SER_TECH_IMPL_ID").toString()).intValue());
				}
				if(map.get("SERVICE_ID") != null) {
					ti.setServiceId(Double.valueOf(map.get("SERVICE_ID").toString()).intValue());
				}
				List<Service>  ss= this.getService(ti.getServiceId(), tenantId);
				if(ss!=null&&ss.size()>0){
					ti.setService(ss.get(0));
				}
				ti.setSerTechStatus(map.get("SER_TECH_STATE").toString());
				ti.setServiceCode(map.get("SERVICE_CODE").toString());
				ti.setServiceVersion(map.get("SERVICE_VERSION").toString());
				ti.setComponentCode(map.get("CODE").toString());
				if(map.get("TECH_IMP_CON_PO_ID")!=null){
					ti.setTechImpConPoId(Double.valueOf(map.get("TECH_IMP_CON_PO_ID").toString()).intValue());
					ti.setTico(getTicp(ti.getTechImpConPoId(),ti.getTechImplId(), tenantId));
				}
				ti.setAttrMap(getTechAttr(ti.getTechImplId(), tenantId));
				ti.setCtls(getCtlCounter(ti.getTechImplId(), tenantId));
				ti.setTechImplNode(this.getTechImplNode(ti.getTechImplId(), tenantId));
				
				ti.setProofEffectList(this.getTechProofValues(ti.getTechImplId(), tenantId));
				tis.add(ti);
			}
			return tis;
		}
		return null;
	}
	
	
	public List<TechImplNode> getTechImplNode(int techImplId, String tenantId){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("techImplId", techImplId);
		paramMap.put("tenantId", tenantId);
		List<Map<String,String>> resultList = sqlSessionTemplate.selectList("loadCommon.techImplNode", paramMap);
		if(resultList!=null && resultList.size()>0){
			List<TechImplNode> tcps = new ArrayList<TechImplNode>();
			
			
			for (Map<String, String> map : resultList) {
				TechImplNode tcp = new TechImplNode();
				tcp.setTechImplNodeId(ObjtoInt(map.get("TECH_IMPL_NODE_ID")));
				tcp.setTechImplId(techImplId);
				tcp.setNodeHost(map.get("NODE_HOST").toString());
				tcp.setNodeIp(map.get("NODE_IP"));
				tcp.setNodePort(map.get("NODE_PORT"));
				tcp.setRouteExpr(map.get("TECH_ROUTE_EXPR"));
				tcps.add(tcp);
			}
			log.debug("techImplId"+techImplId+tcps.size());
			return tcps;
		}
		return null;
	}

	public TechImpContralPo getTicp(int ticpId,int techImplId, String tenantId){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("ticpId", ticpId);
		paramMap.put("tenantId", tenantId);
		List<Map<String,String>> resultList = sqlSessionTemplate.selectList("loadCommon.getTicp", paramMap);
		if(resultList!=null && resultList.size()>0){
			TechImpContralPo tcp = new TechImpContralPo();
			Map<String, String> map = resultList.get(0);
			tcp.setConAction(map.get("CON_ACTION").toString());
			tcp.setConCycle(map.get("CON_CYCLE").toString());
			tcp.setConState(map.get("CON_STATE").toString());
			tcp.setConType(map.get("CON_TYPE").toString());
			tcp.setConCycleValue(ObjtoInt(map.get("CON_CYCLE_VALUE")));
			tcp.setConVl(ObjtoInt(map.get("CON_VL")));
			tcp.setState(map.get("STATE").toString());
			tcp.setUsableMonitorConf(getUsable(ticpId, techImplId, tenantId));
			tcp.setTechImpl(techImplId);
			return tcp;
		}
		return null;
	}
	
	public  List<App> getApp(String tenantId) {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("tenantId", tenantId);
		List<Map<String,Object>> resultList = sqlSessionTemplate.selectList("loadCommon.getApp",paramMap);
		if(resultList!=null){
			List<App> apps = new ArrayList<App>();
			for (Map<String, Object> map : resultList) {
				App app = new App();
				app.setAppName(map.get("APP_NAME")==null?null:map.get("APP_NAME").toString());
				app.setComponentId(map.get("COMPONENT_ID")==null?null:map.get("COMPONENT_ID").toString());
				app.setAppkey(map.get("APPKEY")==null?null:map.get("APPKEY").toString());
				app.setAppDesc(map.get("APP_DESC")==null?null:map.get("APP_DESC").toString());
				app.setAppsecure(map.get("APPSECURE")==null?null:map.get("APPSECURE").toString());
				app.setAppOauthType(map.get("APP_OAUTH_TYPE")==null?null:map.get("APP_OAUTH_TYPE").toString());
				app.setAppCallbackUrl(map.get("APP_CALLBACK_URL")==null?null:map.get("APP_CALLBACK_URL").toString());
				app.setAppSumma(map.get("APP_SUMMA")==null?null:map.get("APP_SUMMA").toString());
				app.setTokenEnableTime(ObjtoInt(map.get("TOKEN_ENABLE_TIME")));
				app.setComponentCode(map.get("CODE")==null?null:map.get("CODE").toString());
				if(app.getTokenEnableTime()==0){
					app.setTokenEnableTime(Integer.valueOf(tokenEnableTime));
				}
				Object appObj = map.get("APP_ID");
				String appStr = appObj.toString();
				app.setAppId(Double.valueOf(appStr).intValue());
				apps.add(app);
			}
			return apps;
		}
		return null;
	}
	
	public List<CtlCounterms2Comp> getCtlCounter(Integer techId, String tenantId) {
		if(techId!=null){
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("techId", techId);
			paramMap.put("tenantId", tenantId);
			List<Map<String,String>> resultList = sqlSessionTemplate.selectList("loadCommon.getCtlCounter", paramMap);
			if(resultList!=null && resultList.size()>0){
				List<CtlCounterms2Comp> ctls = new ArrayList<CtlCounterms2Comp>();
				for (Map<String, String> map : resultList) {
					CtlCounterms2Comp ct = new CtlCounterms2Comp();
					Object appObj = map.get("CUTMS_VALUE");
					String appObjStr = appObj.toString();
					ct.setCutmsValue(Double.valueOf(appObjStr).intValue());
					ct.setCycleType(map.get("CYCLE_TYPE").toString());
					Object cyO = map.get("CYCLE_VALUE");
					String cyStr = cyO.toString();
					ct.setCycleValue(Double.valueOf(cyStr).intValue());
					ct.setEffectState(map.get("EFFECT_STATE").toString());
					Object ccObj = map.get("CC_CD");
					String ccStr = ccObj.toString();
					ct.setCcCd(Double.valueOf(ccStr).intValue());
					ctls.add(ct);
				}
				return ctls;
			}
		}
		return null;
	}
	
	public List<UsableMonitorConf> getUsable(int techPoId,int techImplId, String tenantId){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("techPoId", techPoId);
		paramMap.put("techImplId", techImplId);
		paramMap.put("tenantId", tenantId);
		List<Map<String,String>> resultList = sqlSessionTemplate.selectList("loadCommon.getUsable", paramMap);
		if(resultList!=null && resultList.size()>0){
			List<UsableMonitorConf> umcs = new ArrayList<UsableMonitorConf>();
			for (Map<String, String> map : resultList) {
				UsableMonitorConf umc = new UsableMonitorConf();
				umc.setState(map.get("STATE").toString());
				umc.setXmlMsg(map.get("XML_MSG").toString());
				umc.setUtCd(ObjtoInt(map.get("UT_CD")));
				umc.setTechImpConPoId(techPoId);
				umc.setTechImplId(techImplId);
				umcs.add(umc);
			}
			return umcs;
		}
		return null;
	}
	
	

	public Map<String, Object> loadDataSourceRoute(String tenantId) {
		Map<String, Object> dataSourceRouteMap = new Hashtable<String,Object>();
		List<Map<String,Object>> list  = sqlSessionTemplate.selectList("loadCommon.loadDataSourceRoute", tenantId);
		Iterator<Map<String, Object>> it = list.iterator();
		while(it.hasNext()){
			Map<String, Object> map = (Map<String, Object>)it.next();
			String decisionRule = (String)map.get("DECISION_RULE");
			Expr expr = ExprUtil.createExpr(decisionRule); 
			map.put("EXPR", expr);
		}
		dataSourceRouteMap.put("dataSourceRouteList", list);
		list = sqlSessionTemplate.selectList("loadCommon.getDataRource", tenantId);
		dataSourceRouteMap.put("dataSourceList", list);
		Map<String, Object> dataSourceMap = new ConcurrentHashMap<String, Object>();
		it = list.iterator();
		while(it.hasNext()){
			Map<String, Object> map = (Map<String, Object>)it.next();
			String dsName = (String)map.get("DATA_SOURCE_NAME");
			dataSourceMap.put(dsName, map);
		}
		dataSourceRouteMap.put("dataSourceMap", dataSourceMap);
		return dataSourceRouteMap;
	}

	public List<Component> getComponentList(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getComponent", tenantId);
	}

	public List<BizFunction> getBusCodeList(String tenantId) {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("tenantId", tenantId);
		return sqlSessionTemplate.selectList("loadCommon.getBusCode", paramMap);
	}

	public List<Org> getOrgList(String tenantId) {
		return sqlSessionTemplate.selectList("loadCommon.getAllOrg", tenantId);
	}
	
	public void buildRoute(MessageFlow messageFlow){
		Endpoint firstPoint = null;
		RouteEndpoint firstRouteEndpoint = new RouteEndpoint();
		if(messageFlow.getRouteConfigList().length<1){
			return;
		}
		firstPoint = messageFlow.getFirstEndpoint();
		for(ServiceRouteConfig config : messageFlow.getRouteConfigList()){
			if(config.getLevel().intValue() == ServiceRouteConfig.ROOT_LEVEL){
				firstPoint = config.getFromEndpoint();
				break;
			}
		}		
		firstRouteEndpoint.setCurrentEndpoint(firstPoint);	
		int count = 0;
		buildRoute(messageFlow, firstRouteEndpoint, count);
		messageFlow.setFirstRouteEndpoint(firstRouteEndpoint);
	}

	private void buildEndpointAttrMap(Endpoint endpoint){
		Map<String, Object> attrMap = new HashMap<String, Object>();
		for(EndpointAttr attr: endpoint.getEndpointAttrList()){			
			if(DataType.STRING.equalsIgnoreCase(attr.getDataTypeCode())){
				attrMap.put(attr.getAttrSpecCode(), attr.getAttrValue());
			}else if(DataType.INT.equalsIgnoreCase(attr.getDataTypeCode())){
				Integer intValue = Integer.valueOf(-9999);
				intValue = Integer.valueOf(attr.getAttrValue());
				attrMap.put(attr.getAttrSpecCode(), intValue);
			}else if(DataType.LONG.equalsIgnoreCase(attr.getDataTypeCode())){
				Long lValue = Long.valueOf(-9999);
				lValue = Long.valueOf(attr.getAttrValue());
				attrMap.put(attr.getAttrSpecCode(), lValue);
			}else if(DataType.DOUBLE.equalsIgnoreCase(attr.getDataTypeCode())){
				Double dValue = Double.valueOf(-9999);
				Double.valueOf(attr.getAttrValue());
				attrMap.put(attr.getAttrSpecCode(), dValue);
			}else {		
				attrMap.put(attr.getAttrSpecCode(), attr.getAttrValue());
			}		
		}	
		endpoint.setAttrMap(attrMap);
	}

	private void buildEndpointAttrMap(MessageFlow messageFlow){
		if(messageFlow.getFirstEndpoint() != null && messageFlow.getFirstEndpoint().getAttrMap()==null){
			buildEndpointAttrMap(messageFlow.getFirstEndpoint());
		}
		for(ServiceRouteConfig src: messageFlow.getRouteConfigList()){
			if(src.getFromEndpoint()!=null && src.getFromEndpoint().getAttrMap() == null){
				buildEndpointAttrMap(src.getFromEndpoint());
			}
			if(src.getToEndpoint()!=null && src.getToEndpoint().getAttrMap() == null){
				buildEndpointAttrMap(src.getToEndpoint());
			}
		}
	}

			
	private static void buildRoute(MessageFlow service, RouteEndpoint firstPoint, int count){
		ArrayList<ToRouteEndpoint> list = new ArrayList<ToRouteEndpoint>();
		for(ServiceRouteConfig config : service.getRouteConfigList()){
			if(firstPoint.getCurrentEndpoint()!=null && config.getFromEndpoint()!=null && firstPoint.getCurrentEndpoint().getEndpointId()==config.getFromEndpoint().getEndpointId()){
				ToRouteEndpoint tre = new ToRouteEndpoint();
				tre.setRoutePolicy(config.getRoutePolicy());	
				RouteEndpoint re = new RouteEndpoint();
				re.setCurrentEndpoint(config.getToEndpoint());
				tre.setToEndpoint(re);
				list.add(tre);
			}
		}
		count++;
		if(list.size()>0){
			firstPoint.setChildEndpoints(list);
			for(ToRouteEndpoint toEndpoint : list){	
				buildRoute(service, toEndpoint.getToEndpoint(),count);
			}
		}else{
			firstPoint.setChildEndpoints(null);	
		}
	}



	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public String getTokenEnableTime() {
		return tokenEnableTime;
	}

	public void setTokenEnableTime(String tokenEnableTime) {
		this.tokenEnableTime = tokenEnableTime;
	}
	
	

	


	@Override
	public void updateModuleVersion(String tenantId, String moduleName) {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("moduleName", moduleName);
		paramMap.put("version", (new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date()));
		paramMap.put("tenantId", tenantId);
		sqlSessionTemplate.update("loadCommon.updateModuleVersion", paramMap);
	}
	@Override
	public void insertModuleVersion(String tenantId, String moduleName) {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("moduleName", moduleName);
		paramMap.put("version", (new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date()));
		paramMap.put("tenantId", tenantId);
		paramMap.put("databaseType", String.valueOf(ZKCfgCacheHolder.PROP_ITEMS.get("databaseType")));
		sqlSessionTemplate.insert("loadCommon.insertModuleVersion", paramMap);
	}
	@Override
	public Map<String, Integer> getTranIdSeqMap() {
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("loadCommon.getTranIdSeqList", null);
		if(list==null){
			return null;
		}
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		Iterator<Map<String, Object>> it = list.iterator();
		while(it.hasNext()){
			Map<String, Object> map = (Map<String, Object>)it.next();
			if(map.get("TRANIDSEQ")!=null){
				returnMap.put(map.get("LOCALSEQ").toString() + map.get("COMPONENT_CODE").toString(), Integer.valueOf(map.get("TRANIDSEQ").toString()));
			}else{
				returnMap.put(map.get("LOCALSEQ").toString() + map.get("COMPONENT_CODE").toString(), null);
			}
		}
		return returnMap;
	}
	@Override
	public void insertServerComponentSeq(Map<String, String> paramMap) {
		sqlSessionTemplate.insert("loadCommon.insertServerComponentSeq", paramMap);
	}
	@Override
	public void updateServerComponentSeq(Map<String, String> paramMap) {
		sqlSessionTemplate.update("loadCommon.updateServerComponentSeq", paramMap);
	}
	@Override
	public Map<String, String> getServerLocalLogoMap() {
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("loadCommon.getServerLocalLogoList", null);
		if(list==null){
			return null;
		}
		Map<String, String> returnMap = new HashMap<String, String>();
		Iterator<Map<String, Object>> it = list.iterator();
		while(it.hasNext()){
			Map<String, Object> map = (Map<String, Object>)it.next();
			returnMap.put(map.get("IPPORT").toString(), map.get("LOCALSEQ").toString());
		}
		return returnMap;
	}
	@Override
	public void insertServerLocalLogo(Map<String, String> paramMap) {
		sqlSessionTemplate.insert("loadCommon.insertServerLocalLogo", paramMap);
	}
	@Override
	public void insertServerLocalSeq(int seq) {
		sqlSessionTemplate.insert("loadCommon.insertServerLocalSeq", seq);
	}
	@Override
	public void updateServerLocalSeq(int seq) {
		sqlSessionTemplate.update("loadCommon.updateServerLocalSeq", seq);
	}
	@Override
	public int getServerLocalSeq() {
		Object seq = sqlSessionTemplate.selectOne("loadCommon.getServerLocalSeq", null);
		return seq==null?-1:((Integer)seq);
	}
	private int ObjtoInt(Object obj){
		if(obj==null){
			return 0;
		}
		String routeidstr2 = obj.toString();
		return Double.valueOf(routeidstr2).intValue();
	}
	private String ObjtoString(Object obj){
		if(obj==null){
			return "";
		}
		return obj.toString();
	}
	@Override
	public List<String> getTenantIdList() {
		List<Map<String, String>> result = sqlSessionTemplate.selectList("loadCommon.getTenantIdList", null);
		if(result!=null && !result.isEmpty()){
			List<String> tenantIdList = new ArrayList<String>();
			for(Map<String, String> map : result){
				tenantIdList.add(String.valueOf(map.get("TENANT_ID")));
			}
			return tenantIdList;
		}
		return null;
	}

	@Override
	public List<Map<String, ?>> getTenants() {
		return sqlSessionTemplate.selectList("loadCommon.getTenants", null);
	}

//	@Override
//	public List<CacheObj> getCacheObj(String tenantId) {
//		Map<String, String> paramMapCacheObj = new HashMap<String, String>();
//		paramMapCacheObj.put("cacheStrategyId", cacheStragetyId);
//		List<Map<String,Object>> cacheObjListDB = sqlSessionTemplate.selectList("loadCommon.getCacheObjs", paramMapCacheObj);
//		List<CacheObj> cacheObjsReturn = new ArrayList<CacheObj>();
//		
//		for(Map<String,Object> mapCacheObj: cacheObjListDB) {
//			CacheObj cacheObj = new CacheObj();
//			cacheObj.setId(mapCacheObj.get("ID")==null?null:Integer.parseInt(mapCacheObj.get("ID").toString()));
//			cacheObj.setCode(mapCacheObj.get("CODE")+"");
//			cacheObj.setKeyRule(mapCacheObj.get("KEY_RULE")+"");
//			cacheObj.setState(mapCacheObj.get("STATE")+"");
//			cacheObj.setValuePath(mapCacheObj.get("VALUE_PATH")+"");
//			cacheObj.setCacheStrategyId(mapCacheObj.get("CACHE_STRATEGY_ID")==null?null:Integer.parseInt(mapCacheObj.get("CACHE_STRATEGY_ID").toString()));
//			cacheObj.setTenantId(mapCacheObj.get("TENANT_ID")==null?null:Integer.parseInt(mapCacheObj.get("TENANT_ID").toString()));
//			cacheObjsReturn.add(cacheObj);
//		}
//		return cacheObjsReturn;
//	}

	@Override
	public List<CacheStrategy> getCacheStragety(String tenantId) {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("tenantId", tenantId);
		List<Map<String,Object>> CacheStrategyListDB = sqlSessionTemplate.selectList("loadCommon.getCacheStrategys", paramMap);
		
		List<CacheStrategy> cacheStrategys = new ArrayList<CacheStrategy>();
		for(Map<String, Object> map: CacheStrategyListDB) {
			//缓存策略
			CacheStrategy cacheStrategy = new CacheStrategy();
			cacheStrategy.setId(map.get("ID")==null?null:Integer.parseInt(map.get("ID").toString()));
			cacheStrategy.setCode(map.get("CODE")+"");
			cacheStrategy.setName(map.get("NAME")+"");
			cacheStrategy.setCacheType(map.get("CACHE_TYPE")+"");
			cacheStrategy.setState(map.get("STATE")+"");
			cacheStrategy.setForceRefresh(map.get("FORCE_REFRESH")+"");
			cacheStrategy.setExpireTime(map.get("EXPIRE_TIME")==null?null:Integer.parseInt(map.get("EXPIRE_TIME").toString()));
			cacheStrategy.setExpireTimePath(map.get("EXPIRE_TIME_PATH")+"");
			cacheStrategy.setTenantId(map.get("TEANANT_ID")==null?null:Integer.parseInt(map.get("TEANANT_ID").toString()));
			
			//相关联的缓存对象
			Map<String, String> paramMapCacheObj = new HashMap<String, String>();
			paramMapCacheObj.put("cacheStrategyId", cacheStrategy.getId().toString());
			paramMapCacheObj.put("tenantId", tenantId);
			List<Map<String,Object>> cacheObjListDB = sqlSessionTemplate.selectList("loadCommon.getCacheObjs", paramMapCacheObj);
			List<CacheObj> cacheObjsReturn = new ArrayList<CacheObj>();
			
			for(Map<String,Object> mapCacheObj: cacheObjListDB) {
				CacheObj cacheObj = new CacheObj();
				cacheObj.setId(mapCacheObj.get("ID")==null?null:Integer.parseInt(mapCacheObj.get("ID").toString()));
				cacheObj.setCode(mapCacheObj.get("CODE")+"");
				cacheObj.setKeyRule(mapCacheObj.get("KEY_RULE")+"");
				cacheObj.setState(mapCacheObj.get("STATE")+"");
				cacheObj.setValuePath(mapCacheObj.get("VALUE_PATH")+"");
				cacheObj.setCacheStrategyId(mapCacheObj.get("CACHE_STRATEGY_ID")==null?null:Integer.parseInt(mapCacheObj.get("CACHE_STRATEGY_ID").toString()));
				cacheObj.setTenantId(mapCacheObj.get("TENANT_ID")==null?null:Integer.parseInt(mapCacheObj.get("TENANT_ID").toString()));
				cacheObjsReturn.add(cacheObj);
			}
			cacheStrategy.setCacheObjs(cacheObjsReturn);
			
			cacheStrategys.add(cacheStrategy);
		}
		return cacheStrategys;
	}


}