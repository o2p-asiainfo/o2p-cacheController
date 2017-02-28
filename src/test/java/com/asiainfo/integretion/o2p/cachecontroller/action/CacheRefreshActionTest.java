package com.asiainfo.integretion.o2p.cachecontroller.action;

import java.util.Map;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CacheRefreshActionTest</code> contains tests for the class <code>{@link CacheRefreshAction}</code>.
 *
 * @generatedBy CodePro at 15-12-3 3:14, using the Struts generator
 * @author thinpad
 * @version $Revision: 1.0 $
 */
public class CacheRefreshActionTest {
	CacheRefreshAction fixture = EasyMock.createMock(CacheRefreshAction.class);
	/**
	 * Run the CacheRefreshAction() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-3 3:14
	 */
	@Test
	public void testCacheRefreshAction_1()
		throws Exception {
		CacheRefreshAction result = new CacheRefreshAction();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String execute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 3:14
	 */
	@Test
	public void testExecute_1()
		throws Exception {
		
		fixture.session = EasyMock.createNiceMock(Map.class);
		fixture.execute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.struts2.ServletActionContext.getRequest(ServletActionContext.java:112)
		//       at com.linkage.rainbow.ui.struts.BaseAction.getRequest(BaseAction.java:67)
		//       at com.linkage.rainbow.ui.struts.BaseAction.getSession(BaseAction.java:76)
		//       at com.asiainfo.integretion.o2p.cachecontroller.action.CacheRefreshAction.execute(CacheRefreshAction.java:17)
		//assertNotNull(result);
	}

	/**
	 * Run the String execute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 3:14
	 */
	@Test
	public void testExecute_2()
		throws Exception {
		
		fixture.session = EasyMock.createNiceMock(Map.class);
		
		String result = fixture.execute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.struts2.ServletActionContext.getRequest(ServletActionContext.java:112)
		//       at com.linkage.rainbow.ui.struts.BaseAction.getRequest(BaseAction.java:67)
		//       at com.linkage.rainbow.ui.struts.BaseAction.getSession(BaseAction.java:76)
		//       at com.asiainfo.integretion.o2p.cachecontroller.action.CacheRefreshAction.execute(CacheRefreshAction.java:17)
		assertNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-3 3:14
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-3 3:14
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15-12-3 3:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CacheRefreshActionTest.class);
	}
}