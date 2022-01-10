package com.te.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{
    public static void main( String[] args )
    {
  ApplicationContext contanor=  new ClassPathXmlApplicationContext("configuration.xml");
  Car bean = contanor.getBean(Car.class);
  bean.move();
    }
}
