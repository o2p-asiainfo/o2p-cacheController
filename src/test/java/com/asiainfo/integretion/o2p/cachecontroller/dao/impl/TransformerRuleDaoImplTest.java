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
//import com.ailk.eaap.op2.bo.NodeValReq;
//import com.ailk.eaap.op2.bo.ParamVarMap;
//import com.ailk.eaap.op2.bo.TransformerRule;
//
///**
// * The class <code>TransformerRuleDaoImplTest</code> contains tests for the class <code>{@link TransformerRuleDaoImpl}</code>.
// *
// * @generatedBy CodePro at 15-12-3 3:15
// * @author thinpad
// * @version $Revision: 1.0 $
// */
//public class TransformerRuleDaoImplTest {
//	String tenantId = "1";
//	TransformerRuleDaoImpl fixture = new TransformerRuleDaoImpl();
//	com.ibatis.sqlmap.client.SqlMapClient sqlMapClient = EasyMock.createMock(com.ibatis.sqlmap.client.SqlMapClient.class);
//	SqlMapClientTemplate sqlMapClientTemplate = EasyMock.createMock(SqlMapClientTemplate.class);
//	
//	public void testInit(){
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//	}
//	/**
//	 * Run the TransformerRuleDaoImpl() constructor test.
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testTransformerRuleDaoImpl_1()
//		throws Exception {
//		TransformerRuleDaoImpl result = new TransformerRuleDaoImpl();
//		assertNotNull(result);
//		// add additional test code here
//	}
//
//	/**
//	 * Run the List<TransformerRule> getAllUsable(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetAllUsable_1()
//		throws Exception {
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//		List<TransformerRule> list = new ArrayList<TransformerRule>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("transformerRule.selectAllUseable", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<TransformerRule> result = fixture.getAllUsable(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl.getAllUsable(TransformerRuleDaoImpl.java:29)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<TransformerRule> getAllUsable(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetAllUsable_2()
//		throws Exception {
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//		List<TransformerRule> list = new ArrayList<TransformerRule>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("transformerRule.selectAllUseable", tenantId)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<TransformerRule> result = fixture.getAllUsable(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl.getAllUsable(TransformerRuleDaoImpl.java:29)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ParamVarMap> getParamVarMapByType() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetParamVarMapByType_1()
//		throws Exception {
//		
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//		List<ParamVarMap> list = new ArrayList<ParamVarMap>();
//		EasyMock.expect(sqlMapClientTemplate.queryForList("transformerRule.selectParamVarMap")).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		List<ParamVarMap> result = fixture.getParamVarMapByType();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl.getParamVarMapByType(TransformerRuleDaoImpl.java:35)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the List<ParamVarMap> getParamVarMapByType() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetParamVarMapByType_2()
//		throws Exception {
//		
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//		List<ParamVarMap> result = fixture.getParamVarMapByType();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:261)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl.getParamVarMapByType(TransformerRuleDaoImpl.java:35)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the TransformerRule getTransformerRuleById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetTransformerRuleById_1()
//		throws Exception {
//		
//		Integer id = new Integer(1);
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//		TransformerRule result = fixture.getTransformerRuleById(id);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForObject(SqlMapClientTemplate.java:242)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl.getTransformerRuleById(TransformerRuleDaoImpl.java:23)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the TransformerRule getTransformerRuleById(Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetTransformerRuleById_2()
//		throws Exception {
//		
//		Integer id = new Integer(1);
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//		TransformerRule list = new TransformerRule();
//		Map<String, Integer> map = new HashMap<String, Integer>();
//        map.put("contractAdapterId", id);
//		EasyMock.expect(sqlMapClientTemplate.queryForObject("transformerRule.selectTransformerRuleById", map)).andReturn(list);
//		EasyMock.replay(sqlMapClientTemplate);
//		TransformerRule result = fixture.getTransformerRuleById(id);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForObject(SqlMapClientTemplate.java:242)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl.getTransformerRuleById(TransformerRuleDaoImpl.java:23)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the NodeValReq queryNodeValReqByNodeId(Integer,Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testQueryNodeValReqByNodeId_1()
//		throws Exception {
//		
//		Integer nodeDescId = new Integer(1);
//		Integer transformerRuleId = new Integer(1);
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//		NodeValReq result = fixture.queryNodeValReqByNodeId(nodeDescId, transformerRuleId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForObject(SqlMapClientTemplate.java:242)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl.queryNodeValReqByNodeId(TransformerRuleDaoImpl.java:43)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the NodeValReq queryNodeValReqByNodeId(Integer,Integer) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testQueryNodeValReqByNodeId_2()
//		throws Exception {
//		
//		Integer nodeDescId = new Integer(1);
//		Integer transformerRuleId = new Integer(1);
//		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//		NodeValReq result = fixture.queryNodeValReqByNodeId(nodeDescId, transformerRuleId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForObject(SqlMapClientTemplate.java:242)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.TransformerRuleDaoImpl.queryNodeValReqByNodeId(TransformerRuleDaoImpl.java:43)
//		assertNull(result);
//	}
//
//	/**
//	 * Perform pre-test initialization.
//	 *
//	 * @throws Exception
//	 *         if the initialization fails for some reason
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
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
//	 * @generatedBy CodePro at 15-12-3 3:15
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
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	public static void main(String[] args) {
//		new org.junit.runner.JUnitCore().run(TransformerRuleDaoImplTest.class);
//	}
//}