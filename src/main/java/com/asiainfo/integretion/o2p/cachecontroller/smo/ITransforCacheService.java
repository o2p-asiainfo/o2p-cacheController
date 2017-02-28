/** 
 * Project Name:o2p-cacheController 
 * File Name:ITransforCacheService.java 
 * Package Name:com.asiainfo.integretion.o2p.cachecontroller.smo 
 * Date:2016年1月12日上午10:51:36 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integretion.o2p.cachecontroller.smo;  

import com.ailk.eaap.op2.bo.TransformerRule;

public interface ITransforCacheService {

	void initMsgBody(TransformerRule transformerRule);

	void buildNodeDesc(TransformerRule transformerRule);

}
