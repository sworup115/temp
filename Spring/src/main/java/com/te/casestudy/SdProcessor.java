package com.te.casestudy;

public class SdProcessor implements Company{
	int processor;
	String name;
	int price;


	public SdProcessor(int processor, String name) {
		super();
		this.processor = processor;
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public void switchon() {
		System.out.println(" iqoo switch on");
	}

}
