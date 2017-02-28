package com.asiainfo.integretion.o2p.cachecontroller.common;

import java.util.concurrent.ExecutorService;

import org.easymock.EasyMock;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>ThreadManagerServiceImplTest</code> contains tests for the class <code>{@link ThreadManagerServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-3 10:54
 * @author thinpad
 * @version $Revision: 1.0 $
 */
public class ThreadManagerServiceImplTest {
	ThreadManagerServiceImpl fixture = EasyMock.createMock(ThreadManagerServiceImpl.class);
	CacheThread[] cacheThreades = new CacheThread[]{};
	ExecutorService executorService = EasyMock.createMock(ExecutorService.class);
	
	@Before
	public void initTest(){
		
	}
	/**
	 * Run the ThreadManagerServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testThreadManagerServiceImpl_1()
		throws Exception {
		ThreadManagerServiceImpl result = new ThreadManagerServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void setCacheThreades(CacheThread[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetCacheThreades_1()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.setCacheThreades(cacheThreades);

		// add additional test code here
	}

	/**
	 * Run the void setCacheThreades(CacheThread[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetCacheThreades_2()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);
		

		fixture.setCacheThreades(cacheThreades);

		// add additional test code here
	}

	/**
	 * Run the void setSendMsgService(ExecutorService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetSendMsgService_1()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);
		ExecutorService sendMsgService = executorService;

		fixture.setSendMsgService(sendMsgService);

		// add additional test code here
	}

	/**
	 * Run the void setSynBillingCycleTheades(CacheThread[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetSynBillingCycleTheades_1()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);
		CacheThread[] synBillingCycleTheades = new CacheThread[] {};

		fixture.setSynBillingCycleTheades(synBillingCycleTheades);

		// add additional test code here
	}

	/**
	 * Run the void setSynBillingCycleTheades(CacheThread[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetSynBillingCycleTheades_2()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);
		CacheThread[] synBillingCycleTheades = new CacheThread[] {};

		fixture.setSynBillingCycleTheades(synBillingCycleTheades);

		// add additional test code here
	}

	/**
	 * Run the void setSynTransIdTheades(CacheThread[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetSynTransIdTheades_1()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);
		CacheThread[] synTransIdTheades = new CacheThread[] {};

		fixture.setSynTransIdTheades(synTransIdTheades);

		// add additional test code here
	}

	/**
	 * Run the void setSynTransIdTheades(CacheThread[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetSynTransIdTheades_2()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);
		CacheThread[] synTransIdTheades = new CacheThread[] {};

		fixture.setSynTransIdTheades(synTransIdTheades);

		// add additional test code here
	}

	/**
	 * Run the void setThreadNum(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetThreadNum_1()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);
		int threadNum = 1;

		fixture.setThreadNum(threadNum);

		// add additional test code here
	}

	/**
	 * Run the void setTransSendMsgService(ExecutorService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testSetTransSendMsgService_1()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);
		ExecutorService transSendMsgService = executorService;

		fixture.setTransSendMsgService(transSendMsgService);

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStart_1()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.start(ThreadManagerServiceImpl.java:41)
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStart_2()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.start(ThreadManagerServiceImpl.java:41)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_1()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_2()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_3()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_4()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_5()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_6()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_7()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_8()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_9()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_10()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_11()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_12()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_13()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_14()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_15()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	@Test
	public void testStop_16()
		throws Exception {
		
		fixture.setTransSendMsgService(executorService);
		fixture.setThreadNum(1);
		fixture.setSendMsgService(executorService);

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.common.ThreadManagerServiceImpl.stop(ThreadManagerServiceImpl.java:59)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-3 10:54
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
	 * @generatedBy CodePro at 15-12-3 10:54
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
	 * @generatedBy CodePro at 15-12-3 10:54
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ThreadManagerServiceImplTest.class);
	}
}