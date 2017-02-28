package com.asiainfo.integretion.o2p.cachecontroller.common;

import org.easymock.EasyMock;
import org.junit.*;

import static org.junit.Assert.*;

import com.ailk.eaap.o2p.common.cache.IReloadCache;
import com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder;

/**
 * The class <code>CacheThreadTest</code> contains tests for the class <code>{@link CacheThread}</code>.
 *
 * @generatedBy CodePro at 15-12-3 10:51
 * @author thinpad
 * @version $Revision: 1.0 $
 */
public class CacheThreadTest {
	CacheThread fixture = EasyMock.createMock(CacheThread.class);
	ReloadCache reloadCache = new ReloadCache();
	@Before
	public void initTest(){
		
	}
	/**
	 * Run the CacheThread() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testCacheThread_1()
		throws Exception {
		CacheThread result = new CacheThread();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the IReloadCache getReloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testGetReloadCache_1()
		throws Exception {
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");

		IReloadCache result = fixture.getReloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
		assertNull(result);
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testRun_1()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(false);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(false);
		fixture.setReloadRun(false);
		fixture.setSynTransIdTime("");

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testRun_2()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testRun_3()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testRun_4()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(false);
		fixture.setSynTransIdTime("");

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testRun_5()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(false);
		fixture.setSynTransIdTime("");

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testRun_6()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(false);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(false);
		fixture.setSynTransIdTime("");

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testRun_7()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(false);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(false);
		fixture.setSynTransIdTime("");

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testRun_8()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void setBillingCycleSynRun(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testSetBillingCycleSynRun_1()
		throws Exception {
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");
		boolean billingCycleSynRun = true;

		fixture.setBillingCycleSynRun(billingCycleSynRun);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void setRefreshTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testSetRefreshTime_1()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");
		String refreshTime = "";

		fixture.setRefreshTime(refreshTime);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void setReloadCache(IReloadCache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testSetReloadCache_1()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");

		fixture.setReloadCache(reloadCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void setReloadRun(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testSetReloadRun_1()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");
		boolean reloadRun = true;

		fixture.setReloadRun(reloadRun);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void setSynBillingCycleTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testSetSynBillingCycleTime_1()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");
		String synBillingCycleTime = "";

		fixture.setSynBillingCycleTime(synBillingCycleTime);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void setSynTransIdTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testSetSynTransIdTime_1()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");
		String synTransIdTime = "";

		fixture.setSynTransIdTime(synTransIdTime);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Run the void setTransIdSynRun(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	@Test
	public void testSetTransIdSynRun_1()
		throws Exception {
		
		fixture.setRefreshTime("");
		fixture.setSynBillingCycleTime("");
		fixture.setTransIdSynRun(true);
		fixture.setReloadCache(reloadCache);
		fixture.setBillingCycleSynRun(true);
		fixture.setReloadRun(true);
		fixture.setSynTransIdTime("");
		boolean transIdSynRun = true;

		fixture.setTransIdSynRun(transIdSynRun);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-3 10:51
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
	 * @generatedBy CodePro at 15-12-3 10:51
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
	 * @generatedBy CodePro at 15-12-3 10:51
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CacheThreadTest.class);
	}
}