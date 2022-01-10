package com.te.BeanlifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext con= new AnnotationConfigApplicationContext(BeanConfig.class);
    	Demo bean = (Demo)con.getBean("demo");
    	bean.name();
    	con.close();
    }
}
