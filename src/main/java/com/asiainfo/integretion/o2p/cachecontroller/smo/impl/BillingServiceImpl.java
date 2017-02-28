package com.asiainfo.integretion.o2p.cachecontroller.smo.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ailk.eaap.o2p.common.cache.CacheCommon;
import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.util.CacheUtil;
import com.ailk.eaap.o2p.common.util.DateUtils;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.integration.o2p.billing.ApiProductProdOfferOrgRela;
import com.ailk.eaap.op2.bo.BasicTariff;
import com.ailk.eaap.op2.bo.BillingCycle;
import com.ailk.eaap.op2.bo.BillingDiscount;
import com.ailk.eaap.op2.bo.ComponentPrice;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.bo.OrgOfferOrderRela;
import com.ailk.eaap.op2.bo.PricePlan;
import com.ailk.eaap.op2.bo.ProdOffer;
import com.ailk.eaap.op2.bo.ProdOfferPricing;
import com.ailk.eaap.op2.bo.RatingCurverDetail;
import com.ailk.eaap.op2.bo.RecurringFee;
import com.ailk.eaap.op2.bo.SalesInto;
import com.asiainfo.integration.o2p.billing.APIBaseTariffBill;
import com.asiainfo.integration.o2p.billing.APIBaseTariffBillInfo;
import com.asiainfo.integration.o2p.billing.APIBillingCycleOfDate;
import com.asiainfo.integration.o2p.billing.APIBillingCycleOfOrg;
import com.asiainfo.integration.o2p.billing.APIBillingDiscount;
import com.asiainfo.integration.o2p.billing.APIBillingDiscountInfo;
import com.asiainfo.integration.o2p.billing.APIComponentPrice;
import com.asiainfo.integration.o2p.billing.APIPricingCase;
import com.asiainfo.integration.o2p.billing.APIRecurringFee;
import com.asiainfo.integration.o2p.billing.APISalesInto;
import com.asiainfo.integration.o2p.billing.APISalesOfAPIOfOrg;
import com.asiainfo.integration.o2p.billing.APISalesOfOrg;
import com.asiainfo.integration.o2p.billing.APISalesOfPricing;
import com.asiainfo.integretion.o2p.cachecontroller.dao.IRatingRuleDao;
import com.asiainfo.integretion.o2p.cachecontroller.smo.IBillingService;

@Component(value="billingService")
public class BillingServiceImpl implements IBillingService {
	private static final Logger log = Logger.getLog(BillingServiceImpl.class);
	@Resource(name="cacheFactory")
	private CacheFactory<String, Object> cacheFactory;
	public void setCacheFactory(CacheFactory<String, Object> cacheFactory) {
		this.cacheFactory = cacheFactory;
	}


	@Resource(name="ratingRuleDao")
	private IRatingRuleDao ratingRuleDao;
	
	
	public void setRatingRuleDao(IRatingRuleDao ratingRuleDao) {
		this.ratingRuleDao = ratingRuleDao;
	}

	@Override
	public boolean addRatingApi(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ApiId", CacheKey.RATING_API);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_RATING_API, ratingRuleDao.getApi(tenantId), dbVersion, map);
	}

	@Override
	public boolean addRatingApiOrgToProdOffer(String tenantId, String dbVersion) {
		try{
			return CacheCommon.addByMap(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_RATING_API_ORG, dbVersion, getRatingApiOrgMap(tenantId));
		}catch(Exception e){
			log.error("add rating api org to prod offer error!", e);
			return false;
		}
	}

	@Override
	public boolean addRatingBillingCycle(String tenantId, String dbVersion) {
		try{
			return CacheCommon.addByMap(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_RATING_BILLING_CYCLE, dbVersion, getRatingBillingCycleMap(tenantId));
		}catch(Exception e){
			log.error("add rating billing cycle error!", e);
			return false;
		}
	}

	@Override
	public boolean addRatingOrg(String tenantId, String dbVersion) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("OrgId", CacheKey.RATING_ORG);
		return CacheCommon.addByList(tenantId, cacheFactory.getCacheClient(), log, CacheKey.MODULE_RATING_ORG, ratingRuleDao.getOrg(tenantId), dbVersion, map);
	}

	@Override
	public boolean addRatingOrgPricingCase(String tenantId, String dbVersion) {
		CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_RATING_PRICING_CASE, 0);
		try {
			// 获得机构配置相关信息
			List<Org> orgList = ratingRuleDao.getOrgPricingCase(tenantId);
			if (null != orgList && orgList.size() > 0) {
				List<String> keyList = new ArrayList<String>();
				List<String> errorKeyList = new ArrayList<String>();
				StringBuilder keyStr = new StringBuilder();
				String key;
				for (Org org : orgList) {
					List<OrgOfferOrderRela> orgOfferOrderRelaList = org
							.getOrgOfferOrderRelaList();
					for (OrgOfferOrderRela orgOfferOrderRela : orgOfferOrderRelaList) {
						List<APIPricingCase> apiPricingCaseList = orgOfferOrderRela.getApiPricingCaseList();
						for (APIPricingCase apiPricingCase : apiPricingCaseList) {
							keyStr.append(CacheKey.RATING_PRICING_CASE
									+ org.getOrgId());
							keyStr.append(orgOfferOrderRela.getAppId());
							keyStr.append(apiPricingCase.getProdOfferId());
							keyStr.append(apiPricingCase.getPricingInfoId());
							key = keyStr.toString();
							keyStr.replace(0, keyStr.length(), "");
							CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), apiPricingCase, keyList, errorKeyList, key);
						}
					}
				}
				CacheCommon.afterPutHandler(tenantId, cacheFactory.getCacheClient(), CacheKey.MODULE_RATING_PRICING_CASE, keyList, errorKeyList);
			}
			cacheFactory.getCacheClient().put(tenantId + CacheKey.MODULE_RATING_PRICING_CASE, dbVersion);
			CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_RATING_PRICING_CASE, 1);
		} catch (Exception e) {
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_RATING_PRICING_CASE, e);
		}
		return true;
	}
	
	private Map<String, APISalesOfAPIOfOrg> getRatingApiOrgMap(String tenantId) {
		// 获得API产品销售品几个关联配置相关信息
		List<ApiProductProdOfferOrgRela> apiProductProdOfferOrgRelaList = ratingRuleDao.getApiProductProdOfferOrgRela(tenantId);
		if (apiProductProdOfferOrgRelaList == null || apiProductProdOfferOrgRelaList.isEmpty()) {
			return null;
		}
		String format = "yyyyMMddHHmmss";
		Map<String, List<ApiProductProdOfferOrgRela>> map = new HashMap<String, List<ApiProductProdOfferOrgRela>>();
		Map<String, APISalesOfAPIOfOrg> mapAPISalesOfAPIOfOrg = new HashMap<String, APISalesOfAPIOfOrg>();
		for (ApiProductProdOfferOrgRela apiProductProdOfferOrgRela : apiProductProdOfferOrgRelaList) {
			String key = apiProductProdOfferOrgRela.getOrgId() + "" + apiProductProdOfferOrgRela.getApiId();// 机构ID+API ID
			if (map.get(key) == null) {
				List<ApiProductProdOfferOrgRela> prodOfferList = new ArrayList<ApiProductProdOfferOrgRela>();
				prodOfferList.add(apiProductProdOfferOrgRela);
				map.put(key, prodOfferList);
			} else {
				List<ApiProductProdOfferOrgRela> prodOfferList = map.get(key);
				prodOfferList.add(apiProductProdOfferOrgRela);
			}
		}
		Set<Map.Entry<String, List<ApiProductProdOfferOrgRela>>> entry = map
				.entrySet();
		for (Map.Entry<String, List<ApiProductProdOfferOrgRela>> kv : entry) {
			List<ApiProductProdOfferOrgRela> list = kv.getValue();
			APISalesOfAPIOfOrg aPISalesOfAPIOfOrg = new APISalesOfAPIOfOrg();
			aPISalesOfAPIOfOrg.setApiId(list.get(0).getApiId());
			aPISalesOfAPIOfOrg.setAppId(list.get(0).getAppId());
			aPISalesOfAPIOfOrg.setOrgId(list.get(0).getOrgId());
			List<APISalesOfOrg> salesOfOrgList = new ArrayList<APISalesOfOrg>();

			for (ApiProductProdOfferOrgRela apiProductProdOfferOrgRela : list) {
				APISalesOfOrg aPISalesOfOrg = new APISalesOfOrg();
				aPISalesOfOrg.setProdOfferId(apiProductProdOfferOrgRela
						.getProdOfferId());
				aPISalesOfOrg.setExpDate(DateUtils.getLong(format,
						apiProductProdOfferOrgRela.getExpDate()));
				aPISalesOfOrg.setEffDate(DateUtils.getLong(format,
						apiProductProdOfferOrgRela.getEffDate()));
				salesOfOrgList.add(aPISalesOfOrg);
			}
			aPISalesOfAPIOfOrg.setSalesOfOrgList(salesOfOrgList);
			mapAPISalesOfAPIOfOrg.put(kv.getKey(), aPISalesOfAPIOfOrg);
		}
		return mapAPISalesOfAPIOfOrg;
	}

	private void addApiSalesInto(List<APIComponentPrice> apiComponentPriceList,
			ComponentPrice componentPrice, String format) {
		APISalesInto aPISalesInto = new APISalesInto();
		aPISalesInto.setComponentPriceId(componentPrice.getPriceId());
		aPISalesInto.setEffDate(DateUtils.getLong(format,
				componentPrice.getEffDate()));
		aPISalesInto.setExpDate(DateUtils.getLong(format,
				componentPrice.getExpDate()));
		aPISalesInto
				.setPriceType(Byte.parseByte(componentPrice.getPriceType()));
		SalesInto salesInfo = componentPrice.getSalesInfo();
		aPISalesInto.setCurrencyUnitType(salesInfo.getCurrencyUnitType());
		aPISalesInto.setFreeAmount(salesInfo.getFreeAmount());
		aPISalesInto.setPartyUseRation(salesInfo.getPartyUseRation());
		aPISalesInto.setPriceId(salesInfo.getPriceId());
		apiComponentPriceList.add(aPISalesInto);
	}

	private void addApiRecurringFee(
			List<APIComponentPrice> apiComponentPriceList,
			ComponentPrice componentPrice, String format) {
		APIRecurringFee aPIRecurringFee = new APIRecurringFee();
		aPIRecurringFee.setComponentPriceId(componentPrice.getPriceId());
		aPIRecurringFee.setEffDate(DateUtils.getLong(format,
				componentPrice.getEffDate()));
		aPIRecurringFee.setExpDate(DateUtils.getLong(format,
				componentPrice.getExpDate()));
		aPIRecurringFee.setPriceType(Byte.parseByte(componentPrice
				.getPriceType()));
		RecurringFee recurringFee = componentPrice.getRecurringFee();
		if (recurringFee != null) {
			aPIRecurringFee.setCurrencyUnitValue(recurringFee
					.getCurrencyUnitValue());
			aPIRecurringFee.setPriceId(recurringFee.getPriceId());
		}
		apiComponentPriceList.add(aPIRecurringFee);
	}

	private void addComponentPrice(List<APIComponentPrice> apiComponentPriceList, ComponentPrice componentPrice, String format) {
		APIBillingDiscount aPIBillingDiscount = new APIBillingDiscount();
		aPIBillingDiscount.setComponentPriceId(componentPrice.getPriceId());
		aPIBillingDiscount.setEffDate(DateUtils.getLong(format,
				componentPrice.getEffDate()));
		aPIBillingDiscount.setExpDate(DateUtils.getLong(format,
				componentPrice.getExpDate()));
		aPIBillingDiscount.setPriceType(Byte.parseByte(componentPrice
				.getPriceType()));
		BillingDiscount billingDiscount = componentPrice.getBillingDiscount();
		if(billingDiscount!=null){
			aPIBillingDiscount.setCurrencyUnitType(billingDiscount
					.getCurrencyUnitType());
			aPIBillingDiscount.setFromType(Byte.parseByte(billingDiscount
					.getPromType()));
//			aPIBillingDiscount.setMaxiMum(billingDiscount.getMaxiMum());
			aPIBillingDiscount.setCalcType(billingDiscount.getCalcType());
			aPIBillingDiscount.setPriceId(billingDiscount.getPriceId());
			List<APIBillingDiscountInfo> discountInfoList = new ArrayList<APIBillingDiscountInfo>();
			for (RatingCurverDetail ratingCurverDetail : billingDiscount
					.getDiscountInfoList()) {
				APIBillingDiscountInfo aPIBillingDiscountInfo = new APIBillingDiscountInfo();
				apiBillingDiscountInfoInit(aPIBillingDiscountInfo,
						ratingCurverDetail);
				discountInfoList.add(aPIBillingDiscountInfo);
			}
			aPIBillingDiscount.setDiscountInfoList(discountInfoList);
		}
		apiComponentPriceList.add(aPIBillingDiscount);
	}

	private void billInfoListAdd(List<APIBaseTariffBillInfo> billInfoList,
			RatingCurverDetail ratingCurverDetail) {
		APIBaseTariffBillInfo aPIBaseTariffBillInfo = new APIBaseTariffBillInfo();
		aPIBaseTariffBillInfo.setPriceId(ratingCurverDetail.getPriceId());
//		aPIBaseTariffBillInfo.setBaseValue(ratingCurverDetail.getBaseVal());
		if(ratingCurverDetail.getDenominator()!=null){
			aPIBaseTariffBillInfo.setDenominator(ratingCurverDetail
					.getDenominator());
		}
		if(ratingCurverDetail.getNumerator()!=null){
			aPIBaseTariffBillInfo.setNumberator(ratingCurverDetail.getNumerator());
		}
		aPIBaseTariffBillInfo.setEndValue(ratingCurverDetail.getEndVal());
		if(ratingCurverDetail.getRateVal()!=null){
			aPIBaseTariffBillInfo.setRateValue(new Long(ratingCurverDetail.getRateVal()));
		}
		aPIBaseTariffBillInfo.setStartValue(ratingCurverDetail.getStartval());
		billInfoList.add(aPIBaseTariffBillInfo);
	}

	private void apiBaseTariffBillInit(APIBaseTariffBill aPIBaseTariffBill,
			ComponentPrice componentPrice, BasicTariff basicTariff,
			String format) {
		aPIBaseTariffBill.setComponentPriceId(componentPrice.getPriceId());
		aPIBaseTariffBill.setPriceType(Byte.parseByte(componentPrice
				.getPriceType()));
		aPIBaseTariffBill.setEffDate(DateUtils.getLong(format,
				componentPrice.getEffDate()));
		aPIBaseTariffBill.setExpDate(DateUtils.getLong(format,
				componentPrice.getExpDate()));
		aPIBaseTariffBill.setRatingUnitValue(basicTariff.getRatingUnitVal());
		aPIBaseTariffBill.setRatingUnitType(Byte.parseByte(String
				.valueOf(basicTariff.getRatingUnitType())));
		aPIBaseTariffBill.setRateType(basicTariff.getRateType());
	}

	private void apiBillingDiscountInfoInit(
			APIBillingDiscountInfo aPIBillingDiscountInfo,
			RatingCurverDetail ratingCurverDetail) {
//		if(ratingCurverDetail.getBaseVal()!=null){
//			aPIBillingDiscountInfo.setBaseValue(ratingCurverDetail.getBaseVal());
//		}
		aPIBillingDiscountInfo.setDenominator(ratingCurverDetail
				.getDenominator());
		aPIBillingDiscountInfo.setEndValue(ratingCurverDetail.getEndVal());
		aPIBillingDiscountInfo.setNumberator(ratingCurverDetail.getNumerator());
		aPIBillingDiscountInfo.setPriceId(ratingCurverDetail.getPriceId());
//		if(ratingCurverDetail.getRateVal()!=null){
//			aPIBillingDiscountInfo.setRateValue(ratingCurverDetail.getRateVal());
//		}
		aPIBillingDiscountInfo.setStartValue(ratingCurverDetail.getStartval());
	}

	private void aPISalesOfPricingInit(APISalesOfPricing aPISalesOfPricing,
			PricePlan pricePlan, String format) {
		aPISalesOfPricing.setPricingInfoId(pricePlan.getPricingInfoId());
		aPISalesOfPricing.setPricingName(pricePlan.getPricingName());
		aPISalesOfPricing.setCreateDate(DateUtils.getStringByDate(format,
				pricePlan.getCreateDate()));
		aPISalesOfPricing.setStatusCd(pricePlan.getStatusCd());
		aPISalesOfPricing.setStatusDate(DateUtils.getStringByDate(format,
				pricePlan.getStatusDate()));
		if(pricePlan.getExpDate()!=null){
			aPISalesOfPricing.setExpDate(DateUtils.getLong(format,
					pricePlan.getExpDate()));
		}
		if(pricePlan.getEffDate()!=null){
			aPISalesOfPricing.setEffDate(DateUtils.getLong(format,
					pricePlan.getEffDate()));
		}
		aPISalesOfPricing.setIsMain(pricePlan.getIsMain());
		aPISalesOfPricing.setBillingPriority(pricePlan.getBillingPriority());
		aPISalesOfPricing.setCycleType(Byte.parseByte(String.valueOf(pricePlan
				.getCycleType())));
		aPISalesOfPricing.setCycleUnit(Byte.parseByte(String.valueOf(pricePlan
				.getCycleUnit())));
		aPISalesOfPricing.setApplicType(Byte.parseByte(String.valueOf(pricePlan
				.getApplicType())));
	}

	private Map<String, APIBillingCycleOfOrg> getRatingBillingCycleMap(String tenantId) {
		try{
			List<BillingCycle> billingCycleList = ratingRuleDao.getBillingCycle(tenantId);
			if (null == billingCycleList || billingCycleList.isEmpty()) {
				return null;
			}
			String format = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat sdfForTime = new SimpleDateFormat(format);
			Map<String, List<BillingCycle>> mapBillingCycle = new HashMap<String, List<BillingCycle>>();
			Map<String, APIBillingCycleOfOrg> map = new HashMap<String, APIBillingCycleOfOrg>();
			for (BillingCycle billingCycle : billingCycleList) {
				String key = CacheKey.RATING_BILLING_CYCLE + billingCycle.getOrgId() + ""
						+ billingCycle.getProdOfferId() + ""
						+ billingCycle.getPricingInfoId() + ""
						+ billingCycle.getComponentPriceId();
				if (cacheFactory.getCacheClient().get(key) == null) {
					billingCycle.setExp(DateUtils.getLong(format, sdfForTime
							.parse(CacheUtil.getLastDay(billingCycle.getExpDate()
									.getTime()))));
					billingCycle.setEff(DateUtils.getLong(format, sdfForTime
							.parse(CacheUtil.getFirstDay(billingCycle.getEffDate()
									.getTime()))));
	
					if (mapBillingCycle.get(key) == null) {
						List<BillingCycle> list = new ArrayList<BillingCycle>();
						list.add(billingCycle);
						mapBillingCycle.put(key, list);
					} else {
						List<BillingCycle> list = mapBillingCycle.get(key);
						list.add(billingCycle);
					}
				}
			}
			Set<Map.Entry<String, List<BillingCycle>>> entry = mapBillingCycle
					.entrySet();
			for (Map.Entry<String, List<BillingCycle>> kv : entry) {
				List<BillingCycle> list = kv.getValue();
				APIBillingCycleOfOrg aPIBillingCycleOfOrg = new APIBillingCycleOfOrg();
				aPIBillingCycleOfOrg.setOrgId(list.get(0).getOrgId());
				aPIBillingCycleOfOrg.setProOfferId(list.get(0).getProdOfferId());
				aPIBillingCycleOfOrg
						.setPicingInfoId(list.get(0).getPricingInfoId());
				aPIBillingCycleOfOrg.setComponentPriceId(list.get(0)
						.getComponentPriceId());
				List<APIBillingCycleOfDate> listAPIBillingCycleOfDate = new ArrayList<APIBillingCycleOfDate>();
				for (BillingCycle billing : list) {
					APIBillingCycleOfDate aPIBillingCycleOfDate = new APIBillingCycleOfDate();
					aPIBillingCycleOfDate.setBillingEndDate(billing.getExp());
					aPIBillingCycleOfDate.setBillingStartDate(billing.getEff());
					aPIBillingCycleOfDate.setUseUnit(billing.getUseUnit());
					listAPIBillingCycleOfDate.add(aPIBillingCycleOfDate);
				}
				aPIBillingCycleOfOrg
						.setBillingCycleDateList(listAPIBillingCycleOfDate);
				map.put(kv.getKey(), aPIBillingCycleOfOrg);
			}
			return map;
		}catch(Exception e){
			log.error("get rating billing cycle map error!", e);
			return null;
		}
	}

	@Override
	public boolean addRatingSettlement(String tenantId, String dbVersion) {
		CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_RATING_SETTLEMENT, 0);
		Map<String,List<Map<String,String>>> resultListMap=new  ConcurrentHashMap<String, List<Map<String,String>>>();
		try {
			// 获得结算相关信息
			List<Map<String,String>> settlementInfoList=ratingRuleDao.getSettlementData(tenantId);
			if(null != settlementInfoList && settlementInfoList.size()>0){
				List<Map<String,String>> mapList=new ArrayList<Map<String,String>>();
				List<String> keyList = new ArrayList<String>();
				List<String> errorKeyList = new ArrayList<String>();
				for(Map<String,String> settlementMap:settlementInfoList){
					Map<String,String> transferMap=new ConcurrentHashMap<String, String>();
					Iterator it=settlementMap.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry=(Map.Entry)it.next();
						Object key=entry.getKey();
						Object keyValue=entry.getValue();
						StringBuffer keyFinal=new StringBuffer("");
						String keyFinalStr;
						if(key.toString().indexOf('_')!=-1){
							String[] keyStrArray=key.toString().split("_");
							for(String keyStr:keyStrArray){
								keyFinal.append(keyStr.substring(0, 1).toUpperCase());
								keyFinal.append(keyStr.substring(1).toLowerCase());
							}
						}
						keyFinalStr=keyFinal.substring(0, 1).toLowerCase()+keyFinal.substring(1);
						transferMap.put(keyFinalStr, keyValue.toString());
					}	
					String orgAndProdOfferId=transferMap.get("partnerCode")+transferMap.get("servCode");
					if(transferMap.containsKey("partnerCode")&&transferMap.containsKey("servCode")){
						if(resultListMap.get(orgAndProdOfferId)==null){
							mapList.clear();
							mapList.add(transferMap);
						}else {
							mapList.add(transferMap);
						}
						resultListMap.put(orgAndProdOfferId,mapList);
						String key=CacheKey.RATING_SETTLEMENT+orgAndProdOfferId;
						CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), mapList, keyList,
								errorKeyList, key);
					}
				}
				CacheCommon.afterPutHandler(tenantId, cacheFactory.getCacheClient(), CacheKey.MODULE_RATING_SETTLEMENT, keyList, errorKeyList);
		}
			cacheFactory.getCacheClient().put(tenantId + CacheKey.MODULE_RATING_SETTLEMENT, dbVersion);
			CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_RATING_SETTLEMENT, 1);
		} catch (Exception e) {
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_RATING_SETTLEMENT, e);
		}
		return true;
	}

	@Override
	public boolean addRatingProdOffer(String tenantId, String dbVersion) {
		CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_RATING_PROD_OFFER, 0);
		try {
			String format = "yyyyMMddHHmmss";
			// 获得符合状态的销售品配置相关信息
			List<ProdOffer> prodOfferList = ratingRuleDao.getProdOffer(tenantId);
			if (null != prodOfferList && prodOfferList.size() > 0) {
				List<String> keyList = new ArrayList<String>();
				List<String> errorKeyList = new ArrayList<String>();
				for (ProdOffer prodOffer : prodOfferList) {
					String key = CacheKey.RATING_PROD_OFFER
							+ prodOffer.getProdOfferId();// 销售品ID
					APISalesOfOrg aPISalesOfOrg = new APISalesOfOrg();
					aPISalesOfOrg.setProdOfferId(prodOffer.getProdOfferId());
					Date expDate = prodOffer.getExpDate();
					if (expDate != null) {
						aPISalesOfOrg.setExpDate(DateUtils.getLong(format,
								expDate));
					}
					Date effDate = prodOffer.getEffDate();
					if (effDate != null) {
						aPISalesOfOrg.setEffDate(DateUtils.getLong(format,
								effDate));
					}
					List<APISalesOfPricing> pricingList = new ArrayList<APISalesOfPricing>();
					// 销售品定价计划
					for (ProdOfferPricing prodOfferPricing : prodOffer
							.getProdOfferPricingList()) {
						// 定价计划
						for (PricePlan pricePlan : prodOfferPricing
								.getPricePlanList()) {
							APISalesOfPricing aPISalesOfPricing = new APISalesOfPricing();
							aPISalesOfPricingInit(aPISalesOfPricing, pricePlan,
									format);
							List<APIComponentPrice> apiComponentPriceList = new ArrayList<APIComponentPrice>();
							// 组合资费
							for (ComponentPrice componentPrice : pricePlan
									.getComponentPriceList()) {
								// 基本资费
								if ("0".equals(componentPrice.getPriceType())) {
									APIBaseTariffBill aPIBaseTariffBill = new APIBaseTariffBill();
									BasicTariff basicTariff = componentPrice
											.getBasicTariff();
									if(basicTariff!=null){
										apiBaseTariffBillInit(aPIBaseTariffBill,
												componentPrice, basicTariff, format);
										List<APIBaseTariffBillInfo> billInfoList = new ArrayList<APIBaseTariffBillInfo>();
										// 资费详情
										for (RatingCurverDetail ratingCurverDetail : basicTariff
												.getRatingCurverDetailList()) {
											billInfoListAdd(billInfoList,
													ratingCurverDetail);
										}
										aPIBaseTariffBill
												.setBillInfoList(billInfoList);
										apiComponentPriceList
												.add(aPIBaseTariffBill);
									}
								}
								// 账务优惠
								else if ("8".equals(componentPrice
										.getPriceType())) {
									addComponentPrice(apiComponentPriceList,
											componentPrice, format);
								}
								// 固定费
								else if ("3".equals(componentPrice
										.getPriceType())) {
									addApiRecurringFee(apiComponentPriceList,
											componentPrice, format);
								}
								// 分成
								else if ("14".equals(componentPrice
										.getPriceType())) {
									addApiSalesInto(apiComponentPriceList, componentPrice, format);
								}
							}
							aPISalesOfPricing
									.setApiComponentPriceList(apiComponentPriceList);
							pricingList.add(aPISalesOfPricing);
						}
					}
					aPISalesOfOrg.setPricingList(pricingList);
					CacheCommon.putObjectIntoCache(tenantId, cacheFactory.getCacheClient(), aPISalesOfOrg, keyList, errorKeyList,
							key);
				}
				CacheCommon.afterPutHandler(tenantId, cacheFactory.getCacheClient(), CacheKey.MODULE_RATING_PROD_OFFER, keyList, errorKeyList);
			}
			cacheFactory.getCacheClient().put(tenantId + CacheKey.MODULE_RATING_PROD_OFFER, dbVersion);
			CacheCommon.logDebugMessage(log, tenantId, CacheKey.MODULE_RATING_PROD_OFFER, 1);
		} catch (Exception e) {
			return CacheCommon.excetionHandler(log, cacheFactory.getCacheClient(), tenantId, CacheKey.MODULE_RATING_PROD_OFFER, e);
		}
		return true;
	}


	public boolean addRating(String tenantId, String moduleName, String dbVersion) {
		if (CacheKey.MODULE_RATING_PROD_OFFER.equals(moduleName)) {
			return addRatingProdOffer(tenantId, dbVersion);
		} else if (CacheKey.MODULE_RATING_BILLING_CYCLE.equals(moduleName)) {
			return addRatingBillingCycle(tenantId, dbVersion);
		} else if (CacheKey.MODULE_RATING_API_ORG.equals(moduleName)) {
			return addRatingApiOrgToProdOffer(tenantId, dbVersion);
		} else if (CacheKey.MODULE_RATING_PRICING_CASE.equals(moduleName)) {
			return addRatingOrgPricingCase(tenantId, dbVersion);
		} else if (CacheKey.MODULE_RATING_ORG.equals(moduleName)) {
			return addRatingOrg(tenantId, dbVersion);
		} else if (CacheKey.MODULE_RATING_API.equals(moduleName)) {
			return addRatingApi(tenantId, dbVersion);
		}else if(CacheKey.MODULE_RATING_SETTLEMENT.equals(moduleName)){
			return addRatingSettlement(tenantId, dbVersion);
		}
		return true;
	}
}
