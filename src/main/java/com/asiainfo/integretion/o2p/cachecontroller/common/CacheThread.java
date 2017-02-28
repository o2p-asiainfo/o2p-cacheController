package com.asiainfo.integretion.o2p.cachecontroller.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ailk.eaap.o2p.common.cache.IReloadCache;

public class CacheThread implements Runnable{

	private static Log log = LogFactory.getLog(CacheThread.class);
	private IReloadCache reloadCache;
	private boolean reloadRun = false;
	private boolean transIdSynRun = false;
	private boolean billingCycleSynRun = false;
	private String refreshTime = "60000";
	private String synTransIdTime = "480000";
	private String synBillingCycleTime = "120000";
	
	
	public void run() {
		while(true){
			try{
				while(reloadRun){
					reloadCache.reloadCache();
					Thread.sleep(Integer.valueOf(refreshTime));
				}
				while(transIdSynRun){
					reloadCache.synCacheToDb(2);
					Thread.sleep(Integer.valueOf(synTransIdTime));
				}
				while(billingCycleSynRun){
					reloadCache.synCacheToDb(3);
					Thread.sleep(Integer.valueOf(synBillingCycleTime));
				}
			}catch(Exception e ){
				log.error("error occured!", e);
			}
		}
	}
	
	public IReloadCache getReloadCache() {
		return reloadCache;
	}
	public void setReloadCache(IReloadCache reloadCache) {
		this.reloadCache = reloadCache;
	}
	public void setRefreshTime(String refreshTime) {
		this.refreshTime = refreshTime;
	}
	public void setTransIdSynRun(boolean transIdSynRun) {
		this.transIdSynRun = transIdSynRun;
	}
	public void setSynTransIdTime(String synTransIdTime) {
		this.synTransIdTime = synTransIdTime;
	}
	public void setSynBillingCycleTime(String synBillingCycleTime) {
		this.synBillingCycleTime = synBillingCycleTime;
	}
	public void setBillingCycleSynRun(boolean billingCycleSynRun) {
		this.billingCycleSynRun = billingCycleSynRun;
	}
	public void setReloadRun(boolean reloadRun) {
		this.reloadRun = reloadRun;
	}
}
