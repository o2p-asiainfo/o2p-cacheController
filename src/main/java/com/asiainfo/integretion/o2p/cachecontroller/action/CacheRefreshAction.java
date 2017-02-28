package com.asiainfo.integretion.o2p.cachecontroller.action;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ailk.eaap.o2p.common.cache.IReloadCache;
import com.linkage.rainbow.ui.struts.BaseAction;

public class CacheRefreshAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() {
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getSession().getServletContext());
		IReloadCache reloadCache = (IReloadCache)ctx.getBean("reloadCache");
		reloadCache.addAll(null);
		return SUCCESS;
	}
}
