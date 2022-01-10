package com.te.Springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Somthing.Sum;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext containor=new AnnotationConfigApplicationContext(Config.class);
    	Pet bean = containor.getBean(Pet.class);
    	bean.doThing();
    	Sum bean2 = containor.getBean(Sum.class);
    	System.out.println();
    	
    }
    
}
