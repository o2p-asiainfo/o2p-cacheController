package com.asiainfo.integretion.o2p.cachecontroller.smo.impl;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder;
import com.ailk.eaap.o2p.common.util.CacheUtil;
import com.ailk.eaap.op2.bo.BillingCycle;
import com.asiainfo.integration.o2p.billing.APIBillingCycleOfDate;
import com.asiainfo.integration.o2p.billing.APIBillingCycleOfOrg;
import com.asiainfo.integretion.o2p.cachecontroller.common.BillingCycleCacheUtil;
import com.asiainfo.integretion.o2p.cachecontroller.dao.ICacheDao;
import com.asiainfo.integretion.o2p.cachecontroller.dao.IRatingRuleDao;
import com.asiainfo.integretion.o2p.cachecontroller.smo.IDataSynchronizeService;

@Service(value="dataSynchronizeService")
public class DataSynchronizeServiceImpl implements IDataSynchronizeService {
	
	public static final Log log = LogFactory.getLog(DataSynchronizeServiceImpl.class);
	@Resource(name="cacheDao")
	private ICacheDao cacheDao;
	public void setCacheDao(ICacheDao cacheDao) {
		this.cacheDao = cacheDao;
	}
	@Resource(name="cacheFactory")
	private CacheFactory<String, Object> cacheFactory;
	@Resource(name="ratingRuleDao")
	private IRatingRuleDao ratingRuleDao;
	@Value("${cache.billingCycle.valid.count}")
	private int validCount = 6;
	@Value("${cache.syn2db.switch.transSeq}")
	private boolean synStatus = true;
	

	@Override
	public boolean synBillingCycle() {
		if(!BillingCycleCacheUtil.isNeedSynchronize(cacheFactory.getCacheClient(), "BILLING_CYCLE")){
			if(log.isDebugEnabled()){
				log.debug("------BILLING_CYCLE is synchronized by other server!");
			}
			return true;
		}
		if(log.isDebugEnabled()){
			log.debug("-----------------------synchronize billing cycle from cache to db start-----------------------");
		}
		try{
			//get keyList
			List<String> keyList = ratingRuleDao.getKeyList();
			if(keyList!=null && !keyList.isEmpty()){
				Calendar calendar = Calendar.getInstance();
				for(String key:keyList){
					Object obj = cacheFactory.getCacheClient().get(CacheKey.RATING_BILLING_CYCLE + key);
					if(obj!=null){
						APIBillingCycleOfOrg aPIBillingCycleOfOrg = (APIBillingCycleOfOrg)obj;
						List<APIBillingCycleOfDate> aPIBillingCycleOfDateList= aPIBillingCycleOfOrg.getBillingCycleDateList();
						BillingCycle billingCycle = new BillingCycle();
						billingCycle.setOrgId(aPIBillingCycleOfOrg.getOrgId());
						billingCycle.setPricingInfoId(aPIBillingCycleOfOrg.getPicingInfoId());
						billingCycle.setProdOfferId(aPIBillingCycleOfOrg.getProOfferId());
						billingCycle.setComponentPriceId(aPIBillingCycleOfOrg.getComponentPriceId());
						if(aPIBillingCycleOfDateList!=null && !aPIBillingCycleOfDateList.isEmpty()){
							for(int i = aPIBillingCycleOfDateList.size() -1; i>=(aPIBillingCycleOfDateList.size()>validCount?(aPIBillingCycleOfDateList.size()-validCount):0); i--){
								APIBillingCycleOfDate aPIBillingCycleOfDate = aPIBillingCycleOfDateList.get(i);
								calendar.setTimeInMillis(aPIBillingCycleOfDate.getBillingStartDate());
								billingCycle.setEffDate(calendar.getTime());
								calendar.setTimeInMillis(aPIBillingCycleOfDate.getBillingEndDate());
								billingCycle.setExpDate(calendar.getTime());
								billingCycle.setUseUnit(aPIBillingCycleOfDate.getUseUnit());
								ratingRuleDao.setBillingCycle(billingCycle);
							}
						}
					}
				}
			}
		}catch(Exception e){
			log.error("synchronize billing cycle from cache to db faild!", e);
		}
		if(log.isDebugEnabled()){
			log.debug("-----------------------synchronize billing cycle from cache to db end-----------------------");
		}
		return true;
	}
	
	@Override
	public boolean synchronizeCache2Db() {
		try {
			if (!synStatus) {
				return true;
			}
			if (!CacheUtil.isNeedSynchronize(cacheFactory.getCacheClient(), "TRAN_ID_SEQ")) {
				logDebug("------TRAN_ID_SEQ is synchronized by other server!");
				return true;
			}
			logDebug("-----------------------synchronize tranIdSeq from cache to db start-----------------------");
			boolean returnStatus = synchronizeTranIdSeq();
			logDebug("-----------------------synchronize tranIdSeq from cache to db end-----------------------");
			return returnStatus;
		} catch (Exception e) {
			log.error("synchronize tranIdSeq from cache to db is error", e);
			return false;
		}
	}

	public boolean synchronizeTranIdSeq() {
		try {
			// put data into cache from db
			int seq = cacheDao.getServerLocalSeq();
			cacheFactory.getCacheClient()
					.put(CacheKey.DB_SERVER_LOCAL_SEQ, seq);
			Map<String, String> logoMap = cacheDao.getServerLocalLogoMap();
			if (logoMap != null) {
				cacheFactory.getCacheClient().put(
						CacheKey.DB_SERVER_LOCAL_LOGO, logoMap);
			}
			Map<String, Integer> tranIdMap = cacheDao.getTranIdSeqMap();
			if (tranIdMap != null && !tranIdMap.isEmpty()) {
				Map<String, Integer> tranIdMapNotNull = new HashMap<String, Integer>();
				Set<Map.Entry<String, Integer>> entry = tranIdMap.entrySet();
				for (Map.Entry<String, Integer> kv : entry) {
					if (kv.getValue() != null) {
						tranIdMapNotNull.put(kv.getKey(),
								tranIdMap.get(kv.getKey()));
					}
				}
				cacheFactory.getCacheClient().put(
						CacheKey.DB_SERVER_COMPONENT_SEQ, tranIdMapNotNull);
			}
			Object localSeq = cacheFactory.getCacheClient().get(
					CacheKey.LOCALSEQ);
			if (localSeq == null) {
				if (log.isDebugEnabled()) {
					log.debug(CacheKey.LOCALSEQ + " is null in cache!");
				}
				return true;
			}
			if (seq != Integer.valueOf(localSeq.toString())) {
				if (seq == -1) {
					cacheDao.insertServerLocalSeq((Integer) localSeq);
				} else {
					cacheDao.updateServerLocalSeq((Integer) localSeq);
				}
			}
			dealForServers(localSeq, tranIdMap, logoMap);
		} catch (Exception e) {
			log.error("synchronize data from cache to db failed!", e);
			return false;
		}
		return true;
	}
	
	private void dealForServers(Object localSeq, Map<String, Integer> tranIdMap, Map<String, String> logoMap){
		for (int i = Integer.valueOf(localSeq.toString()); i > 0; i--) {//default Local_ID_Number value is 3
			int len = Integer.valueOf(ZKCfgCacheHolder.PROP_ITEMS.getProperty("Local_ID_Number")==null?"3":ZKCfgCacheHolder.PROP_ITEMS.getProperty("Local_ID_Number"));
			String localSeqStr = ("0000" + localSeq)
					.substring(("0000" + localSeq).length() - len);
			Object ipPort = cacheFactory.getCacheClient().get(localSeqStr);
			if (ipPort == null) {
				log.error("There is no ipPort store in cache for localSeq "
						+ localSeqStr + "!");
			} else {
				Map<String, String> paramMap = new HashMap<String, String>();
				if (logoMap == null || !logoMap.containsValue(localSeqStr)) {
					paramMap.put(CacheKey.LOCALSEQ, localSeqStr);
					paramMap.put("IPPORT", ipPort.toString());
					cacheDao.insertServerLocalLogo(paramMap);
					// refresh cache with key DB_SERVER_LOCAL_LOGO
					Map<String, String> newLogoMap = cacheDao
							.getServerLocalLogoMap();
					cacheFactory.getCacheClient().put(
							CacheKey.DB_SERVER_LOCAL_LOGO, newLogoMap);
				}
			}
			@SuppressWarnings("unchecked")
			List<String> componentKeyList = (List<String>) cacheFactory.getCacheClient().get(CacheKey.MODULE_COMPONENT.replace("MODULE", "KEY_LIST"));
			if (componentKeyList == null || componentKeyList.isEmpty()) {
				log.warn("There is no component!");
			} else {
				Map<String, String> paramMap = new HashMap<String, String>();
				for (String code : componentKeyList) {
					code = code.substring(CacheKey.Component.length());
					if (StringUtils.isEmpty(code)) {
						continue;
					}
					Object tranIdSeqObj = cacheFactory.getCacheClient()
							.get(localSeqStr + code);
					String tranIdSeq = tranIdSeqObj == null ? null
							: tranIdSeqObj.toString();
					paramMap.put(CacheKey.LOCALSEQ, localSeqStr);
					paramMap.put("COMPONENT_CODE", code);
					paramMap.put("TRANIDSEQ", tranIdSeq);
					if (tranIdMap == null
							|| !tranIdMap.containsKey(localSeqStr + code)) {
						cacheDao.insertServerComponentSeq(paramMap);
						synchronizeTranIdSeq();
					}
					if (tranIdSeq != null
							&& tranIdMap != null
							&& tranIdMap.containsKey(localSeqStr + code)
							&& (tranIdMap.get(localSeqStr + code) == null || (tranIdMap
									.get(localSeqStr + code) - 1000) != Integer
									.valueOf(tranIdSeq))) {
						cacheDao.updateServerComponentSeq(paramMap);
						synchronizeTranIdSeq();
					}
				}
			}
		}
	}

	public void setCacheFactory(CacheFactory<String, Object> cacheFactory) {
		this.cacheFactory = cacheFactory;
	}
	public void setRatingRuleDao(IRatingRuleDao ratingRuleDao) {
		this.ratingRuleDao = ratingRuleDao;
	}
	public void setValidCount(int validCount) {
		this.validCount = validCount;
	}
	private static void logDebug(String content) {
		if (log.isDebugEnabled()) {
			log.debug(content);
		}
	}

}
