package com.asiainfo.integretion.o2p.cachecontroller.smo;

public interface IBillingService {

	boolean addRatingProdOffer(String tenantId, String dbVersion);
	boolean addRatingApi(String tenantId, String dbVersion);
	boolean addRatingApiOrgToProdOffer(String tenantId, String dbVersion);
	boolean addRatingBillingCycle(String tenantId, String dbVersion);
	boolean addRatingOrg(String tenantId, String dbVersion);
	boolean addRatingOrgPricingCase(String tenantId, String dbVersion);
	boolean addRatingSettlement(String tenantId, String dbVersion);
	
	boolean addRating(String tenantId, String moduleName, String dbVersion);
}
