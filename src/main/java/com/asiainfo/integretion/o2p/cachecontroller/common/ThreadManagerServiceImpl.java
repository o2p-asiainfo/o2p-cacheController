package com.asiainfo.integretion.o2p.cachecontroller.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.Resource;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.ailk.eaap.op2.common.IThreadManagerService;

@Service(value="threadManagerService")
public class ThreadManagerServiceImpl implements IThreadManagerService{

	private final static Log log = LogFactory.getLog(ThreadManagerServiceImpl.class);
	@Resource(name="cacheThreades")
	private CacheThread[] cacheThreades;
	@Resource(name="synTransIdTheades")
	private CacheThread[] synTransIdTheades;
	@Resource(name="synBillingCycleTheades")
	private CacheThread[] synBillingCycleTheades;
	
	private ExecutorService sendMsgService;
	private ExecutorService transSendMsgService;
	private ExecutorService billingCycleSendMsgService;
	
	private int threadNum=1;

	public void start() {
		if(log.isDebugEnabled()){
			log.debug("Thread starting...");
		}
		
		sendMsgService = Executors.newFixedThreadPool(threadNum);
		transSendMsgService = Executors.newFixedThreadPool(threadNum);
		billingCycleSendMsgService = Executors.newFixedThreadPool(threadNum);
		
		cacheThreades[0].setReloadRun(true);
		Thread thread=new Thread(cacheThreades[0]);
		thread.setDaemon(true);
		sendMsgService.submit(cacheThreades[0]);
		synTransIdTheades[0].setTransIdSynRun(true);
		Thread synTransIdThread=new Thread(synTransIdTheades[0]);
		synTransIdThread.setDaemon(true);
		transSendMsgService.submit(synTransIdTheades[0]);
		synBillingCycleTheades[0].setBillingCycleSynRun(true);
		Thread synBillingCycleThead=new Thread(synBillingCycleTheades[0]);
		synBillingCycleThead.setDaemon(true);
		billingCycleSendMsgService.submit(synBillingCycleTheades[0]);
	}

	public void stop() {
		if(log.isDebugEnabled()){
			log.debug("Thread stoping...");
		}
		if(cacheThreades.length>0){
			cacheThreades[0].setReloadRun(false);
		}
		sendMsgService.shutdown();
		if(synTransIdTheades.length>0){
			synTransIdTheades[0].setTransIdSynRun(false);
		}
		transSendMsgService.shutdown();
		if(synBillingCycleTheades.length>0){
			synBillingCycleTheades[0].setBillingCycleSynRun(false);
		}
		billingCycleSendMsgService.shutdown();
	}

	public void setThreadNum(int threadNum) {
		this.threadNum = threadNum;
	}
	public void setSendMsgService(ExecutorService sendMsgService) {
		this.sendMsgService = sendMsgService;
	}
	public void setCacheThreades(CacheThread[] cacheThreades) {
		if(!ArrayUtils.isEmpty(cacheThreades)){
			this.cacheThreades = (CacheThread[]) ArrayUtils.clone(cacheThreades);
		}
	}
	public void setSynTransIdTheades(CacheThread[] synTransIdTheades) {
		if(!ArrayUtils.isEmpty(synTransIdTheades)){
			this.synTransIdTheades = (CacheThread[]) ArrayUtils.clone(synTransIdTheades);
		}
	}
	public void setTransSendMsgService(ExecutorService transSendMsgService) {
		this.transSendMsgService = transSendMsgService;
	}
	public void setSynBillingCycleTheades(CacheThread[] synBillingCycleTheades) {
		if(!ArrayUtils.isEmpty(synBillingCycleTheades)){
			this.synBillingCycleTheades = (CacheThread[]) ArrayUtils.clone(synBillingCycleTheades);
		}
	}

}
