package com.asiainfo.integretion.o2p.cachecontroller.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.util.Constant;
import com.asiainfo.integration.o2p.session.web.http.CookieUtil;
import com.asiainfo.integretion.o2p.cachecontroller.smo.ICacheService;

/**
 * Servlet implementation class SearchKeyServlet
 */
public class SearchKeyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchKeyServlet() {
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
		ApplicationContext context = WebApplicationContextUtils. getWebApplicationContext(request.getSession().getServletContext());
		ICacheService cacheService =(ICacheService)context.getBean("cacheService");
		PrintWriter pw = response.getWriter();
		String keyName = request.getParameter(CacheKey.KEY_NAME)==null?null:request.getParameter(CacheKey.KEY_NAME).toString();
		if(keyName!=null){
			String tenantId = CookieUtil.getTenantId(request);
			Object obj = cacheService.getKey(tenantId + keyName);
			if(obj==null){
				pw.write("There is no object in cache for keyName you check for!");
			}else{
				pw.write("The object with keyName you check for has been store in cache!");
			}
		}
		if(request.getAttribute("err")!=null){
			pw.write(request.getAttribute("err")+"");
		}
		pw.flush();
		pw.close();
	}

}
