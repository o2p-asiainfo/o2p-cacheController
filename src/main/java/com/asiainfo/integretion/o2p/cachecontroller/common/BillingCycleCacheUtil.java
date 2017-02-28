package com.asiainfo.integretion.o2p.cachecontroller.common;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ailk.eaap.o2p.common.cache.ICache;
import com.ailk.eaap.o2p.common.util.CacheUtil;

public final class BillingCycleCacheUtil {
	
	private static String serverIpPort = "";
	private static String runningId = "";
	private static String runningCount = "";
	private static String lastRunningId = "";
	private static String lastRunningCount = "";
	private static int stopCount = 0;
	
	private static final Log log = LogFactory.getLog(BillingCycleCacheUtil.class);
	
	private BillingCycleCacheUtil(){}
	
	public static boolean isNeedSynchronize(ICache<String, Object> cache, String mName){
		try{
			Object obj = cache.get(mName);
			if(obj==null){
				cache.put(mName, 1);
				if(StringUtils.isEmpty(serverIpPort)){
					serverIpPort = CacheUtil.getServerId();
				}
				cache.put(mName + "_RUNNING_ID", serverIpPort);
				cache.put(mName + "_RUNNING_COUNT", 1);
				return true;
			}else{
				runningId = (String)cache.get(mName + "_RUNNING_ID");
				if(StringUtils.isEmpty(serverIpPort)){
					serverIpPort = CacheUtil.getServerId();
				}
				if(runningId.equals(serverIpPort)){
					cache.put(mName + "_RUNNING_COUNT", 1 + (Integer.valueOf(cache.get(mName + "_RUNNING_COUNT").toString())));
					stopCount = 0;
					return true;
				}else{
					runningCount = cache.get(mName + "_RUNNING_COUNT").toString();
					if(runningId.equals(lastRunningId) && runningCount.equals(lastRunningCount)){
						stopCount = stopCount + 1;
						if(stopCount>2){
							String nowRunningId = cache.get(mName + "_RUNNING_ID").toString();
							if(nowRunningId.equals(runningId)){
								cache.put(mName + "_RUNNING_ID", serverIpPort);
								cache.put(mName + "_RUNNING_COUNT", 1);
								return true;
							}
						}
						return false;
					}else{
						stopCount = 0;
						lastRunningId = runningId;
						lastRunningCount = runningCount;
						return false;
					}
				}
			}
		}catch(Exception e){
			log.error(e.getCause());
			return false;
		}
	}

}
