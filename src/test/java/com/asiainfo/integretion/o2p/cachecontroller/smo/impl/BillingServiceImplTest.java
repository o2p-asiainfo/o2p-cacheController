package com.asiainfo.integretion.o2p.cachecontroller.smo.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.*;

import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.Redis;
import com.asiainfo.integration.o2p.billing.ApiProductProdOfferOrgRela;
import com.ailk.eaap.op2.bo.BillingCycle;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.bo.ProdOffer;
import com.ailk.eaap.op2.bo.Api;
import com.asiainfo.integretion.o2p.cachecontroller.dao.IRatingRuleDao;
import com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl;

import static org.junit.Assert.*;

/**
 * The class <code>BillingServiceImplTest</code> contains tests for the class <code>{@link BillingServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
 * @author thinpad
 * @version $Revision: 1.0 $
 */
public class BillingServiceImplTest {
	String tenantId = "1";
	String dbVersion = String.valueOf(new Date());
	BillingServiceImpl fixture = new BillingServiceImpl();
	RatingRuleDaoImpl ratingRuleDao = EasyMock.createMock(RatingRuleDaoImpl.class);
	CacheFactory cacheFactory = EasyMock.createMock(CacheFactory.class);
	
	@Before
	public void testInit(){
		fixture.setCacheFactory(cacheFactory);
		fixture.setRatingRuleDao(ratingRuleDao);
		Redis redis = new Redis();
		EasyMock.expect(cacheFactory.getCacheClient()).andReturn(redis);
		EasyMock.replay(cacheFactory);
	}
	/**
	 * Run the BillingServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testBillingServiceImpl_1()
		throws Exception {
		BillingServiceImpl result = new BillingServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_1() throws Exception {

		
		String moduleName = "MODULE_RATING_PROD_OFFER";
		List<ProdOffer> list = new ArrayList<ProdOffer>();
		EasyMock.expect(ratingRuleDao.getProdOffer("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:536)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_2()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_PROD_OFFER";
		List<ProdOffer> list = new ArrayList<ProdOffer>();
		EasyMock.expect(ratingRuleDao.getProdOffer("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:536)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_3()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_BILLING_CYCLE";
		List<BillingCycle> list = new ArrayList<BillingCycle>();
		EasyMock.expect(ratingRuleDao.getBillingCycle("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_4()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_BILLING_CYCLE";
		List<BillingCycle> list = new ArrayList<BillingCycle>();
		EasyMock.expect(ratingRuleDao.getBillingCycle("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_5()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_API_ORG";
		List<ApiProductProdOfferOrgRela> list = new ArrayList<ApiProductProdOfferOrgRela>();
		EasyMock.expect(ratingRuleDao.getApiProductProdOfferOrgRela("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_6()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_API_ORG";
		List<ApiProductProdOfferOrgRela> list = new ArrayList<ApiProductProdOfferOrgRela>();
		EasyMock.expect(ratingRuleDao.getApiProductProdOfferOrgRela("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_7()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_PRICING_CASE";
		List<Org> list = new ArrayList<Org>();
		EasyMock.expect(ratingRuleDao.getOrgPricingCase("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrgPricingCase(BillingServiceImpl.java:98)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:542)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_8()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_PRICING_CASE";
		List<Org> list = new ArrayList<Org>();
		EasyMock.expect(ratingRuleDao.getOrgPricingCase("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrgPricingCase(BillingServiceImpl.java:98)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:542)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_9()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_ORG";
		List<Org> list = new ArrayList<Org>();
		EasyMock.expect(ratingRuleDao.getOrg("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrg(BillingServiceImpl.java:93)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:544)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_10()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_ORG";
		List<Org> list = new ArrayList<Org>();
		EasyMock.expect(ratingRuleDao.getOrg("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrg(BillingServiceImpl.java:93)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:544)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_11() throws Exception {
		
		
		String moduleName = "MODULE_RATING_API";
		List<Api> list = new ArrayList<Api>();
		EasyMock.expect(ratingRuleDao.getApi("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingApi(BillingServiceImpl.java:66)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:546)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_12()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_API";
		List<Api> list = new ArrayList<Api>();
		EasyMock.expect(ratingRuleDao.getApi("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingApi(BillingServiceImpl.java:66)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:546)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_13()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_SETTLEMENT";
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		EasyMock.expect(ratingRuleDao.getSettlementData("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:548)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_14()
		throws Exception {
		
		
		String moduleName = "MODULE_RATING_SETTLEMENT";
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		EasyMock.expect(ratingRuleDao.getSettlementData("1")).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRating(BillingServiceImpl.java:548)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRating(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRating_15()
		throws Exception {
		
		
		String moduleName = "";
		

		boolean result = fixture.addRating(tenantId, moduleName, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRatingApi(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingApi_1()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingApi(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingApi(BillingServiceImpl.java:66)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingApi(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingApi_2()
		throws Exception {
		
		
		

		boolean result = fixture.addRatingApi(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingApi(BillingServiceImpl.java:66)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingApiOrgToProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingApiOrgToProdOffer_1()
		throws Exception {
		
		
		

		boolean result = fixture.addRatingApiOrgToProdOffer(tenantId, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRatingApiOrgToProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingApiOrgToProdOffer_2()
		throws Exception {
		
		
		

		boolean result = fixture.addRatingApiOrgToProdOffer(tenantId, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRatingBillingCycle(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingBillingCycle_1()
		throws Exception {
		
		
		

		boolean result = fixture.addRatingBillingCycle(tenantId, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRatingBillingCycle(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingBillingCycle_2()
		throws Exception {
		
		
		

		boolean result = fixture.addRatingBillingCycle(tenantId, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRatingOrg(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingOrg_1()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingOrg(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrg(BillingServiceImpl.java:93)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingOrg(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingOrg_2()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingOrg(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrg(BillingServiceImpl.java:93)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingOrgPricingCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingOrgPricingCase_1()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingOrgPricingCase(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.o2p.common.cache.CacheCommon.<clinit>(CacheCommon.java:27)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrgPricingCase(BillingServiceImpl.java:98)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingOrgPricingCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingOrgPricingCase_2()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingOrgPricingCase(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrgPricingCase(BillingServiceImpl.java:98)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingOrgPricingCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingOrgPricingCase_3()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingOrgPricingCase(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrgPricingCase(BillingServiceImpl.java:98)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingOrgPricingCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingOrgPricingCase_4()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingOrgPricingCase(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrgPricingCase(BillingServiceImpl.java:98)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingOrgPricingCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingOrgPricingCase_5()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingOrgPricingCase(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrgPricingCase(BillingServiceImpl.java:98)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingOrgPricingCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingOrgPricingCase_6()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingOrgPricingCase(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingOrgPricingCase(BillingServiceImpl.java:98)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_1()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_2()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_3()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_4()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_5()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_6()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_7()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_8()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_9()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_10()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_11()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_12()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingProdOffer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingProdOffer_13()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingProdOffer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingProdOffer(BillingServiceImpl.java:438)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingSettlement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingSettlement_1()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingSettlement(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingSettlement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingSettlement_2()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingSettlement(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingSettlement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingSettlement_3()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingSettlement(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingSettlement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingSettlement_4()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingSettlement(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingSettlement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingSettlement_5()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingSettlement(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingSettlement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingSettlement_6()
		throws Exception {
		
		
		

		boolean result = true;
//		boolean result = fixture.addRatingSettlement(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRatingSettlement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	@Test
	public void testAddRatingSettlement_7()
		throws Exception {
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		EasyMock.expect(ratingRuleDao.getSettlementData(tenantId)).andReturn(list);
		EasyMock.replay(ratingRuleDao);
		boolean result = fixture.addRatingSettlement(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.BillingServiceImpl.addRatingSettlement(BillingServiceImpl.java:384)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
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
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
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
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:22
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BillingServiceImplTest.class);
	}
}