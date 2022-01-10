package com.te.Springbean;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.te.Springbean","Somthing"})
public class Config {
	
//	@Bean("Dog")
//	public Dog getDog(){
//		return new Dog();
//	}
//	@Bean("Cat")
//	@Primary
//	public Cat getCat() {
//		return new Cat();
//
//	}
//  @Bean("LIon")
//   public LIon getIon() {
//	return new LIon();
//   }
//  @Bean
//  public Pet gePet() {
//	  return new Pet();
//  }
}
