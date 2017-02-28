<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="com.asiainfo.integretion.o2p.cachecontroller.smo.ICacheService"%>
<%@page import="com.ailk.eaap.o2p.common.cache.CacheKey" %>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="com.ailk.eaap.o2p.common.util.Constant"%>
<%@page import="com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder"%>
<%@page import="org.apache.commons.lang.ArrayUtils"%>
<%@page import="com.ailk.eaap.o2p.common.util.CommonUtil"%>
<%@page import="com.asiainfo.integration.o2p.session.web.http.CookieUtil"%>
<%
ApplicationContext context = WebApplicationContextUtils. getWebApplicationContext(application);
ICacheService cacheService =(ICacheService)context.getBean("cacheService");
String synStatus = request.getParameter("synStatus");
String tenantId = CookieUtil.getTenantId(request);
if(tenantId==null || "".equals(tenantId)){
	out.println("cat not get tenant!");
	return;
}
String[] keyList  = (ZKCfgCacheHolder.PROP_ITEMS.get("cache.billing.load.status")!=null && Boolean.valueOf(ZKCfgCacheHolder.PROP_ITEMS.get("cache.billing.load.status").toString()))?((String[]) ArrayUtils.addAll(CacheKey.MODULE_LIST, CacheKey.BILLING_MODULE_LIST)) : CacheKey.MODULE_LIST;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8" />
<title>Cache</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />

 <link href="resources/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
 <link href="resources/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="resources/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="resources/jquery.js" type="text/javascript"></script>
<script type="text/javascript">
function refreshAction(key,button){
	button.disabled = true;
	$(button).text('Refreshing...');
	$.ajax({
		type: "POST",
		async:true,
	    url: "${pageContext.request.contextPath}/RefreshServlet",
	    dataType:'text',
	    data:{module_name:key},
		success:function(msg){ 
			$(button).text('Refresh');
			button.disabled = false;
			alert(msg);
			window.location.href='index.jsp';
          }
     });
}
function onSearch(){
	var value = $('#searchValue').val();
	$.ajax({
		type: "POST",
		async:true,
	    url: "${pageContext.request.contextPath}/SearchKeyServlet",
	    dataType:'text',
	    data:{key_name:value},
		success:function(msg){
			alert(msg);
          }
     });
}
</script>
</head>
<body >
  <div class="container">
    <div class="tab-style-1">
        <!-- BEGIN CONTAINER -->
    <div class=" panel-body ">
     <form class="form-horizontal" role="form" action="#">
      
      <!-- BEGIN PAGE CONTAINER -->
      <div class="tab-content">
      	<!--BEGIN Personal -->
        <div id="" class="tab-pane active">
          <div class="form-actions fluid">
                <table class="table table-bordered table-hover">
                <thead>
                 <tr>
                  <th width="5%"> # </th>
                  <th width="10%"> Module Name(#<%=tenantId %>)</th>
                  <th width="75%"> Status </th>
                  <th width="10%"> Refresh</th>
                 </tr>
                </thead>
                <tbody>
			    <%
				int i = 0;
			    String loadStatus = "F";//finish
			    List<String> errorModuleList = new ArrayList<String>();
				for(String key : keyList){
					key = tenantId + key;
					Object moduleVersion = cacheService.getKey(key);
					i++;
				%>
                 <tr>
                  <td><%=i %></td>
                  <td><%=key.substring(key.indexOf("MODULE_")) %></td>
		        <%if(moduleVersion==null){ loadStatus = "P";//processing%>
				<td style="font-weight:bold">loading...</td>
				<%}else if(moduleVersion!=null && !moduleVersion.equals(CacheKey.MODULE_RELOAD_EXCEPTION)){%>
		        <td style="color:green;font-weight:bold">OK</td>
				<%}else{ 
						loadStatus = "E";//exception
						errorModuleList.add(key.substring(key.indexOf("MODULE_")));
				%>
				<td style="color:red;font-weight:bold">MODULE_RELOAD_EXCEPTION:<%=cacheService.getKey(key.replace("MODULE", "ERROR_CAUSE")) %></td>
				<%} %>
				<td><button type="button" class="btn btn-warning btn-xs" onclick="javascript:refreshAction('<%=key.substring(key.indexOf("MODULE_")) %>',this);">Refresh</button></td>
                 </tr>
                 <%} %>
                 <tr>
                  <td><%=i+1 %></td>
                  <td>MODULE_ALL</td>
                  <%
                  if("E".equals(loadStatus)){ 
                  %> 
                  <td style="color:red;font-weight:bold">Error ocurred in module <%=errorModuleList %></td>
                  <%}else if ("F".equals(loadStatus)){%>
                  <td style="color:green;font-weight:bold">OK</td>
                  <%}else if ("P".equals(loadStatus)){ %>
                  <td>Loading...</td>
                   <%}%>
                   <td><button type="button" class="btn btn-warning btn-xs" onclick="javascript:refreshAction('MODULE_ALL',this);">Refresh</button></td>
		        </tr>
                </tbody>
               </table>
       </div>
</div>
</div>

<div class="form-body">
       <div class="form-group">
        <label class="col-md-2 col-sm-2 control-label">
         Key Name:</label>
             <div class="col-md-5">
                 <div> <input type="text" id="searchValue" class="form-control" placeholder="Enter text">
               </div>
         </div>
           <span class="col-md-5 "><button type="button" class="btn btn-warning" onclick="javascript:onSearch();"><i class="fa  fa-search"></i> Search</button></span>
         <label id="showResult"></label>
       </div>
      </div>
</form>
</div>
</div>
</div>
</div>
</body>
<!-- END BODY -->

</html>