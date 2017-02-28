package com.asiainfo.integretion.o2p.cachecontroller.dao;

import java.util.List;
import java.util.Map;

import com.ailk.eaap.op2.bo.CsvTemplate;
import com.ailk.eaap.op2.bo.JdbcDataSource;

public interface IDynamicJdbcDao {

	List<JdbcDataSource> getAllDataSource(String tenantId);
	
	List<CsvTemplate> getAllCsvTemplate(String tenantId);

	List<Map<String, Object>> getAllMultiDataSourceRoute(String tenantId);
}
