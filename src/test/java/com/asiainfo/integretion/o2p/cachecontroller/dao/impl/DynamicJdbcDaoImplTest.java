//package com.asiainfo.integretion.o2p.cachecontroller.dao.impl;
//
//import java.util.List;
//
//import org.easymock.EasyMock;
//import org.junit.*;
//
//import static org.junit.Assert.*;
//
//import org.springframework.orm.ibatis.SqlMapClientTemplate;
//
//import com.ailk.eaap.op2.bo.CsvTemplate;
//import com.ailk.eaap.op2.bo.JdbcDataSource;
//
///**
// * The class <code>DynamicJdbcDaoImplTest</code> contains tests for the class <code>{@link DynamicJdbcDaoImpl}</code>.
// *
// * @generatedBy CodePro at 15-12-3 3:15
// * @author thinpad
// * @version $Revision: 1.0 $
// */
//public class DynamicJdbcDaoImplTest {
//	String tenantId = "1";
//	DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
//	com.ibatis.sqlmap.client.SqlMapClient sqlMapClient = EasyMock.createMock(com.ibatis.sqlmap.client.SqlMapClient.class);
//	SqlMapClientTemplate sqlMapClientTemplate = EasyMock.createMock(SqlMapClientTemplate.class);
//	
//	@Before
//	public void testInit(){
////		fixture.setSqlMapClient(sqlMapClient);
//		sqlMapClientTemplate.setSqlMapClient(sqlMapClient);
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
//	}
//	/**
//	 * Run the DynamicJdbcDaoImpl() constructor test.
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testDynamicJdbcDaoImpl_1()
//		throws Exception {
//		DynamicJdbcDaoImpl result = new DynamicJdbcDaoImpl();
//		assertNotNull(result);
//		// add additional test code here
//	}
//
//	/**
//	 * Run the List<CsvTemplate> getAllCsvTemplate(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetAllCsvTemplate_1()
//		throws Exception {
//		
//		
//		
//
//		List<CsvTemplate> result = fixture.getAllCsvTemplate(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.DynamicJdbcDaoImpl.getAllCsvTemplate(DynamicJdbcDaoImpl.java:25)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<CsvTemplate> getAllCsvTemplate(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetAllCsvTemplate_2()
//		throws Exception {
//		
//		
//		
//
//		List<CsvTemplate> result = fixture.getAllCsvTemplate(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.DynamicJdbcDaoImpl.getAllCsvTemplate(DynamicJdbcDaoImpl.java:25)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<JdbcDataSource> getAllDataSource(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetAllDataSource_1()
//		throws Exception {
//		
//		
//		
//
//		List<JdbcDataSource> result = fixture.getAllDataSource(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.DynamicJdbcDaoImpl.getAllDataSource(DynamicJdbcDaoImpl.java:19)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the List<JdbcDataSource> getAllDataSource(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetAllDataSource_2()
//		throws Exception {
//		
//		
//		
//
//		List<JdbcDataSource> result = fixture.getAllDataSource(tenantId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.IllegalArgumentException: No SqlMapClient specified
//		//       at org.springframework.util.Assert.notNull(Assert.java:112)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:164)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.executeWithListResult(SqlMapClientTemplate.java:220)
//		//       at org.springframework.orm.ibatis.SqlMapClientTemplate.queryForList(SqlMapClientTemplate.java:267)
//		//       at com.asiainfo.integretion.o2p.cachecontroller.dao.impl.DynamicJdbcDaoImpl.getAllDataSource(DynamicJdbcDaoImpl.java:19)
//		assertNull(result);
//	}
//
//	/**
//	 * Run the SqlMapClientTemplate getSqlMapClientTemplate() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testGetSqlMapClientTemplate_1()
//		throws Exception {
//		
//		
//
//		SqlMapClientTemplate result = fixture.getSqlMapClientTemplate();
//
//		// add additional test code here
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the void setSqlMapClientTemplate(SqlMapClientTemplate) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-3 3:15
//	 */
//	@Test
//	public void testSetSqlMapClientTemplate_1()
//		throws Exception {
//		
//		
//		SqlMapClientTemplate sqlMapClientTemplate = new SqlMapClientTemplate();
//
//		fixture.setSqlMapClientTemplate(sqlMapClientTemplate);
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
//		new org.junit.runner.JUnitCore().run(DynamicJdbcDaoImplTest.class);
//	}
//}