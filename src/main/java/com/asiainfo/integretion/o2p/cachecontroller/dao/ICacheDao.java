package com.asiainfo.integretion.o2p.cachecontroller.dao;

import java.util.List;
import java.util.Map;

import com.ailk.eaap.op2.bo.Api;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.BizFunction;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.ConfProperties;
import com.ailk.eaap.op2.bo.ContractNodeFuzzy;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.CtlCounterms2Comp;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.FuzzyEncryption;
import com.ailk.eaap.op2.bo.LogLevel;
import com.ailk.eaap.op2.bo.MainData;
import com.ailk.eaap.op2.bo.CacheStrategy;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.bo.ProofEffect;
import com.ailk.eaap.op2.bo.RemoteCallInfo;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.bo.Template;

public interface ICacheDao {

	List<Api> getApis(String tenantId);
	List<ConfProperties> getConfProperties(String tenantId);
	
	
	Map<String, Integer> getTranIdSeqMap();
	void insertServerComponentSeq(Map<String, String> paramMap);
	void updateServerComponentSeq(Map<String, String> paramMap);
	Map<String, String> getServerLocalLogoMap();
	void insertServerLocalLogo(Map<String, String> paramMap);
	void insertServerLocalSeq(int seq);
	void updateServerLocalSeq(int seq);
	int getServerLocalSeq();
	
	Map<String,Object> loadDataSourceRoute(String tenantId);
	List<ContractVersion>  getContractVer(String tenantId);
	Map<String, List<MainData>> getMainData(String tenantId);
	List<RemoteCallInfo> getRemoteCallInfoList(String tenantId);
	Map<String ,ProofEffect> getProofValues(Integer servInvokeId, String tenantId);
	List<Service> getService(Integer serviceId, String tenantId);
	List<SerInvokeIns> getSerInvokeIns(String tenantId);
	List<CtlCounterms2Comp> getFlow(String tenantId);
	List<App> getApp(String tenantId);
	
	List<TechImpl> getTechImpl(String tenantId);
	
	List<BizFunction> getBusCodeList(String code);

	List<Component> getComponentList(String tenantId);

	List<Org> getOrgList(String orgCode);
	
	List<Map<String, Object>> getWsdlFileList(String tenantId);
	
	List<Map<String, Object>> getApiOperations(String tenantId);
	
	List<Map<String, Object>> getRestConfigList(Map<String, String> param);

	Map<String, String> getVersions(String tenantId);
	
	void updateModuleVersion(String tenantId, String moduleName);
	void insertModuleVersion(String tenantId, String moduleName);
	List<Map<String, Object>> getException(String tenantId);
	List<FuzzyEncryption> getFuzzyEncryption(String tenantId);
	List<ContractNodeFuzzy> getContractNodeFuzzy(String tenantId);
	
	Endpoint getEndpoint(int endpointid, String tenantId);
	List<LogLevel> getLogLevel(Object object);
	List<Api> getNeedUserAuthApi(String tenantId);
	
	List<Template> getTemplate(String tenantId);
	List<String> getTenantIdList();
	
	List<Map<String, ?>> getTenants();



//	List<CacheObj> getCacheObj(String tenantId);



	List<CacheStrategy> getCacheStragety(String tenantId);
}
