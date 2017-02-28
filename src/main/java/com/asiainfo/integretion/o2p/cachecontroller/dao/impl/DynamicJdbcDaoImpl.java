package com.asiainfo.integretion.o2p.cachecontroller.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.ailk.eaap.op2.bo.CsvTemplate;
import com.ailk.eaap.op2.bo.JdbcDataSource;
import com.asiainfo.integretion.o2p.cachecontroller.dao.IDynamicJdbcDao;

public class DynamicJdbcDaoImpl implements IDynamicJdbcDao, Serializable {

	private static final long serialVersionUID = 1L;
	private SqlSessionTemplate sqlSessionTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public List<JdbcDataSource> getAllDataSource(String tenantId) {
		return sqlSessionTemplate.selectList("o2p-serviceAgent-core.getAllDataSource",tenantId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CsvTemplate> getAllCsvTemplate(String tenantId) {
		return sqlSessionTemplate.selectList("o2p-serviceAgent-core.getAllCsvTemplate", tenantId);
	}



	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<Map<String, Object>> getAllMultiDataSourceRoute(String tenantId) {
		return sqlSessionTemplate.selectList("o2p-serviceAgent-core.queryMultiDataSourceRoute", tenantId);
	}

}
