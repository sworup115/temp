package com.te.Springbean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class LIon implements Animal{

	@Override
	public void eat() {
System.out.println(" meat");		
	}

	@Override
	public void makesound() {
System.out.println(" rower");		
	}

	@Override
	public boolean ispet() {
		return false;
	}

}
