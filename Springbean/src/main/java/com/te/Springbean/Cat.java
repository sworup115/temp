package com.te.Springbean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println(" milk");
		
	}

	@Override
	public void makesound() {
System.out.println(" miaou miaou");		
	}

	@Override
	public boolean ispet() {
		return true;
	}


}
