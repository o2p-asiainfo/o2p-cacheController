//package com.asiainfo.integretion.o2p.cachecontroller.dao.impl;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
//import org.easymock.EasyMock;
//import org.junit.*;
//
//import static org.junit.Assert.*;
//
//import com.ailk.eaap.o2p.common.cache.CacheKey;
//import com.ailk.eaap.op2.bo.Org;
//import com.ailk.eaap.op2.bo.Api;
//import com.ailk.eaap.op2.bo.App;
//import com.ailk.eaap.op2.bo.BizFunction;
//import com.ailk.eaap.op2.bo.Component;
//import com.ailk.eaap.op2.bo.ContractFormat;
//import com.ailk.eaap.op2.bo.ContractNodeFuzzy;
//import com.ailk.eaap.op2.bo.ContractVersion;
//import com.ailk.eaap.op2.bo.CtlCounterms2Comp;
//import com.ailk.eaap.op2.bo.Endpoint;
//import com.ailk.eaap.op2.bo.FuzzyEncryption;
//import com.ailk.eaap.op2.bo.GetValueExpr;
//import com.ailk.eaap.op2.bo.LogLevel;
//import com.ailk.eaap.op2.bo.MainData;
//import com.ailk.eaap.op2.bo.MessageFlow;
//import com.ailk.eaap.op2.bo.ParamVarMap;
//import com.ailk.eaap.op2.bo.ProofEffect;
//import com.ailk.eaap.op2.bo.RemoteCallInfo;
//import com.ailk.eaap.op2.bo.RouteCondition;
//import com.ailk.eaap.op2.bo.SerInvokeIns;
//import com.ailk.eaap.op2.bo.Service;
//import com.ailk.eaap.op2.bo.ServiceRouteConfig;
//import com.ailk.eaap.op2.bo.TechImpContralPo;
//import com.ailk.eaap.op2.bo.TechImpl;
//import com.ailk.eaap.op2.bo.TechImplNode;
//import com.ailk.eaap.op2.bo.Template;
//import com.ailk.eaap.op2.bo.TransformerRule;
//import com.ailk.eaap.op2.bo.UsableMonitorConf;
//import com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl;
//
///**
// * The class <code>CacheDaoImplTest</code> contains tests for the class <code>{@link CacheDaoImpl}</code>.
// *
// * @generatedBy CodePro at 15-12-3 3:16
// * @author thinpad
// * @version $Revision: 1.0 $
// */
//public class CacheDaoImplTest {
//	String tenantId = "1";
//	CacheDaoImpl fixture = new CacheDaoImpl();
//	com.ibatis.sqlmap.client.SqlMapClient sqlMapClient = EasyMock.createMock(com.ibatis.sqlmap.client.SqlMapClient.class);
//	IBatisSqlMapDAOImpl sqlMapDAOImpl = EasyMock.createMock(IBatisSqlMapDAOImpl.class);
////	SqlMapClientTemplate sqlMapClientTemplate = EasyMock.createMock(SqlMapClientTemplate.class);
////	SqlMapClientDaoSupport sqlMapClientDaoSupport = EasyMock.createMock(SqlMapClientDaoSupport.class);
//	@Before
//	public void testInit(){
////		sqlMapClientDaoSupport.setSqlMapClientTemplate(sqlMapClientTemplate);
////		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//////		sqlMapDAOImpl.setSqlMapClient(sqlMapClient);
////		fixture.setSqlMapDAOImpl(sqlMapDAOImpl);
//	}
//	
//	/**
//	 * Run the CacheDaoImpl() constructor test.
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testCacheDaoImpl_1()
//		throws Exception {
//		CacheDaoImpl result = new CacheDaoImpl();
//		assertNotNull(result);
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void buildRoute(MessageFlow) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testBuildRoute_1()
//		throws Exception {
//		
//		
//		
//		MessageFlow messageFlow = new MessageFlow();
//		messageFlow.setRouteConfigList(new ServiceRouteConfig[] {});
//
//		fixture.buildRoute(messageFlow);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void buildRoute(MessageFlow) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testBuildRoute_2()
//		throws Exception {
//		
//		
//		
//		MessageFlow messageFlow = new MessageFlow();
//		messageFlow.setFirstEndpoint(new Endpoint());
//		messageFlow.setRouteConfigList(new ServiceRouteConfig[] {});
//
//		fixture.buildRoute(messageFlow);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void buildRoute(MessageFlow) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testBuildRoute_3()
//		throws Exception {
//		
//		
//		
//		MessageFlow messageFlow = new MessageFlow();
//		messageFlow.setFirstEndpoint(new Endpoint());
//		messageFlow.setRouteConfigList(new ServiceRouteConfig[] {});
//
//		fixture.buildRoute(messageFlow);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void buildRoute(MessageFlow) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testBuildRoute_4()
//		throws Exception {
//		
//		
//		
//		MessageFlow messageFlow = new MessageFlow();
//		messageFlow.setFirstEndpoint(new Endpoint());
//		messageFlow.setRouteConfigList(new ServiceRouteConfig[] {});
//
//		fixture.buildRoute(messageFlow);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the List<GetValueExpr> findAllExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllExprById_1()
//		throws Exception {
//		
//		
//		
//		Integer exprId = new Integer(1);
//
//		List<GetValueExpr> result = fixture.findAllExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<GetValueExpr> findAllExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllExprById_2()
//		throws Exception {
//		
//		
//		
//		Integer exprId = new Integer(1);
//
//		List<GetValueExpr> result = fixture.findAllExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<GetValueExpr> findAllExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllExprById_3()
//		throws Exception {
//		
//		
//		
//		Integer exprId = new Integer(1);
//
//		List<GetValueExpr> result = fixture.findAllExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<GetValueExpr> findAllExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllExprById_4()
//		throws Exception {
//		
//		
//		
//		Integer exprId = new Integer(1);
//
//		List<GetValueExpr> result = fixture.findAllExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<GetValueExpr> findAllExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllExprById_5()
//		throws Exception {
//		
//		
//		
//		Integer exprId = new Integer(1);
//
//		List<GetValueExpr> result = fixture.findAllExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<RouteCondition> findAllRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllRouteConditionById_1()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = new Integer(1);
//
//		List<RouteCondition> result = fixture.findAllRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<RouteCondition> findAllRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllRouteConditionById_2()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = new Integer(1);
//
//		List<RouteCondition> result = fixture.findAllRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<RouteCondition> findAllRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllRouteConditionById_3()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = new Integer(1);
//
//		List<RouteCondition> result = fixture.findAllRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<RouteCondition> findAllRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllRouteConditionById_4()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = new Integer(1);
//
//		List<RouteCondition> result = fixture.findAllRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<RouteCondition> findAllRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testFindAllRouteConditionById_5()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = new Integer(1);
//
//		List<RouteCondition> result = fixture.findAllRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, Object>> getApiOperations(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApiOperations_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Map<String, Object>> result = fixture.getApiOperations(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApiOperations(CacheDaoImpl.java:95)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Api> getApis(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApis_1() throws Exception {
////		fixture.setSqlMapDAOImpl(sqlMapDAOImpl);
//		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
//		Map<String,String> map = new HashMap<String,String>();
//		map.put("API_NAME", "testGetApis_1");
//		map.put("API_METHOD", "testGetApis_1");
//		map.put("VERSION", "testGetApis_1");
//		map.put("API_ID", "111111");
//		map.put("SERVICE_ID", "11111");
//		list.add(map);
////		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getApis", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<Api> result = fixture.getApis(tenantId);
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApis(CacheDaoImpl.java:76)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Api> getApis(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApis_2()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Api> result = fixture.getApis(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApis(CacheDaoImpl.java:76)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Api> getApis(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApis_3()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Api> result = fixture.getApis(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApis(CacheDaoImpl.java:76)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<App> getApp(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApp_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<App> result = fixture.getApp(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApp(CacheDaoImpl.java:959)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<App> getApp(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApp_2()
//		throws Exception {
//		
//		
//		
//		
//
//		List<App> result = fixture.getApp(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApp(CacheDaoImpl.java:959)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<App> getApp(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApp_3()
//		throws Exception {
//		
//		
//		
//		
//
//		List<App> result = fixture.getApp(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApp(CacheDaoImpl.java:959)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<App> getApp(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApp_4()
//		throws Exception {
//		
//		
//		
//		
//
//		List<App> result = fixture.getApp(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApp(CacheDaoImpl.java:959)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<App> getApp(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetApp_5()
//		throws Exception {
//		
//		
//		
//		
//
//		List<App> result = fixture.getApp(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getApp(CacheDaoImpl.java:959)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<BizFunction> getBusCodeList(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetBusCodeList_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<BizFunction> result = fixture.getBusCodeList(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getBusCodeList(CacheDaoImpl.java:1067)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Component> getComponentList(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetComponentList_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Component> result = fixture.getComponentList(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getComponentList(CacheDaoImpl.java:1061)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the ContractVersion getContractFormatByContract(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractFormatByContract_1()
//		throws Exception {
//		
//		
//		
//		Integer contractid = new Integer(1);
//
//		ContractVersion result = fixture.getContractFormatByContract(contractid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractFormatByContract(CacheDaoImpl.java:228)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the ContractVersion getContractFormatByContract(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractFormatByContract_2()
//		throws Exception {
//		
//		
//		
//		Integer contractid = new Integer(1);
//
//		ContractVersion result = fixture.getContractFormatByContract(contractid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractFormatByContract(CacheDaoImpl.java:228)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the ContractVersion getContractFormatByContract(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractFormatByContract_3()
//		throws Exception {
//		
//		
//		
//		Integer contractid = new Integer(1);
//
//		ContractVersion result = fixture.getContractFormatByContract(contractid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractFormatByContract(CacheDaoImpl.java:228)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the ContractVersion getContractFormatByContract(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractFormatByContract_4()
//		throws Exception {
//		
//		
//		
//		Integer contractid = new Integer(1);
//
//		ContractVersion result = fixture.getContractFormatByContract(contractid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractFormatByContract(CacheDaoImpl.java:228)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the ContractVersion getContractFormatByContract(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractFormatByContract_5()
//		throws Exception {
//		
//		
//		
//		Integer contractid = new Integer(1);
//
//		ContractVersion result = fixture.getContractFormatByContract(contractid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractFormatByContract(CacheDaoImpl.java:228)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the ContractVersion getContractFormatByContract(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractFormatByContract_6()
//		throws Exception {
//		
//		
//		
//		Integer contractid = new Integer(1);
//
//		ContractVersion result = fixture.getContractFormatByContract(contractid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractFormatByContract(CacheDaoImpl.java:228)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<ContractNodeFuzzy> getContractNodeFuzzy(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractNodeFuzzy_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<ContractNodeFuzzy> result = fixture.getContractNodeFuzzy(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractNodeFuzzy(CacheDaoImpl.java:99)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<ContractVersion> getContractVer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractVer_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<ContractVersion> result = fixture.getContractVer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractVer(CacheDaoImpl.java:103)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ContractVersion> getContractVer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractVer_2()
//		throws Exception {
//		
//		
//		
//		
//
//		List<ContractVersion> result = fixture.getContractVer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractVer(CacheDaoImpl.java:103)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ContractVersion> getContractVer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractVer_3()
//		throws Exception {
//		
//		
//		
//		
//
//		List<ContractVersion> result = fixture.getContractVer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractVer(CacheDaoImpl.java:103)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ContractVersion> getContractVer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractVer_4()
//		throws Exception {
//		
//		
//		
//		
//
//		List<ContractVersion> result = fixture.getContractVer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractVer(CacheDaoImpl.java:103)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ContractVersion> getContractVer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractVer_5()
//		throws Exception {
//		
//		
//		
//		
//
//		List<ContractVersion> result = fixture.getContractVer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractVer(CacheDaoImpl.java:103)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ContractVersion> getContractVer(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetContractVer_6()
//		throws Exception {
//		
//		
//		
//		
//
//		List<ContractVersion> result = fixture.getContractVer(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getContractVer(CacheDaoImpl.java:103)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getCtlCounter(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetCtlCounter_1()
//		throws Exception {
//		
//		
//		
//		Integer techId = new Integer(1);
//
//		List<CtlCounterms2Comp> result = fixture.getCtlCounter(techId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getCtlCounter(CacheDaoImpl.java:989)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getCtlCounter(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetCtlCounter_2()
//		throws Exception {
//		
//		
//		
//		Integer techId = new Integer(1);
//
//		List<CtlCounterms2Comp> result = fixture.getCtlCounter(techId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getCtlCounter(CacheDaoImpl.java:989)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getCtlCounter(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetCtlCounter_3()
//		throws Exception {
//		
//		
//		
//		Integer techId = new Integer(1);
//
//		List<CtlCounterms2Comp> result = fixture.getCtlCounter(techId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getCtlCounter(CacheDaoImpl.java:989)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getCtlCounter(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetCtlCounter_4()
//		throws Exception {
//		
//		
//		
//		Integer techId = new Integer(1);
//
//		List<CtlCounterms2Comp> result = fixture.getCtlCounter(techId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getCtlCounter(CacheDaoImpl.java:989)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getCtlCounter(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetCtlCounter_5()
//		throws Exception {
//		
//		
//		
//		Integer techId = new Integer(1);
//
//		List<CtlCounterms2Comp> result = fixture.getCtlCounter(techId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getCtlCounter(CacheDaoImpl.java:989)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getCtlCounter(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetCtlCounter_6()
//		throws Exception {
//		
//		
//		
//		Integer techId = new Integer(1);
//
//		List<CtlCounterms2Comp> result = fixture.getCtlCounter(techId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getCtlCounter(CacheDaoImpl.java:989)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getCtlCounter(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetCtlCounter_7()
//		throws Exception {
//		
//		
//		
//		Integer techId = new Integer(1);
//
//		List<CtlCounterms2Comp> result = fixture.getCtlCounter(techId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getCtlCounter(CacheDaoImpl.java:989)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getCtlCounter(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetCtlCounter_8()
//		throws Exception {
//		
//		
//		
//		Integer techId = null;
//
//		List<CtlCounterms2Comp> result = fixture.getCtlCounter(techId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Endpoint getEndpoint(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetEndpoint_1()
//		throws Exception {
//		
//		
//		
//		int endpointid = 1;
//
//		Endpoint result = fixture.getEndpoint(endpointid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getEndpoint(CacheDaoImpl.java:746)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Endpoint getEndpoint(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetEndpoint_2()
//		throws Exception {
//		
//		
//		
//		int endpointid = 1;
//
//		Endpoint result = fixture.getEndpoint(endpointid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getEndpoint(CacheDaoImpl.java:746)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Endpoint getEndpoint(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetEndpoint_3()
//		throws Exception {
//		
//		
//		
//		int endpointid = 1;
//
//		Endpoint result = fixture.getEndpoint(endpointid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getEndpoint(CacheDaoImpl.java:746)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Endpoint getEndpoint(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetEndpoint_4()
//		throws Exception {
//		
//		
//		
//		int endpointid = 1;
//
//		Endpoint result = fixture.getEndpoint(endpointid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getEndpoint(CacheDaoImpl.java:746)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Endpoint getEndpoint(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetEndpoint_5()
//		throws Exception {
//		
//		
//		
//		int endpointid = 1;
//
//		Endpoint result = fixture.getEndpoint(endpointid);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getEndpoint(CacheDaoImpl.java:746)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, Object>> getException(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetException_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Map<String, Object>> result = fixture.getException(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getException(CacheDaoImpl.java:137)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getFlow(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetFlow_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<CtlCounterms2Comp> result = fixture.getFlow(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFlow(CacheDaoImpl.java:141)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getFlow(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetFlow_2()
//		throws Exception {
//		
//		
//		
//		
//
//		List<CtlCounterms2Comp> result = fixture.getFlow(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFlow(CacheDaoImpl.java:141)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getFlow(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetFlow_3()
//		throws Exception {
//		
//		
//		
//		
//
//		List<CtlCounterms2Comp> result = fixture.getFlow(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFlow(CacheDaoImpl.java:141)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CtlCounterms2Comp> getFlow(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetFlow_4()
//		throws Exception {
//		
//		
//		
//		
//
//		List<CtlCounterms2Comp> result = fixture.getFlow(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFlow(CacheDaoImpl.java:141)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<FuzzyEncryption> getFuzzyEncryption(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetFuzzyEncryption_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<FuzzyEncryption> result = fixture.getFuzzyEncryption(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getFuzzyEncryption(CacheDaoImpl.java:161)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<LogLevel> getLogLevel(Object) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetLogLevel_1()
//		throws Exception {
//		
//		
//		
//		Object object = new Object();
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getLogLevels", null)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<LogLevel> result = fixture.getLogLevel(object);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getLogLevel(CacheDaoImpl.java:165)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<LogLevel> getLogLevel(Object) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetLogLevel_2()
//		throws Exception {
//		
//		
//		
//		Object object = new Object();
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getLogLevels", null)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<LogLevel> result = fixture.getLogLevel(object);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getLogLevel(CacheDaoImpl.java:165)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<LogLevel> getLogLevel(Object) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetLogLevel_3()
//		throws Exception {
//		
//		
//		
//		Object object = new Object();
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getLogLevels", null)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<LogLevel> result = fixture.getLogLevel(object);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getLogLevel(CacheDaoImpl.java:165)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the Map<String, List<MainData>> getMainData() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMainData_1()
//		throws Exception {
//		
//		
//		
//
//		Map<String, List<MainData>> result = fixture.getMainData();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, List<MainData>> getMainData() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMainData_2()
//		throws Exception {
//		
//		
//		
//
//		Map<String, List<MainData>> result = fixture.getMainData();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, List<MainData>> getMainData() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMainData_3()
//		throws Exception {
//		
//		
//		
//
//		Map<String, List<MainData>> result = fixture.getMainData();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, List<MainData>> getMainData() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMainData_4()
//		throws Exception {
//		
//		
//		
//
//		Map<String, List<MainData>> result = fixture.getMainData();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, List<MainData>> getMainData() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMainData_5()
//		throws Exception {
//		
//		
//		
//
//		Map<String, List<MainData>> result = fixture.getMainData();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, List<MainData>> getMainData() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMainData_6()
//		throws Exception {
//		
//		
//		
//
//		Map<String, List<MainData>> result = fixture.getMainData();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, List<MainData>> getMainData() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMainData_7()
//		throws Exception {
//		
//		
//		
//
//		Map<String, List<MainData>> result = fixture.getMainData();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, List<MainData>> getMainData() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMainData_8()
//		throws Exception {
//		
//		
//		
//
//		Map<String, List<MainData>> result = fixture.getMainData();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageFlow getMessageFlow(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMessageFlow_1()
//		throws Exception {
//		
//		
//		
//		String messageflowId = "";
//
//		MessageFlow result = fixture.getMessageFlow(messageflowId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getMessageFlow(CacheDaoImpl.java:400)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the MessageFlow getMessageFlow(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMessageFlow_2()
//		throws Exception {
//		
//		
//		
//		String messageflowId = "";
//
//		MessageFlow result = fixture.getMessageFlow(messageflowId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getMessageFlow(CacheDaoImpl.java:400)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the MessageFlow getMessageFlow(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMessageFlow_3()
//		throws Exception {
//		
//		
//		
//		String messageflowId = "";
//
//		MessageFlow result = fixture.getMessageFlow(messageflowId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getMessageFlow(CacheDaoImpl.java:400)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the MessageFlow getMessageFlow(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetMessageFlow_4()
//		throws Exception {
//		
//		
//		
//		String messageflowId = "";
//
//		MessageFlow result = fixture.getMessageFlow(messageflowId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getMessageFlow(CacheDaoImpl.java:400)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Api> getNeedUserAuthApi(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetNeedUserAuthApi_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Api> result = fixture.getNeedUserAuthApi(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getNeedUserAuthApi(CacheDaoImpl.java:185)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Api> getNeedUserAuthApi(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetNeedUserAuthApi_2()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Api> result = fixture.getNeedUserAuthApi(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getNeedUserAuthApi(CacheDaoImpl.java:185)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Api> getNeedUserAuthApi(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetNeedUserAuthApi_3()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Api> result = fixture.getNeedUserAuthApi(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getNeedUserAuthApi(CacheDaoImpl.java:185)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Org> getOrgList(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetOrgList_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Org> result = fixture.getOrgList(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getOrgList(CacheDaoImpl.java:1071)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_1()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_2()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_3()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_4()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_5()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_6()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_7()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_8()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_9()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_10()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_11()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, ProofEffect> getProofValues(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetProofValues_12()
//		throws Exception {
//		
//		
//		
//		Integer servInvokeId = new Integer(1);
//
//		Map<String, ProofEffect> result = fixture.getProofValues(servInvokeId, "10");
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getProofValues(CacheDaoImpl.java:348)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<RemoteCallInfo> getRemoteCallInfoList(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetRemoteCallInfoList_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<RemoteCallInfo> result = fixture.getRemoteCallInfoList(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getRemoteCallInfoList(CacheDaoImpl.java:201)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, Object>> getRestConfigList(Map<String,String>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetRestConfigList_1()
//		throws Exception {
//		
//		
//		
//		Map<String, String> param = new HashMap();
//
//		List<Map<String, Object>> result = fixture.getRestConfigList(param);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getRestConfigList(CacheDaoImpl.java:205)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<SerInvokeIns> getSerInvokeIns(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetSerInvokeIns_1()
//		throws Exception {
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("MODULE_NAME", "2222");
//		map.put("VERSION", "3333");
//		list.add(map);
//		Map<String,String> paramMap = new HashMap<String, String>();
//		paramMap.put("tenantId", tenantId);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getSerInvokeInsAndService", paramMap)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<SerInvokeIns> result = fixture.getSerInvokeIns(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getSerInvokeIns(CacheDaoImpl.java:427)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<SerInvokeIns> getSerInvokeIns(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetSerInvokeIns_2()
//		throws Exception {
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("MODULE_NAME", "2222");
//		map.put("VERSION", "3333");
//		list.add(map);
//		Map<String,String> paramMap = new HashMap<String, String>();
//		paramMap.put("tenantId", tenantId);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getSerInvokeInsAndService", paramMap)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<SerInvokeIns> result = fixture.getSerInvokeIns(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getSerInvokeIns(CacheDaoImpl.java:427)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<SerInvokeIns> getSerInvokeIns(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetSerInvokeIns_3()
//		throws Exception {
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("MODULE_NAME", "2222");
//		map.put("VERSION", "3333");
//		list.add(map);
//		Map<String,String> paramMap = new HashMap<String, String>();
//		paramMap.put("tenantId", tenantId);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getSerInvokeInsAndService", paramMap)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<SerInvokeIns> result = fixture.getSerInvokeIns(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getSerInvokeIns(CacheDaoImpl.java:427)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<SerInvokeIns> getSerInvokeIns(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetSerInvokeIns_4()
//		throws Exception {
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("MODULE_NAME", "2222");
//		map.put("VERSION", "3333");
//		list.add(map);
//		Map<String,String> paramMap = new HashMap<String, String>();
//		paramMap.put("tenantId", tenantId);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getSerInvokeInsAndService", paramMap)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<SerInvokeIns> result = fixture.getSerInvokeIns(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getSerInvokeIns(CacheDaoImpl.java:427)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<SerInvokeIns> getSerInvokeIns(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetSerInvokeIns_5()
//		throws Exception {
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("MODULE_NAME", "2222");
//		map.put("VERSION", "3333");
//		list.add(map);
//		Map<String,String> paramMap = new HashMap<String, String>();
//		paramMap.put("tenantId", tenantId);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getSerInvokeInsAndService", paramMap)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<SerInvokeIns> result = fixture.getSerInvokeIns(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getSerInvokeIns(CacheDaoImpl.java:427)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the Map<String, String> getServerLocalLogoMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServerLocalLogoMap_1()
//		throws Exception {
//		
//		
//		
//
//		Map<String, String> result = fixture.getServerLocalLogoMap();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getServerLocalLogoMap(CacheDaoImpl.java:1221)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, String> getServerLocalLogoMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServerLocalLogoMap_2()
//		throws Exception {
//		
//		
//		
//
//		Map<String, String> result = fixture.getServerLocalLogoMap();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getServerLocalLogoMap(CacheDaoImpl.java:1221)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, String> getServerLocalLogoMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServerLocalLogoMap_3()
//		throws Exception {
//		
//		
//		
//
//		Map<String, String> result = fixture.getServerLocalLogoMap();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getServerLocalLogoMap(CacheDaoImpl.java:1221)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the int getServerLocalSeq() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServerLocalSeq_1()
//		throws Exception {
//		
//		
//		
//
//		int result = fixture.getServerLocalSeq();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForObject(SqlMapClientTemplate.java:242)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForObject(IBatisSqlMapDAOImpl.java:105)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getServerLocalSeq(CacheDaoImpl.java:1247)
//		assertEquals(-1, result);
//	}
//
//	/**
//	 * Run the int getServerLocalSeq() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetServerLocalSeq_2()
//		throws Exception {
//		
//		
//		
//
//		int result = fixture.getServerLocalSeq();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForObject(SqlMapClientTemplate.java:242)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForObject(IBatisSqlMapDAOImpl.java:105)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getServerLocalSeq(CacheDaoImpl.java:1247)
//		assertEquals(-1, result);
//	}
//
//	/**
//	 * Run the List<Service> getService(Integer,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetService_1()
//		throws Exception {
//		Integer serviceId = new Integer(1);
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("serviceId", serviceId);
//		paramMap.put("tenantId", tenantId);
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("CONTRACT_ID", "2222");
//		map.put("VERSION", "3333");
//		map.put("SERVICE_CN_NAME", "3333");
//		map.put("SERVICE_ID", "3333");
//		map.put("SERVICE_CODE", "3333");
//		map.put("SERVICE_VERSION", "3333");
//		map.put("STATE", "A");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getAllService", paramMap)).andReturn(list);
//		Map<String, Object> paramMap1 = new HashMap<String, Object>();
//		paramMap1.put("contractId", "2222");
//		paramMap1.put("tenantId", tenantId);
//		List<Map<String,String>> contractList = new ArrayList<Map<String,String>>();
//		Map<String,String> contract = new HashMap<String,String>();
//		contract.put("CODE", "3333");
//		contractList.add(contract);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getContract", paramMap1)).andReturn(contractList);
//		List<Map<String,String>> busCodeMap = new ArrayList<Map<String,String>>();
//		Map<String,String> busCode = new HashMap<String,String>();
//		busCode.put("CODE", "35677");
//		
//		busCodeMap.add(busCode);
//		Service s = new Service();
//		s.setServiceId(3333);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getFunctionCode", s.getServiceId())).andReturn(busCodeMap);
//
//		List<Map<String,String>> relaMap = new ArrayList<Map<String,String>>();
//		Map<String,String> rela =  new HashMap<String,String>();
//		rela.put("REG_SERVICE_ID", "11");
//		rela.put("SER_RELA_TYPE", "1");
//		relaMap.add(rela);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getServiceRela", s.getServiceId())).andReturn(null);
//		
//		EasyMock.replay(sqlMapDAOImpl);
//		List<Service> result= fixture.getService(serviceId, tenantId);
//		
//		
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Service> getService(Integer,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetService_2()
//		throws Exception {
//		Integer serviceId = new Integer(1);
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("serviceId", serviceId);
//		paramMap.put("tenantId", tenantId);
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("CONTRACT_ID", "2222");
//		map.put("VERSION", "3333");
//		map.put("SERVICE_CN_NAME", "3333");
//		map.put("SERVICE_ID", "3333");
//		map.put("SERVICE_CODE", "3333");
//		map.put("SERVICE_VERSION", "3333");
//		map.put("STATE", "A");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getAllService", paramMap)).andReturn(list);
//		Map<String, Object> paramMap1 = new HashMap<String, Object>();
//		paramMap1.put("contractId", "2222");
//		paramMap1.put("tenantId", tenantId);
//		List<Map<String,String>> contractList = new ArrayList<Map<String,String>>();
//		Map<String,String> contract = new HashMap<String,String>();
//		contract.put("CODE", "3333");
//		contractList.add(contract);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getContract", paramMap1)).andReturn(contractList);
//		List<Map<String,String>> busCodeMap = new ArrayList<Map<String,String>>();
//		Map<String,String> busCode = new HashMap<String,String>();
//		busCode.put("CODE", "35677");
//		
//		busCodeMap.add(busCode);
//		Service s = new Service();
//		s.setServiceId(3333);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getFunctionCode", s.getServiceId())).andReturn(busCodeMap);
//
//		List<Map<String,String>> relaMap = new ArrayList<Map<String,String>>();
//		Map<String,String> rela =  new HashMap<String,String>();
//		rela.put("REG_SERVICE_ID", "11");
//		rela.put("SER_RELA_TYPE", "1");
//		relaMap.add(rela);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getServiceRela", s.getServiceId())).andReturn(null);
//		
//		EasyMock.replay(sqlMapDAOImpl);
//		List<Service> result= fixture.getService(serviceId, tenantId);
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Service> getService(Integer,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetService_3()
//		throws Exception {
//		Integer serviceId = new Integer(1);
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("serviceId", serviceId);
//		paramMap.put("tenantId", tenantId);
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("CONTRACT_ID", "2222");
//		map.put("VERSION", "3333");
//		map.put("SERVICE_CN_NAME", "3333");
//		map.put("SERVICE_ID", "3333");
//		map.put("SERVICE_CODE", "3333");
//		map.put("SERVICE_VERSION", "3333");
//		map.put("STATE", "A");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getAllService", paramMap)).andReturn(list);
//		Map<String, Object> paramMap1 = new HashMap<String, Object>();
//		paramMap1.put("contractId", "2222");
//		paramMap1.put("tenantId", tenantId);
//		List<Map<String,String>> contractList = new ArrayList<Map<String,String>>();
//		Map<String,String> contract = new HashMap<String,String>();
//		contract.put("CODE", "3333");
//		contractList.add(contract);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getContract", paramMap1)).andReturn(contractList);
//		List<Map<String,String>> busCodeMap = new ArrayList<Map<String,String>>();
//		Map<String,String> busCode = new HashMap<String,String>();
//		busCode.put("CODE", "35677");
//		
//		busCodeMap.add(busCode);
//		Service s = new Service();
//		s.setServiceId(3333);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getFunctionCode", s.getServiceId())).andReturn(busCodeMap);
//
//		List<Map<String,String>> relaMap = new ArrayList<Map<String,String>>();
//		Map<String,String> rela =  new HashMap<String,String>();
//		rela.put("REG_SERVICE_ID", "11");
//		rela.put("SER_RELA_TYPE", "1");
//		relaMap.add(rela);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getServiceRela", s.getServiceId())).andReturn(null);
//		
//		EasyMock.replay(sqlMapDAOImpl);
//		List<Service> result= fixture.getService(serviceId, tenantId);
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Service> getService(Integer,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetService_4()
//		throws Exception {
//		Integer serviceId = new Integer(1);
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("serviceId", serviceId);
//		paramMap.put("tenantId", tenantId);
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("CONTRACT_ID", "2222");
//		map.put("VERSION", "3333");
//		map.put("SERVICE_CN_NAME", "3333");
//		map.put("SERVICE_ID", "3333");
//		map.put("SERVICE_CODE", "3333");
//		map.put("SERVICE_VERSION", "3333");
//		map.put("STATE", "A");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getAllService", paramMap)).andReturn(list);
//		Map<String, Object> paramMap1 = new HashMap<String, Object>();
//		paramMap1.put("contractId", "2222");
//		paramMap1.put("tenantId", tenantId);
//		List<Map<String,String>> contractList = new ArrayList<Map<String,String>>();
//		Map<String,String> contract = new HashMap<String,String>();
//		contract.put("CODE", "3333");
//		contractList.add(contract);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getContract", paramMap1)).andReturn(contractList);
//		List<Map<String,String>> busCodeMap = new ArrayList<Map<String,String>>();
//		Map<String,String> busCode = new HashMap<String,String>();
//		busCode.put("CODE", "35677");
//		
//		busCodeMap.add(busCode);
//		Service s = new Service();
//		s.setServiceId(3333);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getFunctionCode", s.getServiceId())).andReturn(busCodeMap);
//
//		List<Map<String,String>> relaMap = new ArrayList<Map<String,String>>();
//		Map<String,String> rela =  new HashMap<String,String>();
//		rela.put("REG_SERVICE_ID", "11");
//		rela.put("SER_RELA_TYPE", "1");
//		relaMap.add(rela);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getServiceRela", s.getServiceId())).andReturn(null);
//		
//		EasyMock.replay(sqlMapDAOImpl);
//		List<Service> result= fixture.getService(serviceId, tenantId);
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Service> getService(Integer,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetService_5()
//		throws Exception {
//		Integer serviceId = new Integer(1);
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("serviceId", serviceId);
//		paramMap.put("tenantId", tenantId);
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("CONTRACT_ID", "2222");
//		map.put("VERSION", "3333");
//		map.put("SERVICE_CN_NAME", "3333");
//		map.put("SERVICE_ID", "3333");
//		map.put("SERVICE_CODE", "3333");
//		map.put("SERVICE_VERSION", "3333");
//		map.put("STATE", "A");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getAllService", paramMap)).andReturn(list);
//		Map<String, Object> paramMap1 = new HashMap<String, Object>();
//		paramMap1.put("contractId", "2222");
//		paramMap1.put("tenantId", tenantId);
//		List<Map<String,String>> contractList = new ArrayList<Map<String,String>>();
//		Map<String,String> contract = new HashMap<String,String>();
//		contract.put("CODE", "3333");
//		contractList.add(contract);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getContract", paramMap1)).andReturn(contractList);
//		List<Map<String,String>> busCodeMap = new ArrayList<Map<String,String>>();
//		Map<String,String> busCode = new HashMap<String,String>();
//		busCode.put("CODE", "35677");
//		
//		busCodeMap.add(busCode);
//		Service s = new Service();
//		s.setServiceId(3333);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getFunctionCode", s.getServiceId())).andReturn(busCodeMap);
//
//		List<Map<String,String>> relaMap = new ArrayList<Map<String,String>>();
//		Map<String,String> rela =  new HashMap<String,String>();
//		rela.put("REG_SERVICE_ID", "11");
//		rela.put("SER_RELA_TYPE", "1");
//		relaMap.add(rela);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getServiceRela", s.getServiceId())).andReturn(null);
//		
//		EasyMock.replay(sqlMapDAOImpl);
//		List<Service> result= fixture.getService(serviceId, tenantId);
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Service> getService(Integer,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetService_6()
//		throws Exception {
//		Integer serviceId = new Integer(1);
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("serviceId", serviceId);
//		paramMap.put("tenantId", tenantId);
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("CONTRACT_ID", "2222");
//		map.put("VERSION", "3333");
//		map.put("SERVICE_CN_NAME", "3333");
//		map.put("SERVICE_ID", "3333");
//		map.put("SERVICE_CODE", "3333");
//		map.put("SERVICE_VERSION", "3333");
//		map.put("STATE", "A");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getAllService", paramMap)).andReturn(list);
//		Map<String, Object> paramMap1 = new HashMap<String, Object>();
//		paramMap1.put("contractId", "2222");
//		paramMap1.put("tenantId", tenantId);
//		List<Map<String,String>> contractList = new ArrayList<Map<String,String>>();
//		Map<String,String> contract = new HashMap<String,String>();
//		contract.put("CODE", "3333");
//		contractList.add(contract);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getContract", paramMap1)).andReturn(contractList);
//		List<Map<String,String>> busCodeMap = new ArrayList<Map<String,String>>();
//		Map<String,String> busCode = new HashMap<String,String>();
//		busCode.put("CODE", "35677");
//		
//		busCodeMap.add(busCode);
//		Service s = new Service();
//		s.setServiceId(3333);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getFunctionCode", s.getServiceId())).andReturn(busCodeMap);
//
//		List<Map<String,String>> relaMap = new ArrayList<Map<String,String>>();
//		Map<String,String> rela =  new HashMap<String,String>();
//		rela.put("REG_SERVICE_ID", "11");
//		rela.put("SER_RELA_TYPE", "1");
//		relaMap.add(rela);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getServiceRela", s.getServiceId())).andReturn(null);
//		
//		EasyMock.replay(sqlMapDAOImpl);
//		List<Service> result= fixture.getService(serviceId, tenantId);
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Service> getService(Integer,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetService_7()
//		throws Exception {
//		Integer serviceId = new Integer(1);
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("serviceId", serviceId);
//		paramMap.put("tenantId", tenantId);
//		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("CONTRACT_ID", "2222");
//		map.put("VERSION", "3333");
//		map.put("SERVICE_CN_NAME", "3333");
//		map.put("SERVICE_ID", "3333");
//		map.put("SERVICE_CODE", "3333");
//		map.put("SERVICE_VERSION", "3333");
//		map.put("STATE", "A");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getAllService", paramMap)).andReturn(list);
//		Map<String, Object> paramMap1 = new HashMap<String, Object>();
//		paramMap1.put("contractId", "2222");
//		paramMap1.put("tenantId", tenantId);
//		List<Map<String,String>> contractList = new ArrayList<Map<String,String>>();
//		Map<String,String> contract = new HashMap<String,String>();
//		contract.put("CODE", "3333");
//		contractList.add(contract);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getContract", paramMap1)).andReturn(contractList);
//		List<Map<String,String>> busCodeMap = new ArrayList<Map<String,String>>();
//		Map<String,String> busCode = new HashMap<String,String>();
//		busCode.put("CODE", "35677");
//		
//		busCodeMap.add(busCode);
//		Service s = new Service();
//		s.setServiceId(3333);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getFunctionCode", s.getServiceId())).andReturn(busCodeMap);
//
//		List<Map<String,String>> relaMap = new ArrayList<Map<String,String>>();
//		Map<String,String> rela =  new HashMap<String,String>();
//		rela.put("REG_SERVICE_ID", "11");
//		rela.put("SER_RELA_TYPE", "1");
//		relaMap.add(rela);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getServiceRela", s.getServiceId())).andReturn(null);
//		
//		EasyMock.replay(sqlMapDAOImpl);
//		List<Service> result= fixture.getService(serviceId, tenantId);
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getService(CacheDaoImpl.java:817)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the IBatisSqlMapDAOImpl getSqlMapDAOImpl() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetSqlMapDAOImpl_1()
//		throws Exception {
//		
//		
//		
//
//		IBatisSqlMapDAOImpl result = fixture.getSqlMapDAOImpl();
//
//		// add additional test code here
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_2()
//		throws Exception {
//		
//		
//		
//		
//
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_3()
//		throws Exception {
//		
//		
//		
//		
//
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_4()
//		throws Exception {
//		
//		
//		
//		
//
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_5()
//		throws Exception {
//		
//		
//		
//		
//
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_6()
//		throws Exception {
//		
//		
//		
//		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getTechImpl",tenantId)).andReturn(resultList);
//		EasyMock.replay(sqlMapDAOImpl);
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_7()
//		throws Exception {
//		
//		
//		
//		
//
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_8()
//		throws Exception {
//		
//		
//		
//		
//
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImpl> getTechImpl(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImpl_9()
//		throws Exception {
//		
//		
//		
//		
//
//		List<TechImpl> result = fixture.getTechImpl(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImpl(CacheDaoImpl.java:869)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImplNode> getTechImplNode(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImplNode_1()
//		throws Exception {
//		
//		
//		
//		int techImplId = 1;
//
//		List<TechImplNode> result = fixture.getTechImplNode(techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImplNode(CacheDaoImpl.java:916)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImplNode> getTechImplNode(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImplNode_2()
//		throws Exception {
//		
//		
//		
//		int techImplId = 1;
//
//		List<TechImplNode> result = fixture.getTechImplNode(techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImplNode(CacheDaoImpl.java:916)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImplNode> getTechImplNode(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImplNode_3()
//		throws Exception {
//		
//		
//		
//		int techImplId = 1;
//
//		List<TechImplNode> result = fixture.getTechImplNode(techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImplNode(CacheDaoImpl.java:916)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<TechImplNode> getTechImplNode(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTechImplNode_4()
//		throws Exception {
//		
//		
//		
//		int techImplId = 1;
//
//		List<TechImplNode> result = fixture.getTechImplNode(techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTechImplNode(CacheDaoImpl.java:916)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Template> getTemplate(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTemplate_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Template> result = fixture.getTemplate(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTemplate(CacheDaoImpl.java:209)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<String> getTenantIdList() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTenantIdList_1()
//		throws Exception {
//		
//		
//
//		List<String> result = fixture.getTenantIdList();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTenantIdList(CacheDaoImpl.java:1265)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<String> getTenantIdList() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTenantIdList_2()
//		throws Exception {
//		
//		
//		
//
//		List<String> result = fixture.getTenantIdList();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTenantIdList(CacheDaoImpl.java:1265)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<String> getTenantIdList() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTenantIdList_3()
//		throws Exception {
//		
//		
//		
//
//		List<String> result = fixture.getTenantIdList();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTenantIdList(CacheDaoImpl.java:1265)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<String> getTenantIdList() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTenantIdList_4()
//		throws Exception {
//		
//		
//		
//
//		List<String> result = fixture.getTenantIdList();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTenantIdList(CacheDaoImpl.java:1265)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, Object>> getTenants() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTenants_1()
//		throws Exception {
//		
//		
//		
//
//		List<Map<String, ?>> result = fixture.getTenants();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTenants(CacheDaoImpl.java:1278)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the TechImpContralPo getTicp(int,int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTicp_1()
//		throws Exception {
//		
//		
//		
//		int ticpId = 1;
//		int techImplId = 1;
//
//		TechImpContralPo result = fixture.getTicp(ticpId, techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTicp(CacheDaoImpl.java:938)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the TechImpContralPo getTicp(int,int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTicp_2()
//		throws Exception {
//		
//		
//		
//		int ticpId = 1;
//		int techImplId = 1;
//
//		TechImpContralPo result = fixture.getTicp(ticpId, techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTicp(CacheDaoImpl.java:938)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the TechImpContralPo getTicp(int,int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTicp_3()
//		throws Exception {
//		
//		
//		
//		int ticpId = 1;
//		int techImplId = 1;
//
//		TechImpContralPo result = fixture.getTicp(ticpId, techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTicp(CacheDaoImpl.java:938)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the String getTokenEnableTime() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTokenEnableTime_1()
//		throws Exception {
//		
//		
//		fixture.setTokenEnableTime("");
//
//		String result = fixture.getTokenEnableTime();
//
//		// add additional test code here
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the Map<String, Integer> getTranIdSeqMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTranIdSeqMap_1()
//		throws Exception {
//		
//		
//		
//
//		Map<String, Integer> result = fixture.getTranIdSeqMap();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTranIdSeqMap(CacheDaoImpl.java:1195)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, Integer> getTranIdSeqMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTranIdSeqMap_2()
//		throws Exception {
//		
//		
//		
//
//		Map<String, Integer> result = fixture.getTranIdSeqMap();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTranIdSeqMap(CacheDaoImpl.java:1195)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, Integer> getTranIdSeqMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTranIdSeqMap_3()
//		throws Exception {
//		
//		
//		
//
//		Map<String, Integer> result = fixture.getTranIdSeqMap();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTranIdSeqMap(CacheDaoImpl.java:1195)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, Integer> getTranIdSeqMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTranIdSeqMap_4()
//		throws Exception {
//		
//		
//		
//
//		Map<String, Integer> result = fixture.getTranIdSeqMap();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTranIdSeqMap(CacheDaoImpl.java:1195)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, Integer> getTranIdSeqMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTranIdSeqMap_5()
//		throws Exception {
//		
//		
//		
//
//		Map<String, Integer> result = fixture.getTranIdSeqMap();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTranIdSeqMap(CacheDaoImpl.java:1195)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the GetValueExpr getTreeExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeExprById_1()
//		throws Exception {
//		
//		
//		
//		Integer exprId = Integer.valueOf(1);
//
//		GetValueExpr result = fixture.getTreeExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeExprById(CacheDaoImpl.java:607)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the GetValueExpr getTreeExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeExprById_2()
//		throws Exception {
//		
//		
//		
//		Integer exprId = Integer.valueOf(1);
//
//		GetValueExpr result = fixture.getTreeExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeExprById(CacheDaoImpl.java:607)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the GetValueExpr getTreeExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeExprById_3()
//		throws Exception {
//		
//		
//		
//		Integer exprId = Integer.valueOf(1);
//
//		GetValueExpr result = fixture.getTreeExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeExprById(CacheDaoImpl.java:607)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the GetValueExpr getTreeExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeExprById_4()
//		throws Exception {
//		
//		
//		
//		Integer exprId = Integer.valueOf((byte) 1);
//
//		GetValueExpr result = fixture.getTreeExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeExprById(CacheDaoImpl.java:607)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the GetValueExpr getTreeExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeExprById_5()
//		throws Exception {
//		
//		
//		
//		Integer exprId = new Integer(1);
//
//		GetValueExpr result = fixture.getTreeExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeExprById(CacheDaoImpl.java:607)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the GetValueExpr getTreeExprById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeExprById_6()
//		throws Exception {
//		
//		
//		
//		Integer exprId = new Integer(1);
//
//		GetValueExpr result = fixture.getTreeExprById(exprId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllExprById(CacheDaoImpl.java:545)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeExprById(CacheDaoImpl.java:607)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the RouteCondition getTreeRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeRouteConditionById_1()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = Integer.valueOf(1);
//
//		RouteCondition result = fixture.getTreeRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeRouteConditionById(CacheDaoImpl.java:510)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the RouteCondition getTreeRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeRouteConditionById_2()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = Integer.valueOf(1);
//
//		RouteCondition result = fixture.getTreeRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeRouteConditionById(CacheDaoImpl.java:510)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the RouteCondition getTreeRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeRouteConditionById_3()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = Integer.valueOf(1);
//
//		RouteCondition result = fixture.getTreeRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeRouteConditionById(CacheDaoImpl.java:510)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the RouteCondition getTreeRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeRouteConditionById_4()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = Integer.valueOf((byte) 1);
//
//		RouteCondition result = fixture.getTreeRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeRouteConditionById(CacheDaoImpl.java:510)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the RouteCondition getTreeRouteConditionById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetTreeRouteConditionById_5()
//		throws Exception {
//		
//		
//		
//		Integer routeCondId = new Integer(1);
//
//		RouteCondition result = fixture.getTreeRouteConditionById(routeCondId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.findAllRouteConditionById(CacheDaoImpl.java:469)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getTreeRouteConditionById(CacheDaoImpl.java:510)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<UsableMonitorConf> getUsable(int,int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetUsable_1()
//		throws Exception {
//		
//		
//		
//		int techPoId = 1;
//		int techImplId = 1;
//
//		List<UsableMonitorConf> result = fixture.getUsable(techPoId, techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getUsable(CacheDaoImpl.java:1017)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<UsableMonitorConf> getUsable(int,int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetUsable_2()
//		throws Exception {
//		
//		
//		
//		int techPoId = 1;
//		int techImplId = 1;
//
//		List<UsableMonitorConf> result = fixture.getUsable(techPoId, techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getUsable(CacheDaoImpl.java:1017)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<UsableMonitorConf> getUsable(int,int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetUsable_3()
//		throws Exception {
//		
//		
//		
//		int techPoId = 1;
//		int techImplId = 1;
//
//		List<UsableMonitorConf> result = fixture.getUsable(techPoId, techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getUsable(CacheDaoImpl.java:1017)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<UsableMonitorConf> getUsable(int,int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetUsable_4()
//		throws Exception {
//		
//		
//		
//		int techPoId = 1;
//		int techImplId = 1;
//
//		List<UsableMonitorConf> result = fixture.getUsable(techPoId, techImplId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getUsable(CacheDaoImpl.java:1017)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the Map<String, String> getVersions(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetVersions_1()
//		throws Exception {
//		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("MODULE_NAME", "2222");
//		map.put("VERSION", "3333");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getVersionList", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		Map<String, String> result = fixture.getVersions(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getVersions(CacheDaoImpl.java:214)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the Map<String, String> getVersions(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetVersions_2()
//		throws Exception {
//		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("MODULE_NAME", "2222");
//		map.put("VERSION", "3333");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getVersionList", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		Map<String, String> result = fixture.getVersions(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getVersions(CacheDaoImpl.java:214)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<Map<String, Object>> getWsdlFileList(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testGetWsdlFileList_1()
//		throws Exception {
//		
//		
//		
//		
//
//		List<Map<String, Object>> result = fixture.getWsdlFileList(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.getWsdlFileList(CacheDaoImpl.java:224)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the void insertModuleVersion(String,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testInsertModuleVersion_1()
//		throws Exception {
//		
//		
//		
//		
//		String moduleName = "";
//
//		fixture.insertModuleVersion(tenantId, moduleName);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.insert(SqlMapClientTemplate.java:368)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.insert(IBatisSqlMapDAOImpl.java:155)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.insertModuleVersion(CacheDaoImpl.java:1191)
//	}
//
//	/**
//	 * Run the void insertServerComponentSeq(Map<String,String>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testInsertServerComponentSeq_1()
//		throws Exception {
//		
//		
//		
//		Map<String, String> paramMap = new HashMap();
//
//		fixture.insertServerComponentSeq(paramMap);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.insert(SqlMapClientTemplate.java:368)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.insert(IBatisSqlMapDAOImpl.java:155)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.insertServerComponentSeq(CacheDaoImpl.java:1213)
//	}
//
//	/**
//	 * Run the void insertServerLocalLogo(Map<String,String>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testInsertServerLocalLogo_1()
//		throws Exception {
//		
//		
//		
//		Map<String, String> paramMap = new HashMap();
//
//		fixture.insertServerLocalLogo(paramMap);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.insert(SqlMapClientTemplate.java:368)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.insert(IBatisSqlMapDAOImpl.java:155)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.insertServerLocalLogo(CacheDaoImpl.java:1235)
//	}
//
//	/**
//	 * Run the void insertServerLocalSeq(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testInsertServerLocalSeq_1()
//		throws Exception {
//		
//		
//		
//		int seq = 1;
//
//		fixture.insertServerLocalSeq(seq);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.insert(SqlMapClientTemplate.java:368)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.insert(IBatisSqlMapDAOImpl.java:155)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.insertServerLocalSeq(CacheDaoImpl.java:1239)
//	}
//
//	/**
//	 * Run the Map<String, Object> loadDataSourceRoute(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testLoadDataSourceRoute_1()
//		throws Exception {
//		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("DECISION_RULE", "2222");
//		map.put("DATA_SOURCE_NAME", "3333");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.loadDataSourceRoute", tenantId)).andReturn(list);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getDataRource", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		Map<String, Object> result = fixture.loadDataSourceRoute(CacheKey.defaultTenantId.toString());
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.loadDataSourceRoute(CacheDaoImpl.java:1038)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the Map<String, Object> loadDataSourceRoute(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testLoadDataSourceRoute_2()
//		throws Exception {
//		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("DECISION_RULE", "2222");
//		map.put("DATA_SOURCE_NAME", "3333");
//		list.add(map);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.loadDataSourceRoute", tenantId)).andReturn(list);
//		EasyMock.expect(sqlMapDAOImpl.queryForList("loadCommon.getDataRource", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapDAOImpl);
//		Map<String, Object> result = fixture.loadDataSourceRoute(CacheKey.defaultTenantId.toString());
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.queryForList(IBatisSqlMapDAOImpl.java:48)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.loadDataSourceRoute(CacheDaoImpl.java:1038)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the void orderAllExpr(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllExpr_1()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceExpr = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllExpr(sourceExpr, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllExpr(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllExpr_2()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceExpr = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllExpr(sourceExpr, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllExpr(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllExpr_3()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceExpr = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllExpr(sourceExpr, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllExpr(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllExpr_4()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceExpr = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllExpr(sourceExpr, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllExpr(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllExpr_5()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceExpr = null;
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllExpr(sourceExpr, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllExpr(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllExpr_6()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceExpr = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllExpr(sourceExpr, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllRouteCondition(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllRouteCondition_1()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceList = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllRouteCondition(sourceList, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllRouteCondition(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllRouteCondition_2()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceList = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllRouteCondition(sourceList, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllRouteCondition(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllRouteCondition_3()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceList = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllRouteCondition(sourceList, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllRouteCondition(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllRouteCondition_4()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceList = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllRouteCondition(sourceList, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllRouteCondition(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllRouteCondition_5()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceList = null;
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllRouteCondition(sourceList, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void orderAllRouteCondition(List<Map<String,Object>>,List<Map<String,Object>>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testOrderAllRouteCondition_6()
//		throws Exception {
//		
//		
//		
//		List<Map<String, Object>> sourceList = new LinkedList();
//		List<Map<String, Object>> orderedList = new LinkedList();
//
//		fixture.orderAllRouteCondition(sourceList, orderedList);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setSqlMapDAOImpl(IBatisSqlMapDAOImpl) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testSetSqlMapDAOImpl_1()
//		throws Exception {
//		
//		
//		
//		IBatisSqlMapDAOImpl sqlMapDAOImpl = new IBatisSqlMapDAOImpl();
//
//		fixture.setSqlMapDAOImpl(sqlMapDAOImpl);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setTokenEnableTime(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testSetTokenEnableTime_1()
//		throws Exception {
//		
//		
//		
//		String tokenEnableTime = "";
//
//		fixture.setTokenEnableTime(tokenEnableTime);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void updateModuleVersion(String,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testUpdateModuleVersion_1()
//		throws Exception {
//		
//		
//		
//		
//		String moduleName = "";
//
//		fixture.updateModuleVersion(tenantId, moduleName);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.update(SqlMapClientTemplate.java:382)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.update(IBatisSqlMapDAOImpl.java:132)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.updateModuleVersion(CacheDaoImpl.java:1182)
//	}
//
//	/**
//	 * Run the void updateServerComponentSeq(Map<String,String>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testUpdateServerComponentSeq_1()
//		throws Exception {
//		
//		
//		
//		Map<String, String> paramMap = new HashMap();
//
//		fixture.updateServerComponentSeq(paramMap);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.update(SqlMapClientTemplate.java:382)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.update(IBatisSqlMapDAOImpl.java:132)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.updateServerComponentSeq(CacheDaoImpl.java:1217)
//	}
//
//	/**
//	 * Run the void updateServerLocalSeq(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:16
//	 */
//	@Test
//	public void testUpdateServerLocalSeq_1()
//		throws Exception {
//		
//		
//		
//		int seq = 1;
//
//		fixture.updateServerLocalSeq(seq);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.update(SqlMapClientTemplate.java:382)
//		//       at com.linkage.rainbow.dao.impl.IBatisSqlMapDAOImpl.update(IBatisSqlMapDAOImpl.java:132)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.CacheDaoImpl.updateServerLocalSeq(CacheDaoImpl.java:1243)
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
//		new org.junit.runner.JUnitCore().run(CacheDaoImplTest.class);
//	}
//}