package com.te.BeanlifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
@myUDSGuyz
public class Demo implements InitializingBean,DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println(" initialisation");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("instantiation");
		
	}
	public void name() {
		System.out.println(" after seting properties");
	}

}
