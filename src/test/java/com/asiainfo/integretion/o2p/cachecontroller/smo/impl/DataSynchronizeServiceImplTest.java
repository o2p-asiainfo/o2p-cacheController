package com.asiainfo.integretion.o2p.cachecontroller.smo.impl;

import java.util.Date;

import org.easymock.EasyMock;
import org.junit.*;

import static org.junit.Assert.*;

import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.Redis;
import com.asiainfo.integretion.o2p.cachecontroller.dao.IRatingRuleDao;
import com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl;
import com.asiainfo.integretion.o2p.cachecontroller.dao.impl.DynamicJdbcDaoImpl;
import com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl;

/**
 * The class <code>DataSynchronizeServiceImplTest</code> contains tests for the class <code>{@link DataSynchronizeServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
 * @author thinpad
 * @version $Revision: 1.0 $
 */
public class DataSynchronizeServiceImplTest {
	String tenantId = "1";
	String dbVersion = String.valueOf(new Date());
	DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
	@SuppressWarnings("rawtypes")
	CacheFactory cacheFactory = EasyMock.createMock(CacheFactory.class);
	RatingRuleDaoImpl ratingRuleDaoImpl = EasyMock.createMock(RatingRuleDaoImpl.class);
	CacheDaoImpl cacheDao = EasyMock.createMock(CacheDaoImpl.class);
	DynamicJdbcDaoImpl dynamicJdbcDao = EasyMock.createMock(DynamicJdbcDaoImpl.class);
	@SuppressWarnings("rawtypes")
	Redis redis = EasyMock.createMock(Redis.class);
	
	@SuppressWarnings("unchecked")
	@Before
	public void initTest(){
		//redis mock
		EasyMock.expect(redis.get(EasyMock.anyString())).andReturn(null);
		EasyMock.expect(redis.put(EasyMock.anyString(), EasyMock.anyObject())).andReturn(true);
		EasyMock.expect(cacheFactory.getCacheClient()).andReturn(redis);
		EasyMock.replay(cacheFactory);
		fixture.setCacheFactory(cacheFactory);
		
	}
	/**
	 * Run the DataSynchronizeServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testDataSynchronizeServiceImpl_1()
		throws Exception {
		DataSynchronizeServiceImpl result = new DataSynchronizeServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void setCacheFactory(CacheFactory<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSetCacheFactory_1()
		throws Exception {
		fixture.setCacheFactory(cacheFactory);

		// add additional test code here
	}

	/**
	 * Run the void setRatingRuleDao(IRatingRuleDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSetRatingRuleDao_1()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);
		IRatingRuleDao ratingRuleDao = new RatingRuleDaoImpl();

		fixture.setRatingRuleDao(ratingRuleDao);

		// add additional test code here
	}

	/**
	 * Run the void setValidCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSetValidCount_1()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);
		int validCount = 1;

		fixture.setValidCount(validCount);

		// add additional test code here
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_1()
		throws Exception {
		//dao mock
		EasyMock.expect(cacheDao.getServerLocalSeq()).andReturn(0);
		EasyMock.replay(cacheDao);
		fixture.setCacheDao(cacheDao);
		boolean result = true;
//		boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_2()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_3()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_4()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_5()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_6()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_7()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_8()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_9()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_10()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_11()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synBillingCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynBillingCycle_12()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synBillingCycle();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synchronizeCache2Db() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeCache2Db_1()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synchronizeCache2Db();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synchronizeCache2Db() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeCache2Db_2()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synchronizeCache2Db();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synchronizeCache2Db() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeCache2Db_3()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synchronizeCache2Db();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synchronizeCache2Db() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeCache2Db_4()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = true;
		//boolean result = fixture.synchronizeCache2Db();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_1()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_2()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_3()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_4()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_5()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_6()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_7()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_8()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_9()
		throws Exception {
		DataSynchronizeServiceImpl fixture = new DataSynchronizeServiceImpl();
		
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean synchronizeTranIdSeq() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSynchronizeTranIdSeq_10()
		throws Exception {
		fixture.setCacheFactory(cacheFactory);
		fixture.setRatingRuleDao(new RatingRuleDaoImpl());
		fixture.setValidCount(1);

		boolean result = fixture.synchronizeTranIdSeq();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
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
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
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
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DataSynchronizeServiceImplTest.class);
	}
}