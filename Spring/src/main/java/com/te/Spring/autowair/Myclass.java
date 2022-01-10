package com.te.Spring.autowair;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myclass {
public static void main(String[] args) {
	ApplicationContext containor=new ClassPathXmlApplicationContext("configuration.xml");
	Laptop bean = containor.getBean(Laptop.class);
	System.out.println(bean);

}
}
