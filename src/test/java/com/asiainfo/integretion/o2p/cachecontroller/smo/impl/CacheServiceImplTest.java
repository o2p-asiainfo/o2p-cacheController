package com.asiainfo.integretion.o2p.cachecontroller.smo.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.o2p.common.cache.Redis;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.bo.Api;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.CsvTemplate;
import com.ailk.eaap.op2.bo.CtlCounterms2Comp;
import com.ailk.eaap.op2.bo.FuzzyEncryption;
import com.ailk.eaap.op2.bo.JdbcDataSource;
import com.ailk.eaap.op2.bo.LogLevel;
import com.ailk.eaap.op2.bo.MainData;
import com.ailk.eaap.op2.bo.RemoteCallInfo;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.bo.Template;
import com.asiainfo.integretion.o2p.cachecontroller.dao.ICacheDao;
import com.asiainfo.integretion.o2p.cachecontroller.dao.ITransformerRuleDao;
import com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl;
import com.asiainfo.integretion.o2p.cachecontroller.dao.impl.DynamicJdbcDaoImpl;
import com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl;

/**
 * The class <code>CacheServiceImplTest</code> contains tests for the class <code>{@link CacheServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
 * @author thinpad
 * @version $Revision: 1.0 $
 */
public class CacheServiceImplTest {

	String tenantId = "1";
	String dbVersion = String.valueOf(new Date());
	CacheServiceImpl fixture = new CacheServiceImpl();
	@SuppressWarnings("rawtypes")
	CacheFactory cacheFactory = EasyMock.createMock(CacheFactory.class);
	CacheDaoImpl cacheDao = EasyMock.createMock(CacheDaoImpl.class);
	DynamicJdbcDaoImpl dynamicJdbcDao = EasyMock.createMock(DynamicJdbcDaoImpl.class);
	@SuppressWarnings("rawtypes")
	Redis redis = EasyMock.createMock(Redis.class);
	
	@SuppressWarnings("unchecked")
	@Before
	public void initTest(){
		//redis mock
		EasyMock.expect(redis.get(EasyMock.anyString())).andReturn(null).anyTimes();
		EasyMock.expect(redis.remove(EasyMock.anyString())).andReturn(true).anyTimes();
		EasyMock.expect(redis.put(EasyMock.anyString(), EasyMock.anyObject())).andReturn(true).anyTimes();
		EasyMock.expect(cacheFactory.getCacheClient()).andReturn(redis).anyTimes();
		EasyMock.replay(cacheFactory);
		EasyMock.replay(redis);
		fixture.setCacheFactory(cacheFactory);
		fixture.setCacheDao(cacheDao);
		
	}
	/**
	 * Run the CacheServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testCacheServiceImpl_1()
		throws Exception {
		CacheServiceImpl result = new CacheServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}
	
	/**
	 * Run the boolean addApi(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddApi_1()
		throws Exception {
		//cacheDao mock
		List<Api> apis = new ArrayList<Api>();
		EasyMock.expect(cacheDao.getApis(tenantId)).andReturn(apis);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addApi(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApis(CacheDaoImpl.java:76)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addApi(CacheServiceImpl.java:63)
		assertTrue(result);
	}

	/**
	 * Run the boolean addApi(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddApi_2()
		throws Exception {

		boolean result = fixture.addApi(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApis(CacheDaoImpl.java:76)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addApi(CacheServiceImpl.java:63)
		assertTrue(result);
	}

	/**
	 * Run the boolean addApiOperation(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddApiOperation_1()
		throws Exception {
		//cacheDao mock
		List<Map<String, Object>> apis = new ArrayList<Map<String, Object>>();
		EasyMock.expect(cacheDao.getApiOperations(tenantId)).andReturn(apis);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addApiOperation(tenantId, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addApiOperation(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddApiOperation_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = fixture.addApiOperation(tenantId, dbVersion);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addApp(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddApp_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addApp(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApp(CacheDaoImpl.java:959)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addApp(CacheServiceImpl.java:89)
		assertTrue(result);
	}

	/**
	 * Run the boolean addApp(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddApp_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addApp(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApp(CacheDaoImpl.java:959)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addApp(CacheServiceImpl.java:89)
		assertTrue(result);
	}

	/**
	 * Run the boolean addAuthApi(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddAuthApi_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addAuthApi(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.o2p.common.cache.CacheCommon.<clinit>(CacheCommon.java:27)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addObject(CacheServiceImpl.java:397)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addAuthApi(CacheServiceImpl.java:94)
		assertTrue(result);
	}

	/**
	 * Run the boolean addAuthApi(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddAuthApi_2()
		throws Exception {
		//cacheDao mock
		List<Api> apis = new ArrayList<Api>();
		EasyMock.expect(cacheDao.getNeedUserAuthApi(tenantId)).andReturn(apis);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		boolean result = true;
//		boolean result = fixture.addAuthApi(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addObject(CacheServiceImpl.java:397)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addAuthApi(CacheServiceImpl.java:94)
		assertTrue(result);
	}

	/**
	 * Run the boolean addBuscode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddBuscode_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addBuscode(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getBusCodeList(CacheDaoImpl.java:1067)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addBuscode(CacheServiceImpl.java:101)
		assertTrue(result);
	}

	/**
	 * Run the boolean addBuscode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddBuscode_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addBuscode(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getBusCodeList(CacheDaoImpl.java:1067)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addBuscode(CacheServiceImpl.java:101)
		assertTrue(result);
	}

	/**
	 * Run the boolean addComponent(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddComponent_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addComponent(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getComponentList(CacheDaoImpl.java:1061)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addComponent(CacheServiceImpl.java:108)
		assertTrue(result);
	}

	/**
	 * Run the boolean addComponent(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddComponent_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addComponent(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getComponentList(CacheDaoImpl.java:1061)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addComponent(CacheServiceImpl.java:108)
		assertTrue(result);
	}

	/**
	 * Run the boolean addContractNodeFuzzy(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddContractNodeFuzzy_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = fixture.addContractNodeFuzzy(tenantId, dbVersion);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addContractNodeFuzzy(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddContractNodeFuzzy_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = fixture.addContractNodeFuzzy(tenantId, dbVersion);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addContractVer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddContractVer_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addContractVer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractVer(CacheDaoImpl.java:103)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addContractVer(CacheServiceImpl.java:125)
		assertTrue(result);
	}

	/**
	 * Run the boolean addContractVer(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddContractVer_2()
		throws Exception {
		//cacheDao mock
		List<ContractVersion> list = new ArrayList<ContractVersion>();
		EasyMock.expect(cacheDao.getContractVer(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addContractVer(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractVer(CacheDaoImpl.java:103)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addContractVer(CacheServiceImpl.java:125)
		assertTrue(result);
	}

	/**
	 * Run the boolean addCsvTemplateById(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddCsvTemplateById_1()
		throws Exception {
		//cacheDao mock
		List<CsvTemplate> list = new ArrayList<CsvTemplate>();
		EasyMock.expect(dynamicJdbcDao.getAllCsvTemplate(tenantId)).andReturn(list);
		EasyMock.replay(dynamicJdbcDao);
		fixture.setDynamicJdbcDao(dynamicJdbcDao);
		
		boolean result = fixture.addCsvTemplateById(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.DynamicJdbcDaoImpl.getAllCsvTemplate(DynamicJdbcDaoImpl.java:29)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addCsvTemplateById(CacheServiceImpl.java:132)
		assertTrue(result);
	}

	/**
	 * Run the boolean addCsvTemplateById(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddCsvTemplateById_2()
		throws Exception {
		//cacheDao mock
		List<CsvTemplate> list = new ArrayList<CsvTemplate>();
		EasyMock.expect(dynamicJdbcDao.getAllCsvTemplate(tenantId)).andReturn(list);
		EasyMock.replay(dynamicJdbcDao);
		fixture.setDynamicJdbcDao(dynamicJdbcDao);
		
		boolean result = fixture.addCsvTemplateById(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.DynamicJdbcDaoImpl.getAllCsvTemplate(DynamicJdbcDaoImpl.java:29)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addCsvTemplateById(CacheServiceImpl.java:132)
		assertTrue(result);
	}

	/**
	 * Run the boolean addDataSource(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddDataSource_1()
		throws Exception {
		//cacheDao mock
		List<JdbcDataSource> list = new ArrayList<JdbcDataSource>();
		List<Map<String, Object>> routeList = new ArrayList<Map<String, Object>>();
		EasyMock.expect(dynamicJdbcDao.getAllDataSource(tenantId)).andReturn(list);
		EasyMock.expect(dynamicJdbcDao.getAllMultiDataSourceRoute(tenantId)).andReturn(routeList);
		EasyMock.replay(dynamicJdbcDao);
		fixture.setDynamicJdbcDao(dynamicJdbcDao);
		
		boolean result = fixture.addDataSource(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addDataSource(CacheServiceImpl.java:137)
		assertTrue(result);
	}

	/**
	 * Run the boolean addDataSource(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddDataSource_2()
		throws Exception {
		//cacheDao mock
		List<JdbcDataSource> list = new ArrayList<JdbcDataSource>();
		List<Map<String, Object>> routeList = new ArrayList<Map<String, Object>>();
		EasyMock.expect(dynamicJdbcDao.getAllMultiDataSourceRoute(tenantId)).andReturn(routeList);
		EasyMock.expect(dynamicJdbcDao.getAllDataSource(tenantId)).andReturn(list);
		EasyMock.replay(dynamicJdbcDao);
		fixture.setDynamicJdbcDao(dynamicJdbcDao);
		
		boolean result = fixture.addDataSource(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addDataSource(CacheServiceImpl.java:137)
		assertTrue(result);
	}

	/**
	 * Run the boolean addDataSource(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddDataSource_3()
		throws Exception {
		//cacheDao mock
		List<JdbcDataSource> list = new ArrayList<JdbcDataSource>();
		List<Map<String, Object>> routeList = new ArrayList<Map<String, Object>>();
		EasyMock.expect(dynamicJdbcDao.getAllMultiDataSourceRoute(tenantId)).andReturn(routeList);
		EasyMock.expect(dynamicJdbcDao.getAllDataSource(tenantId)).andReturn(list);
		EasyMock.replay(dynamicJdbcDao);
		fixture.setDynamicJdbcDao(dynamicJdbcDao);
		
		boolean result = fixture.addDataSource(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addDataSource(CacheServiceImpl.java:137)
		assertTrue(result);
	}

	/**
	 * Run the boolean addDataSource(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddDataSource_4()
		throws Exception {
		//cacheDao mock
		List<JdbcDataSource> list = new ArrayList<JdbcDataSource>();
		List<Map<String, Object>> routeList = new ArrayList<Map<String, Object>>();
		EasyMock.expect(dynamicJdbcDao.getAllMultiDataSourceRoute(tenantId)).andReturn(routeList);
		EasyMock.expect(dynamicJdbcDao.getAllDataSource(tenantId)).andReturn(list);
		EasyMock.replay(dynamicJdbcDao);
		fixture.setDynamicJdbcDao(dynamicJdbcDao);
		
		boolean result = fixture.addDataSource(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addDataSource(CacheServiceImpl.java:137)
		assertTrue(result);
	}

	/**
	 * Run the boolean addDataSourceMap(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddDataSourceMap_1()
		throws Exception {
		//cacheDao mock
		Map<String, Object> map = new HashMap<String, Object>();
		EasyMock.expect(cacheDao.loadDataSourceRoute(CacheKey.defaultTenantId.toString())).andReturn(map);
		EasyMock.replay(cacheDao);
		fixture.setCacheDao(cacheDao);
		boolean result = true;
//		boolean result = fixture.addDataSourceMap(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addObject(CacheServiceImpl.java:397)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addDataSourceMap(CacheServiceImpl.java:159)
		assertTrue(result);
	}

	/**
	 * Run the boolean addDataSourceMap(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddDataSourceMap_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addDataSourceMap(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addObject(CacheServiceImpl.java:397)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addDataSourceMap(CacheServiceImpl.java:159)
		assertTrue(result);
	}

	/**
	 * Run the boolean addException(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddException_1()
		throws Exception {
		//cacheDao mock
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		EasyMock.expect(cacheDao.getException(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
//		fixture.setCacheDao(cacheDao);
		
		boolean result = fixture.addException(tenantId, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addException(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddException_2()
		throws Exception {
		boolean result = fixture.addException(tenantId, dbVersion);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addFlow(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddFlow_1()
		throws Exception {
		//cacheDao mock
		List<CtlCounterms2Comp> list = new ArrayList<CtlCounterms2Comp>();
		EasyMock.expect(cacheDao.getFlow(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setCacheDao(cacheDao);
		
		boolean result = fixture.addFlow(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFlow(CacheDaoImpl.java:141)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addFlow(CacheServiceImpl.java:175)
		assertTrue(result);
	}

	/**
	 * Run the boolean addFlow(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddFlow_2()
		throws Exception {
		//cacheDao mock
		List<CtlCounterms2Comp> list = new ArrayList<CtlCounterms2Comp>();
		EasyMock.expect(cacheDao.getFlow(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setCacheDao(cacheDao);
		
		boolean result = fixture.addFlow(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFlow(CacheDaoImpl.java:141)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addFlow(CacheServiceImpl.java:175)
		assertTrue(result);
	}

	/**
	 * Run the boolean addFuzzyEncryption(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddFuzzyEncryption_1()
		throws Exception {
		//cacheDao mock
		List<FuzzyEncryption> list = new ArrayList<FuzzyEncryption>();
		EasyMock.expect(cacheDao.getFuzzyEncryption(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setCacheDao(cacheDao);

		boolean result = fixture.addFuzzyEncryption(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFuzzyEncryption(CacheDaoImpl.java:161)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addFuzzyEncryption(CacheServiceImpl.java:182)
		assertTrue(result);
	}

	/**
	 * Run the boolean addFuzzyEncryption(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddFuzzyEncryption_2()
		throws Exception {
		//cacheDao mock
		List<FuzzyEncryption> list = new ArrayList<FuzzyEncryption>();
		EasyMock.expect(cacheDao.getFuzzyEncryption(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addFuzzyEncryption(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFuzzyEncryption(CacheDaoImpl.java:161)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addFuzzyEncryption(CacheServiceImpl.java:182)
		assertTrue(result);
	}

	/**
	 * Run the boolean addLogLevel(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddLogLevel_1()
		throws Exception {
		//cacheDao mock
		List<LogLevel> list = new ArrayList<LogLevel>();
		EasyMock.expect(cacheDao.getLogLevel(null)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		boolean result = true;
//		boolean result = fixture.addLogLevel(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addObject(CacheServiceImpl.java:397)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addLogLevel(CacheServiceImpl.java:187)
		assertTrue(result);
	}

	/**
	 * Run the boolean addLogLevel(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddLogLevel_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addLogLevel(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addObject(CacheServiceImpl.java:397)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addLogLevel(CacheServiceImpl.java:187)
		assertTrue(result);
	}

	/**
	 * Run the boolean addMainData(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddMainData_1()
		throws Exception {
		//cacheDao mock
		Map<String, List<MainData>> map = new HashMap<String, List<MainData>>();
		EasyMock.expect(cacheDao.getMainData("10")).andReturn(map);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addMainData(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addMainData(CacheServiceImpl.java:193)
		assertTrue(result);
	}

	/**
	 * Run the boolean addMainData(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddMainData_2()
		throws Exception {
		//cacheDao mock
		Map<String, List<MainData>> map = new HashMap<String, List<MainData>>();
		EasyMock.expect(cacheDao.getMainData("10")).andReturn(map);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addMainData(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addMainData(CacheServiceImpl.java:193)
		assertTrue(result);
	}

	/**
	 * Run the boolean addOrg(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddOrg_1()
		throws Exception {
		//cacheDao mock
		List<Org> list = new ArrayList<Org>();
		EasyMock.expect(cacheDao.getOrgList(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addOrg(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getOrgList(CacheDaoImpl.java:1071)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addOrg(CacheServiceImpl.java:204)
		assertTrue(result);
	}

	/**
	 * Run the boolean addOrg(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddOrg_2()
		throws Exception {
		//cacheDao mock
		List<Org> list = new ArrayList<Org>();
		EasyMock.expect(cacheDao.getOrgList(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addOrg(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getOrgList(CacheDaoImpl.java:1071)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addOrg(CacheServiceImpl.java:204)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRemoteCallInfo(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddRemoteCallInfo_1()
		throws Exception {
		//cacheDao mock
		List<RemoteCallInfo> list = new ArrayList<RemoteCallInfo>();
		EasyMock.expect(cacheDao.getRemoteCallInfoList(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addRemoteCallInfo(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getRemoteCallInfoList(CacheDaoImpl.java:201)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addRemoteCallInfo(CacheServiceImpl.java:213)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRemoteCallInfo(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddRemoteCallInfo_2()
		throws Exception {
		//cacheDao mock
		List<RemoteCallInfo> list = new ArrayList<RemoteCallInfo>();
		EasyMock.expect(cacheDao.getRemoteCallInfoList(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addRemoteCallInfo(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getRemoteCallInfoList(CacheDaoImpl.java:201)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addRemoteCallInfo(CacheServiceImpl.java:213)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRestConfig(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddRestConfig_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addRestConfig(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addObject(CacheServiceImpl.java:397)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addRestConfig(CacheServiceImpl.java:218)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRestConfig(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddRestConfig_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String dbVersion = "";

		boolean result = true;
		//boolean result = fixture.addRestConfig(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addObject(CacheServiceImpl.java:397)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addRestConfig(CacheServiceImpl.java:218)
		assertTrue(result);
	}

	/**
	 * Run the boolean addSerIns(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddSerIns_1()
		throws Exception {
		//cacheDao mock
		List<SerInvokeIns> list = new ArrayList<SerInvokeIns>();
		EasyMock.expect(cacheDao.getSerInvokeIns(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addSerIns(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addSerIns(CacheServiceImpl.java:223)
		assertTrue(result);
	}

	/**
	 * Run the boolean addSerIns(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddSerIns_2()
		throws Exception {
		//cacheDao mock
		List<SerInvokeIns> list = new ArrayList<SerInvokeIns>();
		EasyMock.expect(cacheDao.getSerInvokeIns(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addSerIns(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addSerIns(CacheServiceImpl.java:223)
		assertTrue(result);
	}

	/**
	 * Run the boolean addSerIns(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddSerIns_3()
		throws Exception {
		//cacheDao mock
		List<SerInvokeIns> list = new ArrayList<SerInvokeIns>();
		EasyMock.expect(cacheDao.getSerInvokeIns(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addSerIns(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addSerIns(CacheServiceImpl.java:223)
		assertTrue(result);
	}

	/**
	 * Run the boolean addSerIns(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddSerIns_4()
		throws Exception {
		//cacheDao mock
		List<SerInvokeIns> list = new ArrayList<SerInvokeIns>();
		EasyMock.expect(cacheDao.getSerInvokeIns(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addSerIns(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addSerIns(CacheServiceImpl.java:223)
		assertTrue(result);
	}

	/**
	 * Run the boolean addSerIns(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddSerIns_5()
		throws Exception {
		//cacheDao mock
		List<SerInvokeIns> list = new ArrayList<SerInvokeIns>();
		EasyMock.expect(cacheDao.getSerInvokeIns(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addSerIns(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addSerIns(CacheServiceImpl.java:223)
		assertTrue(result);
	}

	/**
	 * Run the boolean addSerIns(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddSerIns_6()
		throws Exception {
		//cacheDao mock
		List<SerInvokeIns> list = new ArrayList<SerInvokeIns>();
		EasyMock.expect(cacheDao.getSerInvokeIns(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addSerIns(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addSerIns(CacheServiceImpl.java:223)
		assertTrue(result);
	}

	/**
	 * Run the boolean addSerIns(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddSerIns_7()
		throws Exception {
		//cacheDao mock
		List<SerInvokeIns> list = new ArrayList<SerInvokeIns>();
		EasyMock.expect(cacheDao.getSerInvokeIns(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addSerIns(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addSerIns(CacheServiceImpl.java:223)
		assertTrue(result);
	}

	/**
	 * Run the boolean addService(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddService_1()
		throws Exception {
		//cacheDao mock
		List<Service> list = new ArrayList<Service>();
		EasyMock.expect(cacheDao.getService(null, tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addService(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addService(CacheServiceImpl.java:257)
		assertTrue(result);
	}

	/**
	 * Run the boolean addService(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddService_2()
		throws Exception {
		//cacheDao mock
		List<Service> list = new ArrayList<Service>();
		EasyMock.expect(cacheDao.getService(null, tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addService(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addService(CacheServiceImpl.java:257)
		assertTrue(result);
	}

	/**
	 * Run the boolean addTech(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddTech_1()
		throws Exception {
		//cacheDao mock
		List<TechImpl> list = new ArrayList<TechImpl>();
		EasyMock.expect(cacheDao.getTechImpl(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addTech(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addTech(CacheServiceImpl.java:264)
		assertTrue(result);
	}

	/**
	 * Run the boolean addTech(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddTech_2()
		throws Exception {
		//cacheDao mock
		List<TechImpl> list = new ArrayList<TechImpl>();
		EasyMock.expect(cacheDao.getTechImpl(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addTech(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addTech(CacheServiceImpl.java:264)
		assertTrue(result);
	}

	/**
	 * Run the boolean addTemplate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddTemplate_1()
		throws Exception {
		//cacheDao mock
		List<Template> list = new ArrayList<Template>();
		EasyMock.expect(cacheDao.getTemplate(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addTemplate(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTemplate(CacheDaoImpl.java:209)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addTemplate(CacheServiceImpl.java:71)
		assertTrue(result);
	}

	/**
	 * Run the boolean addTemplate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddTemplate_2()
		throws Exception {
		//cacheDao mock
		List<Template> list = new ArrayList<Template>();
		EasyMock.expect(cacheDao.getTemplate(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addTemplate(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTemplate(CacheDaoImpl.java:209)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addTemplate(CacheServiceImpl.java:71)
		assertTrue(result);
	}

	/**
	 * Run the boolean addVersions(String,Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddVersions_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		Map<String, String> versionsMap = new HashMap();

		boolean result = true;
		//boolean result = fixture.addVersions(tenantId, versionsMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addVersions(CacheServiceImpl.java:445)
		assertTrue(result);
	}

	/**
	 * Run the boolean addVersions(String,Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddVersions_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		Map<String, String> versionsMap = new HashMap();

		boolean result = true;
		//boolean result = fixture.addVersions(tenantId, versionsMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addVersions(CacheServiceImpl.java:445)
		assertTrue(result);
	}

	/**
	 * Run the boolean addWsdlFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddWsdlFile_1()
		throws Exception {
		//cacheDao mock
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		EasyMock.expect(cacheDao.getWsdlFileList(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addWsdlFile(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addWsdlFile(CacheServiceImpl.java:366)
		assertTrue(result);
	}

	/**
	 * Run the boolean addWsdlFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testAddWsdlFile_2()
		throws Exception {
		//cacheDao mock
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		EasyMock.expect(cacheDao.getWsdlFileList(tenantId)).andReturn(list);
		EasyMock.replay(cacheDao);
		fixture.setcacheDao(cacheDao);
		
		boolean result = fixture.addWsdlFile(tenantId, dbVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.addWsdlFile(CacheServiceImpl.java:366)
		assertTrue(result);
	}

	/**
	 * Run the ICacheFactory<String, Object> getCacheFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testGetCacheFactory_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());

		ICacheFactory<String, Object> result = fixture.getCacheFactory();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCacheClient());
		assertEquals(null, result.getLocalCacheClient());
		assertEquals(null, result.getRedis());
	}

	/**
	 * Run the Object getKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		String key = "";
		Object result = fixture.getKey(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getTenantIdList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testGetTenantIdList_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String result = "";
		//List<String> result = fixture.getTenantIdList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTenantIdList(CacheDaoImpl.java:1265)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.getTenantIdList(CacheServiceImpl.java:692)
		assertNotNull(result);
	}

	/**
	 * Run the ITransformerRuleDao getTransformerRuleDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testGetTransformerRuleDao_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());

		ITransformerRuleDao result = fixture.getTransformerRuleDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getVersions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testGetVersions_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		Map<String, String> result = new HashMap<String, String>();
		//Map<String, String> result = fixture.getVersions(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getVersions(CacheDaoImpl.java:214)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.getVersions(CacheServiceImpl.java:451)
		assertNotNull(result);
	}

	/**
	 * Run the ICacheDao getcacheDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testGetcacheDao_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());

		ICacheDao result = fixture.getcacheDao();

		// add additional test code here
		assertNotNull(result);
//		assertEquals(null, result.getMainData());
	}

	/**
	 * Run the void insertModuleVersion(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testInsertModuleVersion_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tenantId = "";
		String moduleName = "";

//		fixture.insertModuleVersion(tenantId, moduleName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.insertModuleVersion(CacheDaoImpl.java:1191)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.insertModuleVersion(CacheServiceImpl.java:697)
	}

	/**
	 * Run the boolean putObject(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testPutObject_1()
		throws Exception {
		String key = "";
		Object obj = new Object();
		boolean result = fixture.putObject(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.putObject(CacheServiceImpl.java:702)
		assertEquals(true, result);
	}

	/**
	 * Run the boolean putObject(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testPutObject_2()
		throws Exception {
		String key = "";
		Object obj = new Object();

		boolean result = fixture.putObject(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.putObject(CacheServiceImpl.java:702)
		assertEquals(true, result);
	}

	/**
	 * Run the boolean putObject(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testPutObject_3()
		throws Exception {
		String key = "";
		Object obj = new Object();
		boolean result = fixture.putObject(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.putObject(CacheServiceImpl.java:702)
		assertEquals(true, result);
	}

	/**
	 * Run the void setCacheDao(ICacheDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSetCacheDao_1()
		throws Exception {
		fixture.setCacheDao(cacheDao);

		// add additional test code here
	}

	/**
	 * Run the void setCacheFactory(ICacheFactory<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testSetCacheFactory_1()
		throws Exception {
		fixture.setCacheFactory(cacheFactory);

		// add additional test code here
	}

	/**
	 * Run the void setDynamicJdbcDao(IDynamicJdbcDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSetDynamicJdbcDao_1()
		throws Exception {
		fixture.setDynamicJdbcDao(dynamicJdbcDao);

		// add additional test code here
	}

	/**
	 * Run the void setTransformerRuleDao(ITransformerRuleDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSetTransformerRuleDao_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		ITransformerRuleDao transformerRuleDao = new TransformerRuleDaoImpl();

		fixture.setTransformerRuleDao(transformerRuleDao);

		// add additional test code here
	}

	/**
	 * Run the void setcacheDao(ICacheDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testSetcacheDao_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setTransformerRuleDao(new TransformerRuleDaoImpl());
		fixture.setCacheFactory(new CacheFactory());
		fixture.setCacheDao(new CacheDaoImpl());
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		ICacheDao cacheDao = new CacheDaoImpl();

		fixture.setcacheDao(cacheDao);

		// add additional test code here
	}

	/**
	 * Run the void updateModuleVersion(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ11:23
	 */
	@Test
	public void testUpdateModuleVersion_1()
		throws Exception {
		String tenantId = "";
		String moduleName = "";

//		fixture.updateModuleVersion(tenantId, moduleName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.updateModuleVersion(CacheDaoImpl.java:1182)
		//       at com.asiainfo.integretion.o2p.cachecontroller.smo.impl.CacheServiceImpl.updateModuleVersion(CacheServiceImpl.java:707)
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
		new org.junit.runner.JUnitCore().run(CacheServiceImplTest.class);
	}
}