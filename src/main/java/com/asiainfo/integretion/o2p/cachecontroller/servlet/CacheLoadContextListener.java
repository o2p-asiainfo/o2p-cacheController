package com.asiainfo.integretion.o2p.cachecontroller.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ailk.eaap.op2.common.IThreadManagerService;


public class CacheLoadContextListener  implements ServletContextListener {
	
	private IThreadManagerService threadManagerService;

	public void contextDestroyed(ServletContextEvent sce) {
		threadManagerService.stop();
	}

	public void contextInitialized(ServletContextEvent event) {
		ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
		threadManagerService = (IThreadManagerService)context.getBean("threadManagerService");
		threadManagerService.start();
	}

}
