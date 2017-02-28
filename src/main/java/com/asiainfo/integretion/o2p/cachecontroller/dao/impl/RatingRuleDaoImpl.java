package com.asiainfo.integretion.o2p.cachecontroller.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.integration.o2p.billing.ApiProductProdOfferOrgRela;
import com.ailk.eaap.op2.bo.BasicTariff;
import com.ailk.eaap.op2.bo.BillingCycle;
import com.ailk.eaap.op2.bo.BillingDiscount;
import com.ailk.eaap.op2.bo.ComponentPrice;
import com.ailk.eaap.op2.bo.OfferProdRel;
import com.ailk.eaap.op2.bo.OfferProdRelPricing;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.bo.OrgOfferOrderRela;
import com.ailk.eaap.op2.bo.PricePlan;
import com.ailk.eaap.op2.bo.PricingTarget;
import com.ailk.eaap.op2.bo.ProdOffer;
import com.ailk.eaap.op2.bo.ProdOfferPricing;
import com.ailk.eaap.op2.bo.RatingCurverDetail;
import com.ailk.eaap.op2.bo.ServiceProductRela;
import com.ailk.eaap.op2.bo.Api;
import com.asiainfo.integration.o2p.billing.APIPricingCase;
import com.asiainfo.integretion.o2p.cachecontroller.dao.IRatingRuleDao;
import com.ibatis.sqlmap.client.SqlMapClient;

@Service(value="ratingRuleDao")
public class RatingRuleDaoImpl  implements IRatingRuleDao, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProdOffer> getProdOffer(String tenantId) {
		List<ProdOffer> list = sqlSessionTemplate.selectList("ratingRule.selectAPIProdOffer", tenantId);
		List<ProdOffer> listtemp = new ArrayList<ProdOffer>();
		for (ProdOffer prodOffer : list) {
			List<ProdOfferPricing> prodOfferPricingListTemp = new ArrayList<ProdOfferPricing>();
			List<ProdOfferPricing> prodOfferPricingList = prodOffer
					.getProdOfferPricingList();
			for (ProdOfferPricing prodOfferPricing : prodOfferPricingList) {
				List<PricePlan> pricePlanListTemp = new ArrayList<PricePlan>();
				List<PricePlan> pricePlanList = prodOfferPricing
						.getPricePlanList();
				for (PricePlan pricePlan : pricePlanList) {
					List<ComponentPrice> componentPriceListTemp = new ArrayList<ComponentPrice>();
					List<ComponentPrice> componentPriceList = pricePlan
							.getComponentPriceList();
					for (ComponentPrice componentPrice : componentPriceList) {
						BasicTariff basic = componentPrice.getBasicTariff();
						if (basic != null) {
							List<RatingCurverDetail> ratingCurverDetailList = basic
									.getRatingCurverDetailList();
							List<RatingCurverDetail> ratingCurverDetailListTemp = new ArrayList<RatingCurverDetail>();
							for (RatingCurverDetail ratingCurverDetail : ratingCurverDetailList) {
								ratingCurverDetailListTemp
										.add(ratingCurverDetail);
							}
							basic.setRatingCurverDetailList(ratingCurverDetailListTemp);
						}
						BillingDiscount billing = componentPrice
								.getBillingDiscount();
						if (billing != null) {
							List<RatingCurverDetail> ratingCurverDetailList = billing
									.getDiscountInfoList();
							List<RatingCurverDetail> ratingCurverDetailListTemp = new ArrayList<RatingCurverDetail>();
							for (RatingCurverDetail ratingCurverDetail : ratingCurverDetailList) {
								ratingCurverDetailListTemp
										.add(ratingCurverDetail);
							}
							billing.setDiscountInfoList(ratingCurverDetailListTemp);
						}
						componentPrice.setBasicTariff(basic);
						componentPrice.setBillingDiscount(billing);
						componentPriceListTemp.add(componentPrice);
					}
					pricePlan.setComponentPriceList(componentPriceListTemp);
					pricePlanListTemp.add(pricePlan);
				}

				PricingTarget pricingTarget = prodOfferPricing
						.getPricingTarget();
				if (pricingTarget != null) {
					List<OfferProdRelPricing> offerProdRelPricingList = pricingTarget
							.getOfferProdRelPricingList();
					List<OfferProdRelPricing> offerProdRelPricingListTemp = new ArrayList<OfferProdRelPricing>();
					for (OfferProdRelPricing offerProdRelPricing : offerProdRelPricingList) {
						offerProdRelPricingListTemp.add(offerProdRelPricing);
					}
					pricingTarget
							.setOfferProdRelPricingList(offerProdRelPricingListTemp);
					prodOfferPricing.setPricingTarget(pricingTarget);
		            if(pricingTarget.getPricingTargetId() != null){
		                	 prodOfferPricing.setPricingTargetId(pricingTarget.getPricingTargetId());
		             }
				}
              
				prodOfferPricing.setPricePlanList(pricePlanListTemp);
				prodOfferPricingListTemp.add(prodOfferPricing);
			}
			prodOffer.setProdOfferPricingList(prodOfferPricingListTemp);
			listtemp.add(prodOffer);
		}
		return listtemp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Org> getOrg(String tenantId) {
		List<Org> list = sqlSessionTemplate.selectList("ratingRule.selectAPIOrg", tenantId);
		List<Org> listtemp = new ArrayList<Org>();
		if (list != null && !list.isEmpty()) {
			for (Org item : list) {
				List<OrgOfferOrderRela> ooorList = item
						.getOrgOfferOrderRelaList();
				List<OrgOfferOrderRela> ooorListTemp = new ArrayList<OrgOfferOrderRela>();
				if (ooorList.size() != 0) {
					for (OrgOfferOrderRela ooor : ooorList) {
						ooorListTemp.add(ooor);
					}
				}
				item.setOrgOfferOrderRelaList(ooorListTemp);
				listtemp.add(item);
			}
		}
		return listtemp;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Org> getOrgPricingCase(String tenantId) {
		List<Org> list = sqlSessionTemplate.selectList("ratingRule.selectAPIOrg", tenantId);
		List<Org> listtemp = new ArrayList<Org>();
		if (list != null && !list.isEmpty()) {
			for (Org item : list) {
				List<OrgOfferOrderRela> ooorList = item
						.getOrgOfferOrderRelaList();
				List<OrgOfferOrderRela> ooorListTemp = new ArrayList<OrgOfferOrderRela>();
				if (ooorList.size() != 0) {
					for (OrgOfferOrderRela ooor : ooorList) {
						List<APIPricingCase> apiPricingCaseList = ooor.getApiPricingCaseList();
						List<APIPricingCase> apiPricingCaseListTemp = new ArrayList<APIPricingCase>();
						if(apiPricingCaseList.size()!=0){
							for(APIPricingCase apiPricingCase:apiPricingCaseList){
								apiPricingCaseListTemp.add(apiPricingCase);
							}
						}
						ooor.setApiPricingCaseList(apiPricingCaseListTemp);
						ooorListTemp.add(ooor);
					}
				}
				item.setOrgOfferOrderRelaList(ooorListTemp);
				listtemp.add(item);
			}
		}
		return listtemp;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Api> getApi(String tenantId) {
		return sqlSessionTemplate.selectList("ratingRule.selectAPIApi", tenantId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceProductRela> getServiceProductRela() {
		List<ServiceProductRela> list = sqlSessionTemplate.selectList("ratingRule.selectAPIServiceProductRela");
		List<ServiceProductRela> listtemp = new ArrayList<ServiceProductRela>();

		for (ServiceProductRela serviceProductRela : list) {
			if (serviceProductRela.getProduct() != null) {
				List<OfferProdRel> offerProdRelList = serviceProductRela
						.getProduct().getOfferProdRelList();
				List<OfferProdRel> offerProdRelListTemp = new ArrayList<OfferProdRel>();
				for (OfferProdRel offerProdRel : offerProdRelList) {
					if (offerProdRel.getProdOffer() != null) {
						List<ProdOfferPricing> prodOfferPricingList = offerProdRel
								.getProdOffer().getProdOfferPricingList();
						List<ProdOfferPricing> prodOfferPricingListTemp = new ArrayList<ProdOfferPricing>();
						for (ProdOfferPricing prodOfferPricing : prodOfferPricingList) {
							List<PricePlan> pricePlanList = prodOfferPricing
									.getPricePlanList();
							List<PricePlan> pricePlanListTemp = new ArrayList<PricePlan>();
							for (PricePlan pricePlan : pricePlanList) {
								List<ComponentPrice> componentPriceList = pricePlan
										.getComponentPriceList();
								List<ComponentPrice> componentPriceListTemp = new ArrayList<ComponentPrice>();
								for (ComponentPrice componentPrice : componentPriceList) {
									componentPriceListTemp.add(componentPrice);
								}
								pricePlan
										.setComponentPriceList(componentPriceListTemp);
								pricePlanListTemp.add(pricePlan);
							}
							prodOfferPricing
									.setPricePlanList(pricePlanListTemp);
							prodOfferPricingListTemp.add(prodOfferPricing);
						}
						offerProdRel.getProdOffer().setProdOfferPricingList(
								prodOfferPricingListTemp);
						offerProdRelListTemp.add(offerProdRel);

					}
				}
				serviceProductRela.getProduct().setOfferProdRelList(
						offerProdRelListTemp);
				listtemp.add(serviceProductRela);

			}
		}
		return listtemp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BillingCycle> getBillingCycle(String tenantId) {
		return sqlSessionTemplate.selectList("ratingRule.selectAPIBillingCycle", tenantId);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<ApiProductProdOfferOrgRela> getApiProductProdOfferOrgRela(String tenantId) {
		return sqlSessionTemplate.selectList("ratingRule.selectAPIApiProductProdOfferOrgRela", tenantId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getKeyList() {
		return sqlSessionTemplate.selectList("ratingRule.selectKeyList");
	}

	@Override
	public void setBillingCycle(BillingCycle billingCycle) {
		sqlSessionTemplate.insert("ratingRule.insertBillingCycle", billingCycle);
	}
	
	@Override
	public List<Map<String,String>> getApiBillingCycleOfDate(Map paraMap) {
		return sqlSessionTemplate.selectList("ratingRule.selectAPIBillingCycleBean", paraMap);
	}

	@Override
	public List<Map<String, String>> getSettlementData(String tenantId) {
		return  sqlSessionTemplate.selectList("ratingRule.querySettlementInfo", tenantId);
	}

}
