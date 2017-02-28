<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="com.asiainfo.integretion.o2p.cachecontroller.smo.ICacheService"%>

<%
long startMili=System.currentTimeMillis();
ApplicationContext context = WebApplicationContextUtils. getWebApplicationContext(application);
ICacheService cacheService =(ICacheService)context.getBean("cacheService");
if(cacheService.cacheService(request.getParameter("module_name"), "1") && cacheService.cacheService(request.getParameter("module_name"), "2")){
	out.println("<span style='color:green'>refresh success!</span>");
	out.println("used time:" + ((double)(System.currentTimeMillis() - startMili)/1000) + "s");
}else{
	out.print("<span style='color:red'>refresh failed!</span>");
}
%>
<button onClick="window.location.href='index.jsp'">back</button>
