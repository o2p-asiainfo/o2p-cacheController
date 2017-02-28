//package com.asiainfo.integretion.o2p.cachecontroller.servlet;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequestWrapper;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServletResponseWrapper;
//import org.apache.struts2.dispatcher.StrutsRequestWrapper;
//import org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest;
//import org.apache.struts2.dispatcher.multipart.MultiPartRequest;
//import org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.ContextExposingHttpServletRequest;
//import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;
//import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;
//import org.springframework.web.util.ContentCachingRequestWrapper;
//import org.springframework.web.util.ContentCachingResponseWrapper;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.LocaleProvider;
//
///**
// * The class <code>SearchKeyServletTest</code> contains tests for the class <code>{@link SearchKeyServlet}</code>.
// *
// * @generatedBy CodePro at 15-12-3 3:19
// * @author thinpad
// * @version $Revision: 1.0 $
// */
//public class SearchKeyServletTest {
//	/**
//	 * Run the SearchKeyServlet() constructor test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testSearchKeyServlet_1()
//		throws Exception {
//
//		SearchKeyServlet result = new SearchKeyServlet();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals("", result.getServletInfo());
//		assertEquals(null, result.getServletConfig());
//	}
//
//	/**
//	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoGet_1()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doGet(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_1()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_2()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_3()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_4()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_5()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_6()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_7()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_8()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_9()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_10()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_11()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_12()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_13()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_14()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_15()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testDoPost_16()
//		throws Exception {
//		SearchKeyServlet fixture = new SearchKeyServlet();
//		HttpServletRequest request = new HttpServletRequestWrapper(new StrutsRequestWrapper(new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MultiPartRequestWrapper(new JakartaMultiPartRequest(), new MockHttpServletRequest(), "", new ActionSupport()), new AnnotationConfigWebApplicationContext()))))));
//		HttpServletResponse response = new HttpServletResponseWrapper(new ContentCachingResponseWrapper(new MockHttpServletResponse()));
//
//		fixture.doPost(request, response);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/AsyncContext
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.AsyncContext
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 17 more
//	}
//
//	/**
//	 * Perform pre-test initialization.
//	 *
//	 * @throws Exception
//	 *         if the initialization fails for some reason
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Before
//	public void setUp()
//		throws Exception {
//		// add additional set up code here
//	}
//
//	/**
//	 * Perform post-test clean-up.
//	 *
//	 * @throws Exception
//	 *         if the clean-up fails for some reason
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@After
//	public void tearDown()
//		throws Exception {
//		// Add additional tear down code here
//	}
//
//	/**
//	 * Launch the test.
//	 *
//	 * @param args the command line arguments
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	public static void main(String[] args) {
//		new org.junit.runner.JUnitCore().run(SearchKeyServletTest.class);
//	}
//}