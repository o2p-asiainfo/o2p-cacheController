package com.asiainfo.integretion.o2p.cachecontroller.smo.impl;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.ailk.eaap.o2p.common.cache.CacheCommon;
import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.o2p.common.security.SecurityUtil;
import com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder;
import com.ailk.eaap.o2p.common.util.Constant;
import com.ailk.eaap.op2.bo.ConfProperties;
import com.ailk.eaap.op2.bo.ContractAdapterEndpoint;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractFormatEx;
import com.ailk.eaap.op2.bo.ContractNodeFuzzy;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.JdbcDataSource;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.ailk.eaap.op2.bo.NodeDescMapper;
import com.ailk.eaap.op2.bo.NodeValReq;
import com.ailk.eaap.op2.bo.ParamVarMap;
import com.ailk.eaap.op2.bo.ProofEffect;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Tenant;
import com.ailk.eaap.op2.bo.TransformerRule;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.integretion.o2p.cachecontroller.dao.ICacheDao;
import com.asiainfo.integretion.o2p.cachecontroller.dao.IDynamicJdbcDao;
import com.asiainfo.integretion.o2p.cachecontroller.dao.ITransformerRuleDao;
import com.asiainfo.integretion.o2p.cachecontroller.smo.ICacheService;
import com.asiainfo.integretion.o2p.cachecontroller.smo.ITransforCacheService;

/**
 * @author linwf
 */
@Service(value="cacheService")
public class CacheServiceImpl implements ICacheService {
	@Resource(name="cacheFactory")
	private ICacheFactory<String, Object> cacheFactory;
	@Resource(name="transformerRuleDao")
	private ITransformerRuleDao transformerRuleDao;
	@Resource(name="dynamicJdbcDao")
	private IDynamicJdbcDao dynamicJdbcDao;
	@Resource(name="cacheDao")
	private ICacheDao cacheDao;
	@Resource(name="transforCacheService")
	private ITransforCacheService transforCacheService;

	private final static Logger log = Logger.getLog(CacheCommon.class);

	@Override
	public boolean addApi(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ApiMethod", CacheKey.Api);
		map.put("ApiServiceId", CacheKey.Api);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_API, cacheDao.getApis(tenantId), dbVersion, map);
	}
	
	@Override
	public boolean addTemplate(String tenantId, String dbVersion) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("Template", CacheKey.template);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_TEMPLATE, cacheDao.getTemplate(tenantId), dbVersion, map);
	}
	
	@Override
	public boolean addApiOperation(String tenantId, String dbVersion) {
		return CacheCommon.addByMap(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_API_OPERATION_NAME, dbVersion, getApiOperationNameMap(tenantId));
	}

	@Override
	public boolean addApp(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Appkey", CacheKey.App);
		map.put("AppComponentCode", CacheKey.AppComp);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_APP, cacheDao.getApp(tenantId), dbVersion, map);
	}

	@Override
	public boolean addAuthApi(String tenantId, String dbVersion) {// 授权API
		return addObject(tenantId, CacheKey.MODULE_AUTH_API, dbVersion, CacheKey.AUTH_API_LIST);
	}

	@Override
	public boolean addBuscode(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("BusCode", CacheKey.BusCode);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_BUS_CODE, cacheDao.getBusCodeList(tenantId), dbVersion, map);
	}
	
	@Override
	public boolean addConfProperties(String tenantId, String dbVersion) {
		if(log.isDebugEnabled()){
			log.debug("load confProperties start");
		}
		try {
			List<ConfProperties> list = cacheDao.getConfProperties(tenantId);
			if (list != null && !list.isEmpty()) {
				List<String> keyList = new ArrayList<String>();
				List<String> errorKeyList = new ArrayList<String>();
				for (ConfProperties cp : list) {
					//是否需要解密
					if(cp.getProEncrypt() == 1) {
						if(org.springframework.util.StringUtils.hasText(cp.getProValue())) {
							cp.setProValue(SecurityUtil.getInstance().decryMsg(cp.getProValue()));
						}
						else if(org.springframework.util.StringUtils.hasText(cp.getProValueBuffer())) {
							cp.setProValueBuffer(SecurityUtil.getInstance().decryMsg(cp.getProValueBuffer()));
						}
					}
				}
				String key = CacheKey.ALL_CONF_PROPERTIES;
				CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), list, keyList, errorKeyList, key);
				CacheCommon.afterPutHandler(tenantId, cacheFactory.getCacheClient(), CacheKey.MODULE_CONF_PROPERTIES, keyList, errorKeyList);
			}
			cacheFactory.getCacheClient().put(tenantId + CacheKey.MODULE_CONF_PROPERTIES, dbVersion);
			CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_CONF_PROPERTIES, 1);
		} catch (Exception e) {
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_CONF_PROPERTIES, e);
		}
		return true;
	}

	@Override
	public boolean addComponent(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ComponentCode", CacheKey.Component);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_COMPONENT, cacheDao.getComponentList(tenantId), dbVersion, map);
	}

	@Override
	public boolean addContractNodeFuzzy(String tenantId, String dbVersion) {
		return CacheCommon.addByMap(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_CONTRACT_NODE_FUZZY, dbVersion, getContractNodeFuzzy(tenantId));
	}

	@Override
	public boolean addContractVer(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ContractVersion", CacheKey.ContractVer);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_CONTRACT_VER, cacheDao.getContractVer(tenantId), dbVersion, map);
	}

	@Override
	public boolean addCsvTemplateById(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("CsvTemplateId", CacheKey.CSV_TEMPLATE);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_CSV_TEMPLATE, dynamicJdbcDao.getAllCsvTemplate(tenantId), dbVersion, map);
	}

	@Override
	public boolean addDataSource(String tenantId, String dbVersion) {
		CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_DATA_SOURCE, 0);
		try {
			Object datasourceMap = cacheDao.loadDataSourceRoute(tenantId);
			List<JdbcDataSource> list = dynamicJdbcDao.getAllDataSource(tenantId);
			List<Map<String, Object>> dataSourceRouteList = dynamicJdbcDao.getAllMultiDataSourceRoute(tenantId);
			if(list != null || dataSourceRouteList != null) {
				List<String> errorKeyList = new ArrayList<String>();
				List<String> keyList = new ArrayList<String>();
				CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), datasourceMap, keyList, errorKeyList, CacheKey.DATA_SOURCE_MAP);
				if (list != null && !list.isEmpty()) {
					CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), list, keyList, errorKeyList, CacheKey.ALL_DATA_SOURCE);
					for (JdbcDataSource item : list) {
						CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), item, keyList, errorKeyList, CacheKey.DATA_SOURCE + item.getDataSourceId());
					}
				}
				if (dataSourceRouteList != null && !dataSourceRouteList.isEmpty()) {
					CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), dataSourceRouteList, keyList, errorKeyList, CacheKey.ALL_DATA_SOURCE_ROUTE);
					for (Map<String, Object> item : dataSourceRouteList) {
						CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), item, keyList, errorKeyList, CacheKey.DATA_SOURCE_ROUTE + item.get("DATA_SOURCE_ROUTE_ID"));
					}
				}
				CacheCommon.afterPutHandler(tenantId, cacheFactory.getCacheClient(), CacheKey.MODULE_DATA_SOURCE, keyList, errorKeyList);
			}
			cacheFactory.getCacheClient().put(tenantId + CacheKey.MODULE_DATA_SOURCE, dbVersion);
			CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_DATA_SOURCE, 1);
		} catch (Exception e) {
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_DATA_SOURCE, e);
		}
		return true;
	}

	@Override
	public boolean addException(String tenantId, String dbVersion) {
		return CacheCommon.addByMap(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_EXCEPTION, dbVersion, getExceptionMap(tenantId));
	}
	@Override
	public boolean addFlow(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("FlowSerInvokeInsId", CacheKey.FLOW);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_FLOW, cacheDao.getFlow(tenantId), dbVersion, map);
	}

	@Override
	public boolean addFuzzyEncryption(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("FuzzyEncryptionId", CacheKey.FUZZY_ENCRYPTION);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_FUZZY_ENCRYPTION, cacheDao.getFuzzyEncryption(tenantId), dbVersion, map);
	}

	@Override
	public boolean addLogLevel(String tenantId, String dbVersion) {// 加载日志级别
		return addObject(tenantId, CacheKey.MODULE_LOG_LEVEL, dbVersion, CacheKey.logLevelList);
	}



	@Override
	public boolean addMainData(String tenantId, String dbVersion) {
		return CacheCommon.addByMap(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_MAIN_DATA, dbVersion, cacheDao.getMainData(tenantId));
	}

	@Override
	public boolean addOrg(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("OrgCode", CacheKey.Org);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_ORG, cacheDao.getOrgList(tenantId), dbVersion, map);
	}

	
	
	@Override
	public boolean addRemoteCallInfo(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("RemoteCallUrlId", CacheKey.REMOTE_CALL_INFO);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_REMOTE_CALL_INFO, cacheDao.getRemoteCallInfoList(tenantId), dbVersion, map);
	}

	@Override
	public boolean addRestConfig(String tenantId, String dbVersion) {
		return addObject(tenantId, CacheKey.MODULE_REST, dbVersion, CacheKey.Rest);
	}

	@Override
	public boolean addSerIns(String tenantId, String dbVersion) {
		CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_SER_INVOKE_INS, 0);
		try {
			List<SerInvokeIns> serInvokeIns = cacheDao.getSerInvokeIns(tenantId);
			if (serInvokeIns != null && !serInvokeIns.isEmpty()) {
				List<String> keyList = new ArrayList<String>();
				List<String> errorKeyList = new ArrayList<String>();
				for (SerInvokeIns service : serInvokeIns) {
					CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), service, keyList, errorKeyList, CacheKey.serInvokeIns + service.getServiceId() + service.getComponentCode());
					CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), service, keyList, errorKeyList, CacheKey.serInvokeIns + service.getSerInvokeInsId());
					Map<String, ProofEffect> proofValues = cacheDao.getProofValues(service.getSerInvokeInsId(), tenantId);
					if (proofValues != null && !proofValues.isEmpty()) {
						Set<Map.Entry<String, ProofEffect>> entry = proofValues
								.entrySet();
						for (Map.Entry<String, ProofEffect> kv : entry) {
							ProofEffect pf = kv.getValue();
							CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), pf, keyList, errorKeyList, CacheKey.ProofValues + pf.getProofCode() + pf.getSerInvokeInsId());
						}
					}
				}
				CacheCommon.afterPutHandler(tenantId, cacheFactory.getCacheClient(), CacheKey.MODULE_SER_INVOKE_INS, keyList, errorKeyList);
			}
			cacheFactory.getCacheClient().put(tenantId + CacheKey.MODULE_SER_INVOKE_INS, dbVersion);
			CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_SER_INVOKE_INS, 1);
		} catch (Exception e) {
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_SER_INVOKE_INS, e);
		}
		return true;
	}

	@Override
	public boolean addService(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ServiceCode", CacheKey.SERVICE);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_SERVICE, cacheDao.getService(null,tenantId), dbVersion, map);
	}

	@Override
	public boolean addTech(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("SerTechId", CacheKey.techImpl);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log,  CacheKey.MODULE_TECH_IMPL, cacheDao.getTechImpl(tenantId), dbVersion, map);
	}
	
	@Override
	public boolean addTransformerRule(String tenantId, String dbVersion) {
		CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_TRANSFORMER_RULE, 0);
		try {
			List<TransformerRule> transformerRuleList = transformerRuleDao.getAllUsable(tenantId);
			if (transformerRuleList != null && transformerRuleList.size() > 0) {
				List<String> keyList = new ArrayList<String>();
				List<String> errorKeyList = new ArrayList<String>();
				for (TransformerRule transformerRule : transformerRuleList) {
					String key = CacheKey.TRANSFORMER_RULE  + transformerRule.getId();
					List<NodeDescMapper> mappers = transformerRule.getNodeDescMappers();
					for (NodeDescMapper maper : mappers) {
						if (maper.getTarNode() != null
								&& (!"M".equals(maper.getOperTypeCd()))) {
							NodeValReq nvr = transformerRuleDao.queryNodeValReqByNodeId(maper.getTarNode().getNodeDescId(), transformerRule.getId(), tenantId);
							NodeValReq snvr = null;
							if(maper.getSrcNode() != null) {
								snvr = transformerRuleDao.queryNodeValReqByNodeId(maper.getSrcNode().getNodeDescId(), transformerRule.getId(), tenantId);
							}
							
							if(nvr != null) {
								maper.setTarNodeValReq(nvr);
							} else if(snvr != null) {
								maper.setTarNodeValReq(snvr);
							}
						}
					}
					// 协议适配端点规则-转换
					List<ContractAdapterEndpoint> transList = transformerRule
							.getTransListContractAdapterEndpoint();
					Map<Integer, Integer> nodeToEndpointMap = new HashMap<Integer, Integer>();
					Map<Integer, ContractFormatEx> nodeToContractFormatMap = new HashMap<Integer, ContractFormatEx>();
					if (null != transList && transList.size() > 0) {
						for (ContractAdapterEndpoint cae : transList) {
							if (null != cae.getContractFormat()) {
								ContractFormatEx con = cae.getContractFormat();
								List<NodeDesc> nodeList = con.getNodeDescs();
								if (nodeList.size() > 0) {
									for (NodeDesc node : nodeList) {
										nodeToContractFormatMap.put(
												node.getNodeDescId(), con);
										nodeToEndpointMap.put(
												node.getNodeDescId(),
												cae.getEndpointId());
									}
								}
							}
							Endpoint endpoint = cacheDao.getEndpoint(cae.getEndpointId(), tenantId);
							cae.setEndpoint(endpoint);
						}
					}
					transformerRule.setNodeDescToEndpointMap(nodeToEndpointMap);
					transformerRule.setNodeDescToContractFormatMap(nodeToContractFormatMap);
					
					ContractFormat tarCf = transformerRule.getTarContractFormat();
					if(tarCf != null) {
						Map<String, Object> map = new HashMap<String, Object>();
						map.put("contractFormatId", tarCf.getTcpCtrFId());
						map.put("tenantId", tenantId);
						ContractFormat baseCf = transformerRuleDao.getBaseContractFormat(map);
						if(baseCf != null) {
							
							List<NodeDesc> baseNodeDesc = baseCf.getNodeDescs();
							List<NodeDesc> tarNodeDesc = tarCf.getNodeDescs();
							if(tarNodeDesc != null) {
								tarNodeDesc.addAll(baseNodeDesc);
							} else {
								
								List<NodeDesc> newTarNodeDesc = tarCf.getNodeDescs();
								newTarNodeDesc.addAll(baseNodeDesc);
								tarCf.setNodeDescs(newTarNodeDesc);
							}
						}
					}
					transforCacheService.initMsgBody(transformerRule);
					transforCacheService.buildNodeDesc(transformerRule);
					CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), transformerRule, keyList, errorKeyList,
							key);
				}
				List<ParamVarMap> paramVarMapList = transformerRuleDao.getParamVarMapByType(tenantId);
				if (paramVarMapList != null && !paramVarMapList.isEmpty()) {
					for (ParamVarMap map : paramVarMapList) {
						CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), map, keyList, errorKeyList, CacheKey.PARAM_VAR_MAP + map.getMapTypeCd() + map.getKey());
					}
				}
				CacheCommon.afterPutHandler(tenantId, cacheFactory.getCacheClient(), CacheKey.MODULE_TRANSFORMER_RULE, keyList, errorKeyList);
			}
			cacheFactory.getCacheClient().put(tenantId + CacheKey.MODULE_TRANSFORMER_RULE, dbVersion);
			CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_TRANSFORMER_RULE, 1);
		} catch (Exception e) {
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_TRANSFORMER_RULE, e);
		}
		return true;
	}

	@Override
	public boolean addWsdlFile(String tenantId, String dbVersion) {
		return CacheCommon.addByMap(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_WSDL, dbVersion, getWsdlMap(tenantId));
	}

	private static void logDebug(String content) {
		if (log.isDebugEnabled()) {
			log.debug(content);
		}
	}

	private Object getObjectFromDb(String tenantId, String moduleName) {
		if (CacheKey.MODULE_REST.equals(moduleName)) {
			return getRest(tenantId);
		} else if (CacheKey.MODULE_AUTH_API.equals(moduleName)) {
			return cacheDao.getNeedUserAuthApi(tenantId);
		} else if (CacheKey.MODULE_LOG_LEVEL.equals(moduleName)) {
			return cacheDao.getLogLevel(null);
		}
		return null;
	}

	private boolean addObject(String tenantId, String moduleName, String dbVersion, String key) {
		CacheCommon.logDebugMessage(log, tenantId, moduleName, 0);
		try {
			Object obj = getObjectFromDb(tenantId, moduleName);
			if (obj == null || cacheFactory.getCacheClient().put(tenantId + key, obj)) {
				cacheFactory.getCacheClient().remove(tenantId + CacheCommon.prefixReplace(moduleName, 2));
				cacheFactory.getCacheClient().put(tenantId + moduleName, dbVersion);
				CacheCommon.logDebugMessage(log, tenantId, moduleName, 1);
			} else {
				cacheFactory.getCacheClient().put(tenantId + CacheCommon.prefixReplace(moduleName, 2), key);
				throw new Exception("Load data into cache failed! ErrorKeyList is " + key);
			}
		} catch (Exception e) {
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, moduleName, e);
		}
		return true;
	}

	private Map<String, String> getExceptionMap(String tenantId) {
		List<Map<String, Object>> eList = cacheDao.getException(tenantId);
		if (eList == null || eList.isEmpty()) {
			return null;
		}
		Map<String, String> exceptionMap = new HashMap<String, String>();
		for (Map<String, Object> eMap : eList) {
			String rspCode = eMap.get("CODE") == null ? "" : eMap.get("CODE")
					.toString();
			String httpCode = eMap.get("CODE_SOURE_NAME") == null ? "" : eMap
					.get("CODE_SOURE_NAME").toString();
			String key = CacheKey.Exception + rspCode;
			exceptionMap.put(key, httpCode);
		}
		return exceptionMap;
	}

	private String getRegExp(String attrValue) {
		String paths[] = attrValue.split("\\/");
		StringBuffer resultUrl = new StringBuffer("");
		for (String path : paths) {
			if (!"".equals(path)) {
				resultUrl.append(("\\/" + path).replaceFirst("\\{\\S+\\}",
						"([^\\/]*)"));
			}
		}
		return resultUrl.toString();
	}

	@Override
	public boolean addVersions(String tenantId, Map<String, String> versionsMap) {
		cacheFactory.getCacheClient().put(tenantId + CacheKey.MODULE_VERSION_MAP, versionsMap);// 缓存设置
		return true;
	}

	@Override
	public Map<String, String> getVersions(String tenantId) {
		return cacheDao.getVersions(tenantId);
	}

	public void setDynamicJdbcDao(IDynamicJdbcDao dynamicJdbcDao) {
		this.dynamicJdbcDao = dynamicJdbcDao;
	}

	public ITransformerRuleDao getTransformerRuleDao() {
		return transformerRuleDao;
	}

	public void setTransformerRuleDao(ITransformerRuleDao transformerRuleDao) {
		this.transformerRuleDao = transformerRuleDao;
	}

	public void setcacheDao(ICacheDao cacheDao) {
		this.cacheDao = cacheDao;
	}

	public ICacheDao getcacheDao() {
		return cacheDao;
	}

	public void setCacheDao(ICacheDao cacheDao) {
		this.cacheDao = cacheDao;
	}

	public ICacheFactory<String, Object> getCacheFactory() {
		return cacheFactory;
	}

	public void setCacheFactory(ICacheFactory<String, Object> cacheFactory) {
		this.cacheFactory = cacheFactory;
	}	

	private Map<String, List<ContractNodeFuzzy>> getContractNodeFuzzy(String tenantId) {
		List<ContractNodeFuzzy> contractNodeFuzzyList = cacheDao.getContractNodeFuzzy(tenantId);
		if (contractNodeFuzzyList == null || contractNodeFuzzyList.isEmpty()) {
			return null;
		}
		Map<String, List<ContractNodeFuzzy>> map = new HashMap<String, List<ContractNodeFuzzy>>();
		for (ContractNodeFuzzy contractNodeFuzzy : contractNodeFuzzyList) {
			if (map.get(String.valueOf(contractNodeFuzzy.getTcpCtrFId())) != null) {
				map.get(String.valueOf(contractNodeFuzzy.getTcpCtrFId())).add(
						contractNodeFuzzy);
			} else {
				List<ContractNodeFuzzy> cList = new ArrayList<ContractNodeFuzzy>();
				cList.add(contractNodeFuzzy);
				map.put(CacheKey.CONTRACT_NODE_FUZZY + contractNodeFuzzy.getTcpCtrFId(), cList);
			}
		}
		return map;
	}

	private Map<String, List<Map<String, Object>>> getApiOperationNameMap(String tenantId) {
		List<Map<String, Object>> apiOperationList = cacheDao.getApiOperations(tenantId);
		List<String> resourceAlissList = new ArrayList<String>();
		if (apiOperationList == null || apiOperationList.isEmpty()) {
			return null;
		}
		for (Map<String, Object> apiOperationMap : apiOperationList) {
			String resourceAliss = apiOperationMap.get("RESOURCE_ALISS") == null ? null : apiOperationMap.get("RESOURCE_ALISS").toString();
			// 按“资源别名”分类
			if (!resourceAlissList.contains(resourceAliss)) {
				resourceAlissList.add(resourceAliss);
			}
		}
		Map<String, List<Map<String, Object>>> map = new HashMap<String, List<Map<String, Object>>>();
		for (String resVersion : resourceAlissList) {
			List<Map<String, Object>> apiMethodList = new ArrayList<Map<String, Object>>();
			for (Map<String, Object> apiOperationMap : apiOperationList) {
				String ra = apiOperationMap.get("RESOURCE_ALISS") == null ? null
						: apiOperationMap.get("RESOURCE_ALISS").toString();
				if (!StringUtils.isEmpty(ra) && ra.equals(resVersion)) {
					apiMethodList.add(apiOperationMap);
				}
			}
			map.put(CacheKey.ApiOperationName + resVersion, apiMethodList);
		}
		return map;
	}

	private Map<String, String> getWsdlMap(String tenantId) {
		try{
			List<Map<String, Object>> wsdlList = cacheDao.getWsdlFileList(tenantId);
			if (wsdlList == null || wsdlList.isEmpty()) {
				return null;
			}
			Map<String, String> map = new HashMap<String, String>();
			for (Map<String, Object> wsdlMap : wsdlList) {
				String resAliss = wsdlMap.get("RESOURCE_ALISS") == null ? "" : wsdlMap.get("RESOURCE_ALISS").toString();
				Object fileContent = wsdlMap.get("S_FILE_CONTENT");
				String sFileContent = null;
				if (fileContent != null) {
					if (fileContent instanceof byte[]) {
						byte[] fileBytes = (byte[]) fileContent;
						sFileContent = new String(fileBytes, Constant.UTF8);
					} else if (fileContent instanceof Blob) {
						Blob sFileContentBlob = (Blob) wsdlMap.get("S_FILE_CONTENT");
						int len = (int) sFileContentBlob.length();
						byte[] data = new byte[len];
						sFileContent = new String(data, Constant.UTF8);
					}
					if (sFileContent != null) {
						map.put(CacheKey.Wsdl + resAliss, sFileContent);
					}
				}
			}
			return map;
		}catch(Exception e){
			log.error("get wsdl map error!", e);
			return null;
		}
	}

	private Object getRest(String tenantId) {
		Map<String, String> param = new HashMap<String, String>();
		String componentCode = ZKCfgCacheHolder.PROP_ITEMS.getProperty("O2P_COMPONENT_ID");
		param.put("componentCode", componentCode);
		param.put("tenantId", tenantId);
		List<Map<String, Object>> restConfigList = cacheDao.getRestConfigList(param);
		List<String> serviceIdList = new ArrayList<String>();
		for (Map<String, Object> restConfigMap : restConfigList) {
			String serviceId = restConfigMap.get("SERVICE_ID") == null ? null
					: restConfigMap.get("SERVICE_ID").toString();
			if (!serviceIdList.contains(serviceId)) {
				serviceIdList.add(serviceId);
			}
		}
		List<Map<String, String>> restList = new ArrayList<Map<String, String>>();
		for (String serviceId : serviceIdList) {
			Map<String, String> map = new HashMap<String, String>();
			for (Map<String, Object> restConfigMap : restConfigList) {
				String serviceId2 = restConfigMap.get("SERVICE_ID") == null ? null
						: restConfigMap.get("SERVICE_ID").toString();
				String version = restConfigMap.get("VERSION") == null ? null
						: restConfigMap.get("VERSION").toString();
				String attrValue = restConfigMap.get("ATTR_SPEC_VALUE") == null ? null
						: restConfigMap.get("ATTR_SPEC_VALUE").toString();
				String attrCode = restConfigMap.get("ATTR_SPEC_CODE") == null ? null
						: restConfigMap.get("ATTR_SPEC_CODE").toString();
				String serviceCode = restConfigMap.get("SERVICE_CODE") == null ? null
						: restConfigMap.get("SERVICE_CODE").toString();
				String regExp = "";
				String action = "";
				if (serviceId.equals(serviceId2)) {
					if (EndpointAttr.restResource.equals(attrCode)) {
						// 将变量替换为正则表达式
						regExp = getRegExp(attrValue);
						map.put("regExp", regExp);
						map.put("urlResource", attrValue);
					} else if (EndpointAttr.restAction.equals(attrCode)) {
						action = attrValue;
						map.put("action", action);
					}
					map.put("serviceId", serviceId2);
					map.put("version", version);
					map.put("serviceCode", serviceCode);
				}
			}
			restList.add(map);
		}
		return restList;
	}

	public Object getKey(String key) {
		Object obj = null;
		try {
			obj = cacheFactory.getCacheClient().get(key);
		} catch (Exception e) {
			log.error("get key from cache error", e);
		}
		return obj;
	}

	@Override
	public boolean addTenant() {
		if(log.isDebugEnabled()){
			log.debug("load tenant start");
		}
		boolean loadStatus = true;
		try {
			List<Map<String, ?>> list = cacheDao.getTenants();
			List<String> errorKeyList = new ArrayList<String>();
			List<String> keyList = new ArrayList<String>();
			List<Tenant> tenants = new ArrayList<Tenant>();
			if (list != null && !list.isEmpty()) {
				for(Map<String, ?> map : list){
					Tenant tenant = new Tenant();
					tenant.setTenantId(map.containsKey("TENANT_ID")?Integer.valueOf(map.get("TENANT_ID").toString()):Integer.valueOf(map.get("tenant_id").toString()));
					tenant.setContractNum(map.containsKey("CONTRACT_NUM")?(String)map.get("CONTRACT_NUM"):(String)map.get("contract_num"));
					tenant.setCountry(map.containsKey("COUNTRY")?(String)map.get("COUNTRY"):(String)map.get("country"));
					tenant.setCurrency(map.containsKey("CURRENCY")?(String)map.get("CURRENCY"):(String)map.get("currency"));
					tenant.setLanguage(map.containsKey("LANGUAGE")?(String)map.get("LANGUAGE"):(String)map.get("language"));
					tenant.setLogo(map.containsKey("LOGO")?(String)map.get("LOGO"):(String)map.get("logo"));
					tenant.setName(map.containsKey("NAME")?(String)map.get("NAME"):(String)map.get("name"));
					tenant.setProvince(map.containsKey("PROVINCE")?(String)map.get("PROVINCE"):(String)map.get("province"));
					tenant.setStatus(map.containsKey("STATUS")?(String)map.get("STATUS"):(String)map.get("status"));
					tenant.setZipCode(map.containsKey("ZIP_CODE")?(String)map.get("ZIP_CODE"):(String)map.get("zip_code"));
					tenant.setCode(map.containsKey("CODE")?(String)map.get("CODE"):(String)map.get("code"));
					tenant.setTimeZone(map.containsKey("TIME_ZONE")?(String)map.get("TIME_ZONE"):(String)map.get("time_zone"));
					tenant.setTheme(map.containsKey("THEME")?(String)map.get("THEME"):(String)map.get("theme"));
					tenant.setStartDt(map.containsKey("START_DT")?(Date)map.get("START_DT"):(Date)map.get("start_dt"));
					tenant.setEndDt(map.containsKey("END_DT")?(Date)map.get("END_DT"):(Date)map.get("end_dt"));
					tenant.setCreateDt(map.containsKey("CREATE_DT")?(Date)map.get("CREATE_DT"):(Date)map.get("create_dt"));
					
					String key = CacheKey.TENANT + tenant.getTenantId();
					if(cacheFactory.getCacheClient().put(key, tenant)){
						keyList.add(key);
					}else{
						errorKeyList.add(key);
					}
					key = CacheKey.TENANT + tenant.getCode();
					if(cacheFactory.getCacheClient().put(key, tenant)){
						keyList.add(key);
					}else{
						errorKeyList.add(key);
					}
					tenants.add(tenant);
				}
				if(cacheFactory.getCacheClient().put(CacheKey.TENANT_ALL, tenants)){
					keyList.add(CacheKey.TENANT_ALL);
				}else{
					errorKeyList.add(CacheKey.TENANT_ALL);
				}
				cacheFactory.getCacheClient().put("KEY_LIST_" + CacheKey.TENANT, keyList);
				if(errorKeyList.isEmpty()){
					cacheFactory.getCacheClient().remove("ERROR_KEY_LIST_" + CacheKey.TENANT);
				}else{
					cacheFactory.getCacheClient().put("ERROR_KEY_LIST_" + CacheKey.TENANT, errorKeyList);
					throw new Exception("Load data into cache failed! ErrorKeyList is " + errorKeyList.toString());
				}
				keyList.addAll(errorKeyList);
			}
			if(log.isDebugEnabled()){
				log.debug("load tenant end");
			}
		} catch (Exception e) {
			log.error("load tenant failed", e);
			cacheFactory.getCacheClient().put("ERROR_CAUSE_" + CacheKey.TENANT, e);
			loadStatus = false;
		}
		return loadStatus;
	}

	@Override
	public List<String> getTenantIdList() {
		return cacheDao.getTenantIdList();
	}

	@Override
	public void insertModuleVersion(String tenantId, String moduleName) {
		cacheDao.insertModuleVersion(tenantId, moduleName);
	}

	@Override
	public boolean putObject(String key, Object obj) {
		return cacheFactory.getCacheClient().put(key, obj);
	}

	@Override
	public void updateModuleVersion(String tenantId, String moduleName) {
		cacheDao.updateModuleVersion(tenantId, moduleName);
	}

	@Override
	public boolean addCacheStrategy(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("CacheStrategyId", CacheKey.CacheStrategy);
//		cacheFactory.getCacheClient().put(tenantId + CacheKey.CacheStrategy, dbVersion);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_CACHE_STRATEGY, cacheDao.getCacheStragety(tenantId), dbVersion, map);
	}
	
}
