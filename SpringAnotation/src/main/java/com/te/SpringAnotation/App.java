package com.te.SpringAnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    
    {
    ApplicationContext containor=	new ClassPathXmlApplicationContext("Spring.xml");
    Salary bean = containor.getBean(Salary.class);
    System.out.println(bean);
    }
}
