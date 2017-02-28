package com.asiainfo.integretion.o2p.cachecontroller.test;

import java.text.ParseException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder;
import com.ailk.eaap.op2.bo.JdbcDataSource;
import com.ailk.eaap.op2.common.EAAPException;
import com.asiainfo.integretion.o2p.cachecontroller.common.ReloadCache;

public class TestCacheService {

	private  Logger log = Logger.getLogger(TestCacheService.class);
	ApplicationContext app = null;
	@Before
	public void setUp(){
		app = new ClassPathXmlApplicationContext(new String[]{"spring/o2p-common-cache.xml","spring/o2p-cacheController-spring.xml","spring/o2p-cacheController-base.xml"});
	}
	
	@Test
	public void cacheReload(){
//		IReloadCache reloadCache =(IReloadCache)app.getBean("reloadCache");
//		reloadCache.cacheRefreshService(null, "MODULE_ALL", "1");
//		reloadCache.addAll(null);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test() throws EAAPException, InterruptedException, ParseException{
//		ZKCfgCacheHolder.PROP_ITEMS.put("spring.redis.sentinel.master", "mymaster");
//		ZKCfgCacheHolder.PROP_ITEMS.put("spring.redis.sentinel.nodes", "10.6.0.12:26479");


		ICacheFactory cacheFactory = (ICacheFactory)app.getBean("cacheFactory");
		
		ReloadCache cache = (ReloadCache)app.getBean("reloadCache");
		cache.reloadCache();
		System.out.println("---"+cacheFactory.getCacheClient().get("1111SERVICEColumbinApi"));
		System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.err.println(cacheFactory.getCacheClient().get("1Appaa"));
		Object cacheStrategy=cacheFactory.getCacheClient().get("1CACHE_STRATEGY1");
		System.err.println("cacheStrategy："+cacheStrategy);
		
		
//		cache.addAll(null);
//		System.out.println(cacheFactory.getCacheClient().get("1serInvokeIns650"));
//		System.out.println(1);
//		cacheFactory.getCacheClient().clear();
////		cacheFactory.getCacheClient().remove("ERROR_KEY_DATA_SOURCE_MAP");
//		ICacheService cacheService = (ICacheService)app.getBean("cacheService");
////		log.debug(cacheService.getKey("ALL_CONF_PROPERTIES"));
//		log.debug(KeyParseUtil.parse("ALL_CONF_PROPERTIES"));
//		cacheService.cacheService("MODULE_ALL", "1");
//		cacheService.addTransformerRule("111");
//		IIbatisDao ibatisDao = (IIbatisDao)app.getBean("ibatisDao");
//		cacheFactory.getCacheClient().clear();//cacheService.addAll();
////		cacheService.addSerIns("999333");
//		cacheFactory.getCacheClient().remove("serInvokeIns800000171");
//		cacheService.addRestConfig("333");
//		log.debug(cacheService.getKey("001534534"));
//		log.debug(cacheService.getKey("KEY_LIST_SER_INVOKE_INS_BY_ID"));
//		log.debug(cacheService.getKey(CacheKey.KEY_LIST_SER_INVOKE_INS));
//		log.debug(cacheService.getKey(CacheKey.ERROR_KEY_LIST_SER_INVOKE_INS));
//		cacheService.addTransformerRule("3333");
//		cacheService.addAll();
//		cacheService.addRestConfig("2222");
//		System.out.println(((TechImpl)cacheService.getKey(CacheKey.techImpl +"800000103")).getAttrMap().get(EndpointAttr.LINK_FILE_DIR));
//		cacheFactory.getCacheClient().clear();
//		cacheFactory.getCacheClient().put("0011005", "550");
//		Map map = new HashMap();map.put("LOCALSEQ", "001");map.put("COMPONENT_CODE", "1005");map.put("TRANIDSEQ", "400");map.put("IPPORT", "128.0.0.1:80");
//		ibatisDao.insertServerLocalLogo(map);
//		ibatisDao.updateServerLocalSeq(4 );
//		ibatisDao.insertServerComponentSeq(map);
//		ibatisDao.updateServerComponentSeq(map);
//		cacheFactory.getCacheClient().remove("10.6.0.155:8080");
//		cacheFactory.getCacheClient().clear();
//		System.out.println(cacheFactory.getCacheClient().get(CacheKey.DB_SERVER_COMPONENT_SEQ));
//		System.out.println(cacheFactory.getCacheClient().get(CacheKey.DB_SERVER_COMPONENT_SEQ));
//		cacheFactory.getCacheClient().put("0019", "90");
//		IIbatisDao ibatisDao = (IIbatisDao)this.getBean("ibatisDao");
//		ibatisDao.updateModuleVersion(CacheKey.MODULE_ALL);
//		System.out.println(cacheService.getKey("DB_SERVER_COMPONENT_SEQ"));
//		log.debug(generateTokeCode());log.debug(generateTokeCode());log.debug(generateTokeCode());log.debug(generateTokeCode());log.debug(generateTokeCode());
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String aa= df.format(new Date());
//		log.debug("aa:"+aa);
//		cacheService.addAll();
//		this.wait(5);
//		this.notifyAll();
//		String bb= df.format(new Date());
//		log.debug("bb:"+bb);
//		log.debug(df.parse(aa)==(df.parse(bb)));
	}
	@Test
	public void testInitAllData(){
//		ICacheService cacheService = (ICacheService)app.getBean("cacheService");
	}
}
