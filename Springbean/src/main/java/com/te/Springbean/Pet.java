package com.te.Springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Pet {
String name;
@Autowired
@Qualifier("dog")
Animal animal;
public void doThing() {
	if(animal.ispet()) 
	{
	animal.eat();
	animal.makesound();
		
	}
	else
		System.out.println(" it is not a dog");
	
}
}
