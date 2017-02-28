/** 
 * Project Name:o2p-base-dao 
 * File Name:IRatingRuleDao.java 
 * Package Name:com.asiainfo.integration.o2p.basedao.dao 
 * Date:2014年12月12日下午3:31:19 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integretion.o2p.cachecontroller.dao;  

import java.util.List;
import java.util.Map;

import com.asiainfo.integration.o2p.billing.ApiProductProdOfferOrgRela;
import com.ailk.eaap.op2.bo.BillingCycle;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.bo.ProdOffer;
import com.ailk.eaap.op2.bo.ServiceProductRela;
import com.ailk.eaap.op2.bo.Api;

public interface IRatingRuleDao {
	public List<ProdOffer> getProdOffer(String tenantId);
	public List<Org> getOrg(String tenantId);
	public List<Api> getApi(String tenantId);
	public List<ServiceProductRela> getServiceProductRela();
	public List<BillingCycle> getBillingCycle(String tenantId);
	public List<ApiProductProdOfferOrgRela> getApiProductProdOfferOrgRela(String tenantId);
	public List<Org> getOrgPricingCase(String tenantId);
	public List<String> getKeyList();
	public void setBillingCycle(BillingCycle billingCycle);
	
	public List<Map<String,String>> getApiBillingCycleOfDate(Map selectMap);
	List<Map<String,String>> getSettlementData(String tenantId);
}
