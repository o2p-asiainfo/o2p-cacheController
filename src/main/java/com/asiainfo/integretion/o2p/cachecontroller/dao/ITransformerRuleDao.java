package com.asiainfo.integretion.o2p.cachecontroller.dao;

import java.util.List;
import java.util.Map;

import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.NodeValReq;
import com.ailk.eaap.op2.bo.ParamVarMap;
import com.ailk.eaap.op2.bo.TransformerRule;


public interface ITransformerRuleDao{
	public TransformerRule getTransformerRuleById(Integer id);
	public List<TransformerRule> getAllUsable(String tenantId);
	public List<ParamVarMap> getParamVarMapByType(String tenantId);
	public NodeValReq queryNodeValReqByNodeId(Integer nodeDescId, Integer transformerRuleId, String tenantId);
	public ContractFormat getBaseContractFormat(Map<String, Object> map);
}
