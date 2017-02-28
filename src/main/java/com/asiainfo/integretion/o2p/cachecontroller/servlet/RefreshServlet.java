package com.asiainfo.integretion.o2p.cachecontroller.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ailk.eaap.o2p.common.cache.IReloadCache;
import com.asiainfo.integration.o2p.session.web.http.CookieUtil;

/**
 * Servlet implementation class RefreshServlet
 */
public class RefreshServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RefreshServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		long startMili=System.currentTimeMillis();
		ApplicationContext context = WebApplicationContextUtils. getWebApplicationContext(request.getSession().getServletContext());
		IReloadCache reloadCache =(IReloadCache)context.getBean("reloadCache");
		String tenantId = CookieUtil.getTenantId(request);
		if(reloadCache.cacheRefreshService(tenantId, request.getParameter("module_name"), "1") && reloadCache.cacheRefreshService(tenantId, request.getParameter("module_name"), "2")){
			pw.write("Refresh Success! "+"Used Time:" + ((double)(System.currentTimeMillis() - startMili)/1000) + "s");
		}else{
			pw.write("Refresh Failed!");
		}
		pw.flush();
		pw.close();
	}

}
