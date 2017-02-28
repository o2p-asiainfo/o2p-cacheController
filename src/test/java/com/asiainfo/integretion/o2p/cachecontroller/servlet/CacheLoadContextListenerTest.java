//package com.asiainfo.integretion.o2p.cachecontroller.servlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletContextEvent;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.springframework.mock.web.MockServletContext;
//
///**
// * The class <code>CacheLoadContextListenerTest</code> contains tests for the class <code>{@link CacheLoadContextListener}</code>.
// *
// * @generatedBy CodePro at 15-12-3 3:19
// * @author thinpad
// * @version $Revision: 1.0 $
// */
//public class CacheLoadContextListenerTest {
//	/**
//	 * Run the void contextDestroyed(ServletContextEvent) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testContextDestroyed_1()
//		throws Exception {
//		CacheLoadContextListener fixture = new CacheLoadContextListener();
//		ServletContextEvent sce = new ServletContextEvent(new MockServletContext());
//
//		fixture.contextDestroyed(sce);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/SessionCookieConfig
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.SessionCookieConfig
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 11 more
//	}
//
//	/**
//	 * Run the void contextInitialized(ServletContextEvent) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testContextInitialized_1()
//		throws Exception {
//		CacheLoadContextListener fixture = new CacheLoadContextListener();
//		ServletContextEvent event = new ServletContextEvent(new MockServletContext());
//
//		fixture.contextInitialized(event);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/SessionCookieConfig
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.SessionCookieConfig
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 11 more
//	}
//
//	/**
//	 * Run the void contextInitialized(ServletContextEvent) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testContextInitialized_2()
//		throws Exception {
//		CacheLoadContextListener fixture = new CacheLoadContextListener();
//		ServletContextEvent event = new ServletContextEvent(new MockServletContext());
//
//		fixture.contextInitialized(event);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/SessionCookieConfig
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.SessionCookieConfig
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 11 more
//	}
//
//	/**
//	 * Run the void contextInitialized(ServletContextEvent) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:19
//	 */
//	@Test
//	public void testContextInitialized_3()
//		throws Exception {
//		CacheLoadContextListener fixture = new CacheLoadContextListener();
//		ServletContextEvent event = new ServletContextEvent(new MockServletContext());
//
//		fixture.contextInitialized(event);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NoClassDefFoundError: javax/servlet/SessionCookieConfig
//		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
//		//       at java.lang.Class.privateGetDeclaredConstructors(Unknown Source)
//		//       at java.lang.Class.getConstructor0(Unknown Source)
//		//       at java.lang.Class.getDeclaredConstructor(Unknown Source)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
//		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
//		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
//		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
//		//       at java.lang.Thread.run(Unknown Source)
//		//       Caused by: java.lang.ClassNotFoundException: javax.servlet.SessionCookieConfig
//		//       at java.net.URLClassLoader.findClass(Unknown Source)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
//		//       at java.lang.ClassLoader.loadClass(Unknown Source)
//		//       ... 11 more
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
//		new org.junit.runner.JUnitCore().run(CacheLoadContextListenerTest.class);
//	}
//}