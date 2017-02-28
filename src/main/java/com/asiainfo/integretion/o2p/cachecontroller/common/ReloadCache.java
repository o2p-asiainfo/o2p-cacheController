package com.asiainfo.integretion.o2p.cachecontroller.common;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.asiainfo.foundation.log.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.apache.commons.lang.ArrayUtils;

import com.ailk.eaap.o2p.common.cache.CacheCommon;
import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.o2p.common.cache.IReloadCache;
import com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder;
import com.asiainfo.integretion.o2p.cachecontroller.smo.IBillingService;
import com.asiainfo.integretion.o2p.cachecontroller.smo.ICacheService;
import com.asiainfo.integretion.o2p.cachecontroller.smo.IDataSynchronizeService;

@Service(value="reloadCache")
public class ReloadCache implements  IReloadCache{
	
	private static final Logger log = Logger.getLog(ReloadCache.class);
	@Resource(name="cacheService")
	private ICacheService cacheService;
	@Resource(name="cacheFactory")
	private ICacheFactory<String, Object> cacheFactory;
	@Resource(name="billingService")
	private IBillingService billingService;
	@Resource(name="dataSynchronizeService")
	private IDataSynchronizeService dataSynchronizeService;
	@Value("${cache.syn2db.switch.transSeq}")
	private boolean transSeqSynStatus = true;
	@Value("${cache.syn2db.switch.billingCycle}")
	private boolean billingCycleSynStatus = true;
	private static final String[] moduleList = (ZKCfgCacheHolder.PROP_ITEMS.get("cache.billing.load.status")!=null && Boolean.valueOf(ZKCfgCacheHolder.PROP_ITEMS.get("cache.billing.load.status").toString()))?((String[]) ArrayUtils.addAll(CacheKey.MODULE_LIST, CacheKey.BILLING_MODULE_LIST)) : CacheKey.MODULE_LIST;
	//	private static final String[] moduleList = CacheKey.MODULE_LIST;
	
	public void reloadCache() {
		addAll(null);
	}

	/**
	 * type:2.transId,3.billingcycle
	 */
	@Override
	public void synCacheToDb(int type) {
		switch(type){
			case 2:
				if(transSeqSynStatus){
					dataSynchronizeService.synchronizeCache2Db();
				}
				break;
			case 3:
				if(billingCycleSynStatus){
					dataSynchronizeService.synBillingCycle();
				}
				break;
			default: 
				throw new IllegalStateException();
		}
	}
	

	@Override
	public boolean addAll(String tenantId) {
		if(tenantId==null){
			cacheService.addTenant();
			List<String> tenantIdList = cacheService.getTenantIdList();
			if(tenantIdList!=null && !tenantIdList.isEmpty()){
				boolean actionStatus = true;
				for(String id : tenantIdList){
					if(addAll(id)){
						actionStatus = false;
					}
				}
				return actionStatus;
			}
			cacheService.putObject(CacheKey.MODULE_ALL, "OK");
			return true;
		}
		try {
			Map<String, String> dbVersionsMap = cacheService.getVersions(tenantId);
			if (dbVersionsMap == null || dbVersionsMap.isEmpty()) {
				cacheService.insertModuleVersion(tenantId, CacheKey.MODULE_ALL);
				dbVersionsMap = cacheService.getVersions(tenantId);
			}
			logDebug("-----------------------load data from db to cache start[tenantId=" + tenantId +"]-----------------------");
			for (String moduleName : moduleList) {
				if (isNeedReload(tenantId, dbVersionsMap.get(tenantId + moduleName), moduleName)) {
					addByModuleName(tenantId, moduleName, dbVersionsMap.get(tenantId + moduleName));
				}
			}
			cacheService.putObject(tenantId + CacheKey.MODULE_ALL, dbVersionsMap.get(tenantId + CacheKey.MODULE_ALL));
			cacheService.addVersions(tenantId, dbVersionsMap);
			logDebug("-----------------------load data from db to cache end[tenantId=" + tenantId +"]-----------------------");
			log.info("load data into level-1 cache[tenantId=" + tenantId + "] finished!");
		} catch (Exception e) {
			log.error("cache load failed!", e);
		}
		return true;
	}
	
	/**
	 * serviceType:1,update module version info in db;2,reload cache data by
	 * module name
	 */
	@Override
	public boolean cacheRefreshService(String tenantId, String moduleName, String serviceType) {
		if(tenantId==null){
			List<String> tenantIdList = cacheService.getTenantIdList();
			if(tenantIdList!=null && !tenantIdList.isEmpty()){
				boolean actionStatus = true;
				for(String id : tenantIdList){
					if(cacheRefreshService(id, moduleName, serviceType)){
						actionStatus = false;
					}
				}
				return actionStatus;
			}
			return true;
		}
		try {
			if (serviceType == null || moduleName == null) {
				return false;
			}
			if ("1".equals(serviceType)) {
				cacheService.updateModuleVersion(tenantId, moduleName);
			}
			if ("2".equals(serviceType)) {
				if (moduleName.equals(CacheKey.MODULE_ALL_FORCE)) {
					Map<String, String> dbVersionsMap = cacheService.getVersions(tenantId);
					if (dbVersionsMap == null || dbVersionsMap.isEmpty()) {
						cacheService.insertModuleVersion(tenantId, CacheKey.MODULE_ALL);
						dbVersionsMap = cacheService.getVersions(tenantId);
					}
					for (String module : moduleList) {
						if (dbVersionsMap.get(tenantId + module) != null) {
							addByModuleName(tenantId, module, dbVersionsMap.get(module));
						}
					}
					cacheService.addVersions(tenantId, dbVersionsMap);
				} else if (moduleName.equals(CacheKey.MODULE_ALL)) {
					addAll(tenantId);
				} else {
					return addByModuleName(tenantId, moduleName, cacheService.getVersions(tenantId).get(tenantId + moduleName));
				}
			}
		} catch (Exception e) {
			log.error("load data into cache failed! moduleName=" + moduleName + ", serviceType=" + serviceType, e);
			return false;
		}
		return true;
	}
	
	public boolean isNeedReload(String tenantId, String dbVersion, String moduleName) {
		try {
			if (dbVersion == null) {
				log.warn("There is no version info in db for moduleName " + moduleName + "[tenantId=" + tenantId + "]");
				cacheService.insertModuleVersion(tenantId, moduleName);
				return false;
			}
			String cacheVersion = (String) cacheService.getKey(tenantId + moduleName);
			if (cacheVersion == null || !cacheVersion.equals(dbVersion)) {
				return true;
			}
		} catch (Exception e) {
			log.error("compare version Exception!,dbVersion=" + dbVersion + ",moduleName=" + moduleName + "[tenantId=" + tenantId + "]", e);
			return true;
		}
		return false;
	}
	
	public boolean addByModuleName(String tenantId, String moduleName, String dbVersion) {
		try{
			if (CacheKey.MODULE_API.equals(moduleName)) {
				return cacheService.addApi(tenantId, dbVersion);
			} else if (CacheKey.MODULE_TEMPLATE.equals(moduleName)) {
				return cacheService.addTemplate(tenantId, dbVersion);
			} else if (CacheKey.MODULE_DATA_SOURCE.equals(moduleName)) {
				return cacheService.addDataSource(tenantId, dbVersion);
			} else if (CacheKey.MODULE_CSV_TEMPLATE.equals(moduleName)) {
				return cacheService.addCsvTemplateById(tenantId, dbVersion);
			} else if (CacheKey.MODULE_COMPONENT.equals(moduleName)) {
				return cacheService.addComponent(tenantId, dbVersion);
			} else if (CacheKey.MODULE_CONTRACT_VER.equals(moduleName)) {
				return cacheService.addContractVer(tenantId, dbVersion);
			} else if (CacheKey.MODULE_ORG.equals(moduleName)) {
				return cacheService.addOrg(tenantId, dbVersion);
			} else if (CacheKey.MODULE_BUS_CODE.equals(moduleName)) {
				return cacheService.addBuscode(tenantId, dbVersion);
			} else if (CacheKey.MODULE_MAIN_DATA.equals(moduleName)) {
				return cacheService.addMainData(tenantId, dbVersion);
			} else if (CacheKey.MODULE_FLOW.equals(moduleName)) {
				return cacheService.addFlow(tenantId, dbVersion);
			} else if (CacheKey.MODULE_CONF_PROPERTIES.equals(moduleName)) {
				return cacheService.addConfProperties(tenantId, dbVersion);
			} else if (CacheKey.MODULE_APP.equals(moduleName)) {
				return cacheService.addApp(tenantId, dbVersion);
			} else if (CacheKey.MODULE_SERVICE.equals(moduleName)) {
				return cacheService.addService(tenantId, dbVersion);
			} else if (CacheKey.MODULE_SER_INVOKE_INS.equals(moduleName)) {
				return cacheService.addSerIns(tenantId, dbVersion);
			} else if (CacheKey.MODULE_TECH_IMPL.equals(moduleName)) {
				return cacheService.addTech(tenantId, dbVersion);
			} else if (CacheKey.MODULE_WSDL.equals(moduleName)) {
				return cacheService.addWsdlFile(tenantId, dbVersion);
			} else if (CacheKey.MODULE_API_OPERATION_NAME.equals(moduleName)) {
				return cacheService.addApiOperation(tenantId, dbVersion);
			} else if (CacheKey.MODULE_REST.equals(moduleName)) {
				return cacheService.addRestConfig(tenantId, dbVersion);
			} else if (CacheKey.MODULE_EXCEPTION.equals(moduleName)) {
				return cacheService.addException(tenantId, dbVersion);
			} else if (CacheKey.MODULE_TRANSFORMER_RULE.equals(moduleName)) {
				return cacheService.addTransformerRule(tenantId, dbVersion);
			} else if (CacheKey.MODULE_REMOTE_CALL_INFO.equals(moduleName)) {
				return cacheService.addRemoteCallInfo(tenantId, dbVersion);
			} else if (CacheKey.MODULE_FUZZY_ENCRYPTION.equals(moduleName)) {
				return cacheService.addFuzzyEncryption(tenantId, dbVersion);
			} else if (CacheKey.MODULE_CONTRACT_NODE_FUZZY.equals(moduleName)) {
				return cacheService.addContractNodeFuzzy(tenantId, dbVersion);
			} else if (CacheKey.MODULE_AUTH_API.equals(moduleName)) {
				return cacheService.addAuthApi(tenantId, dbVersion);
			} else if (CacheKey.MODULE_LOG_LEVEL.equals(moduleName)) {
				return cacheService.addLogLevel(tenantId, dbVersion);
			} else if(CacheKey.MODULE_CACHE_STRATEGY.equals(moduleName)){
				return cacheService.addCacheStrategy(tenantId, dbVersion);
			}
			
			else if (moduleName.startsWith("MODULE_RATING")) {
				return billingService.addRating(tenantId, moduleName, dbVersion);
			}
		}catch(Exception e){
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, moduleName, e);
		}
		return true;
	}
	
	private static void logDebug(String content) {
		if (log.isDebugEnabled()) {
			log.debug(content);
		}
	}
	
	public void setTransSeqSynStatus(boolean transSeqSynStatus) {
		this.transSeqSynStatus = transSeqSynStatus;
	}
	public ICacheService getCacheService() {
		return cacheService;
	}
	public void setCacheService(ICacheService cacheService) {
		this.cacheService = cacheService;
	}
	public void setBillingService(IBillingService billingService) {
		this.billingService = billingService;
	}
	public void setBillingCycleSynStatus(boolean billingCycleSynStatus) {
		this.billingCycleSynStatus = billingCycleSynStatus;
	}
}
