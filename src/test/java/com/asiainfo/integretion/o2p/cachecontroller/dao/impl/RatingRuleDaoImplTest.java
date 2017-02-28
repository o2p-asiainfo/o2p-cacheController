//package com.asiainfo.integretion.o2p.cachecontroller.dao.impl;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.easymock.EasyMock;
//import org.junit.*;
//import org.springframework.orm.ibatis.SqlMapClientTemplate;
//
//import static org.junit.Assert.*;
//
//import com.asiainfo.integration.o2p.billing.ApiProductProdOfferOrgRela;
//import com.ailk.eaap.op2.bo.BillingCycle;
//import com.ailk.eaap.op2.bo.Org;
//import com.ailk.eaap.op2.bo.ProdOffer;
//import com.ailk.eaap.op2.bo.ServiceProductRela;
//import com.ailk.eaap.op2.bo.Api;
//import com.ibatis.sqlmap.client.SqlMapClient;
//import com.ibatis.sqlmap.engine.impl.SqlMapClientImpl;
//import com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate;
//
///**
// * The class <code>RatingRuleDaoImplTest</code> contains tests for the class <code>{@link RatingRuleDaoImpl}</code>.
// *
// * @generatedBy CodePro at 15-12-3 3:16
// * @author thinpad
// * @version $Revision: 1.0 $
// */
//public class RatingRuleDaoImplTest {
//	String tenantId = "1";
//	RatingRuleDaoImpl fixture = new RatingRuleDaoImpl();
//	com.ibatis.sqlmap.client.SqlMapClient sqlMapClient = EasyMock.createMock(com.ibatis.sqlmap.client.SqlMapClient.class);
//	SqlMapClientTemplate sqlMapClientTemplate = EasyMock.createMock(SqlMapClientTemplate.class);
//	
//	@Before
//	public void testInit(){
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//	}
//	/**
//	 * Run the RatingRuleDaoImpl() constructor test.
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testRatingRuleDaoImpl_1()
//		throws Exception {
//		RatingRuleDaoImpl result = new RatingRuleDaoImpl();
//		assertNotNull(result);
//		// add additional test code here
//	}
//
//	/**
//	 * Run the List<Api> getApi(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApi_1()
//		throws Exception {
//		
//		
//
//		List<Api> result = fixture.getApi(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getApi(RatingRuleDaoImpl.java:183)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Api> getApi(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApi_2()
//		throws Exception {
//		
//		
//
//		List<Api> result = fixture.getApi(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getApi(RatingRuleDaoImpl.java:183)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, String>> getApiBillingCycleOfDate(Map) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApiBillingCycleOfDate_1()
//		throws Exception {
//		
//		Map paraMap = new HashMap();
//
//		List<Map<String, String>> result = fixture.getApiBillingCycleOfDate(paraMap);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getApiBillingCycleOfDate(RatingRuleDaoImpl.java:263)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, String>> getApiBillingCycleOfDate(Map) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApiBillingCycleOfDate_2()
//		throws Exception {
//		
//		Map paraMap = new HashMap();
//
//		List<Map<String, String>> result = fixture.getApiBillingCycleOfDate(paraMap);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getApiBillingCycleOfDate(RatingRuleDaoImpl.java:263)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<ApiProductProdOfferOrgRela> getApiProductProdOfferOrgRela(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApiProductProdOfferOrgRela_1()
//		throws Exception {
//		
//		
//
//		List<ApiProductProdOfferOrgRela> result = fixture.getApiProductProdOfferOrgRela(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getApiProductProdOfferOrgRela(RatingRuleDaoImpl.java:247)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<ApiProductProdOfferOrgRela> getApiProductProdOfferOrgRela(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApiProductProdOfferOrgRela_2()
//		throws Exception {
//		
//		
//
//		List<ApiProductProdOfferOrgRela> result = fixture.getApiProductProdOfferOrgRela(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getApiProductProdOfferOrgRela(RatingRuleDaoImpl.java:247)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<BillingCycle> getBillingCycle(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetBillingCycle_1()
//		throws Exception {
//		
//		
//
//		List<BillingCycle> result = fixture.getBillingCycle(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getBillingCycle(RatingRuleDaoImpl.java:240)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<BillingCycle> getBillingCycle(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetBillingCycle_2()
//		throws Exception {
//		
//		
//
//		List<BillingCycle> result = fixture.getBillingCycle(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getBillingCycle(RatingRuleDaoImpl.java:240)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<String> getKeyList() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetKeyList_1()
//		throws Exception {
//		
//
//		List<String> result = fixture.getKeyList();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getKeyList(RatingRuleDaoImpl.java:253)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<String> getKeyList() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetKeyList_2()
//		throws Exception {
//		
//
//		List<String> result = fixture.getKeyList();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getKeyList(RatingRuleDaoImpl.java:253)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrg(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrg_1()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrg(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrg(RatingRuleDaoImpl.java:130)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrg(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrg_2()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrg(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrg(RatingRuleDaoImpl.java:130)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrg(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrg_3()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrg(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrg(RatingRuleDaoImpl.java:130)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrg(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrg_4()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrg(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrg(RatingRuleDaoImpl.java:130)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrg(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrg_5()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrg(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrg(RatingRuleDaoImpl.java:130)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrg(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrg_6()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrg(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrg(RatingRuleDaoImpl.java:130)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrg(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrg_7()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrg(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrg(RatingRuleDaoImpl.java:130)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_1()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_2()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_3()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_4()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_5()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_6()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_7()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_8()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgPricingCase(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgPricingCase_9()
//		throws Exception {
//		
//		
//
//		List<Org> result = fixture.getOrgPricingCase(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getOrgPricingCase(RatingRuleDaoImpl.java:153)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ProdOffer> getProdOffer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProdOffer_1()
//		throws Exception {
//		List<ProdOffer> list = new ArrayList<ProdOffer>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIProdOffer", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ProdOffer> result = fixture.getProdOffer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getProdOffer(RatingRuleDaoImpl.java:55)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ProdOffer> getProdOffer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProdOffer_2()
//		throws Exception {
//		List<ProdOffer> list = new ArrayList<ProdOffer>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIProdOffer", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ProdOffer> result = fixture.getProdOffer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getProdOffer(RatingRuleDaoImpl.java:55)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ProdOffer> getProdOffer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProdOffer_3()
//		throws Exception {
//		List<ProdOffer> list = new ArrayList<ProdOffer>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIProdOffer", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ProdOffer> result = fixture.getProdOffer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getProdOffer(RatingRuleDaoImpl.java:55)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ProdOffer> getProdOffer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProdOffer_4()
//		throws Exception {
//		List<ProdOffer> list = new ArrayList<ProdOffer>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIProdOffer", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ProdOffer> result = fixture.getProdOffer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getProdOffer(RatingRuleDaoImpl.java:55)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ProdOffer> getProdOffer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProdOffer_5()
//		throws Exception {
//		List<ProdOffer> list = new ArrayList<ProdOffer>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIProdOffer", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ProdOffer> result = fixture.getProdOffer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getProdOffer(RatingRuleDaoImpl.java:55)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ProdOffer> getProdOffer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProdOffer_6()
//		throws Exception {
//		
//		
//		List<ProdOffer> list = new ArrayList<ProdOffer>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIProdOffer", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ProdOffer> result = fixture.getProdOffer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getProdOffer(RatingRuleDaoImpl.java:55)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ProdOffer> getProdOffer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProdOffer_7()
//		throws Exception {
//		List<ProdOffer> list = new ArrayList<ProdOffer>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIProdOffer", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ProdOffer> result = fixture.getProdOffer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getProdOffer(RatingRuleDaoImpl.java:55)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ProdOffer> getProdOffer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProdOffer_8()
//		throws Exception {
//		List<ProdOffer> list = new ArrayList<ProdOffer>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIProdOffer", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ProdOffer> result = fixture.getProdOffer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getProdOffer(RatingRuleDaoImpl.java:55)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_1()
//		throws Exception {
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_2()
//		throws Exception {
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_3()
//		throws Exception {
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_4()
//		throws Exception {
//		
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_5()
//		throws Exception {
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_6()
//		throws Exception {
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_7()
//		throws Exception {
//		
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_8()
//		throws Exception {
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ServiceProductRela> getServiceProductRela() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServiceProductRela_9()
//		throws Exception {
//		
//		List<ServiceProductRela> list = new ArrayList<ServiceProductRela>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("ratingRule.selectAPIServiceProductRela")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ServiceProductRela> result = fixture.getServiceProductRela();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getServiceProductRela(RatingRuleDaoImpl.java:190)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, String>> getSettlementData(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetSettlementData_1()
//		throws Exception {
//		
//		
//
//		List<Map<String, String>> result = fixture.getSettlementData(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getSettlementData(RatingRuleDaoImpl.java:268)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, String>> getSettlementData(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetSettlementData_2()
//		throws Exception {
//		
//		
//
//		List<Map<String, String>> result = fixture.getSettlementData(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.getSettlementData(RatingRuleDaoImpl.java:268)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the void setBillingCycle(BillingCycle) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testSetBillingCycle_1()
//		throws Exception {
//		
//		BillingCycle billingCycle = new BillingCycle();
//
//		fixture.setBillingCycle(billingCycle);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.insert(SqlMapClientTemplate.java:368)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.setBillingCycle(RatingRuleDaoImpl.java:258)
//	}
//
//	/**
//	 * Run the void setBillingCycle(BillingCycle) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testSetBillingCycle_2()
//		throws Exception {
//		
//		BillingCycle billingCycle = new BillingCycle();
//
//		fixture.setBillingCycle(billingCycle);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.insert(SqlMapClientTemplate.java:368)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.RatingRuleDaoImpl.setBillingCycle(RatingRuleDaoImpl.java:258)
//	}
//
//	/**
//	 * Run the void setSqlMapClientForAutowire(SqlMapClient) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testSetSqlMapClientForAutowire_1()
//		throws Exception {
//		
//		SqlMapClient sqlMapClient = new SqlMapClientImpl(new SqlMapExecutorDelegate());
//
//		fixture.setSqlMapClientForAutowire(sqlMapClient);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Perform pre-test initialization.
//	 *
//	 * @throws Exception
//	 *         if the initialization fails for some reason
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
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
//	 * @generatedBy CodePro at 15-12-3 3:16
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
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	public static void main(String[] args) {
//		new org.junit.runner.JUnitCore().run(RatingRuleDaoImplTest.class);
//	}
//}