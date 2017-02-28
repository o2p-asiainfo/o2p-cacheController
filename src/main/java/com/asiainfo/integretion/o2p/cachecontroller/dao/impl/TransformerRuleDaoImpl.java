package com.asiainfo.integretion.o2p.cachecontroller.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.NodeValReq;
import com.ailk.eaap.op2.bo.ParamVarMap;
import com.ailk.eaap.op2.bo.TransformerRule;
import com.asiainfo.integretion.o2p.cachecontroller.dao.ITransformerRuleDao;

public class TransformerRuleDaoImpl  implements ITransformerRuleDao, Serializable{

	
	private static final long serialVersionUID = 1L;

	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public TransformerRule getTransformerRuleById(Integer id) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("contractAdapterId", id);
        return (TransformerRule) sqlSessionTemplate.selectOne("transformerRule.selectTransformerRuleById", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TransformerRule> getAllUsable(String tenantId) {
		return sqlSessionTemplate.selectList("transformerRule.selectAllUseable", tenantId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ParamVarMap> getParamVarMapByType(String tenantId) {
		return sqlSessionTemplate.selectList("transformerRule.selectParamVarMap", tenantId);
	}

	@Override
	public NodeValReq queryNodeValReqByNodeId(Integer nodeDescId, Integer transformerRuleId, String tenantId) {
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("nodeDescId", nodeDescId);
        map.put("transformerRuleId", transformerRuleId);
        map.put("tenantId", tenantId);
		return (NodeValReq)sqlSessionTemplate.selectOne("transformerRule.selectNodeValReqByNodeId", map);
	}

	@Override
	public ContractFormat getBaseContractFormat(Map<String, Object> map) {

		return (ContractFormat)sqlSessionTemplate.selectOne("transformerRule.getBaseContractFormat", map);
	}
}
