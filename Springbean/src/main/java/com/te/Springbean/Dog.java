package com.te.Springbean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class Dog implements Animal{

	@Override
	public void eat() {
  System.out.println(" chicken and rice");		
	}

	@Override
	public void makesound() {
System.out.println("bhow bhow");		
	}

	@Override
	public boolean ispet() {
		return true;
		
	}

}
