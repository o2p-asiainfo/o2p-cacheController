package com.asiainfo.integretion.o2p.cachecontroller.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest extends TestCase{

	ApplicationContext app = null;
	public  BaseTest(){
		
		app = new ClassPathXmlApplicationContext();
	}
	
	public Object getBean(String bean){
		return app.getBean(bean);
	}
	
	@Test
	public void testGetTenantIdList_1()
			throws Exception {
		assertNotNull(app);
	}
}
