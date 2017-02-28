package com.asiainfo.integretion.o2p.cachecontroller.smo;

import java.util.List;
import java.util.Map;

public interface ICacheService {
	//按模块加载，已按字符排序
	boolean addApi(String tenantId, String dbVersion);
	boolean addApiOperation(String tenantId, String dbVersion);
	boolean addApp(String tenantId, String dbVersion);
	boolean addAuthApi(String tenantId, String dbVersion);
	boolean addBuscode(String tenantId, String dbVersion);
	boolean addConfProperties(String tenantId, String dbVersion);
	boolean addComponent(String tenantId, String dbVersion);
	boolean addContractNodeFuzzy(String tenantId, String dbVersion);
	boolean addContractVer(String tenantId, String dbVersion);
	boolean addCsvTemplateById(String tenantId, String dbVersion);
	boolean addDataSource(String tenantId, String dbVersion);
	boolean addException(String tenantId, String dbVersion);
	boolean addFlow(String tenantId, String dbVersion);
	boolean addFuzzyEncryption(String tenantId, String dbVersion);
	boolean addLogLevel(String tenantId, String dbVersion);
	boolean addMainData(String tenantId, String dbVersion);
	boolean addOrg(String tenantId, String dbVersion);
	boolean addRemoteCallInfo(String tenantId, String dbVersion);
	boolean addRestConfig(String tenantId, String dbVersion);
	boolean addSerIns(String tenantId, String dbVersion);
	boolean addService(String tenantId, String dbVersion);
	boolean addTech(String tenantId, String dbVersion);
	boolean addTemplate(String tenantId, String dbVersion);
	boolean addTransformerRule(String tenantId, String dbVersion);
	boolean addWsdlFile(String tenantId, String dbVersion);
//	boolean addCacheObj(String tenantId, String dbVersion);
	boolean addCacheStrategy(String tenantId, String dbVersion);
	
	//加载版本信息到缓存 add by linwf
	boolean addVersions(String tenantId, Map<String, String> versionsMap);
	//获取DB中的版本号信息 add by linwf
	Map<String, String> getVersions(String tenantId);
	Object getKey(String key);
	boolean putObject(String key, Object obj);
	
	boolean addTenant();
	List<String> getTenantIdList();
	void insertModuleVersion(String tenantId, String moduleName);
	void updateModuleVersion(String tenantId, String moduleName);
}
