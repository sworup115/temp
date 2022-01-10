package com.te.casestudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("configuration.xml");
		Mobile bean = con.getBean(Mobile.class );
		bean.call();
	}

}
