package com.te.casestudy;

public class Midatake implements Company {
	int processor;
	String name;
	int price;


	@Override
	public void switchon() {
		System.out.println(" vivo swithch on");
		
	}


	public Midatake(int processor, String name) {
		super();
		this.processor = processor;
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}

}
