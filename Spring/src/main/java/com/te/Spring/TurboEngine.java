package com.te.Spring;

public class TurboEngine implements Garage {
	String name;
	int capacity;

	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public void start() {
		System.out.println(name+"turbo engine start ");		
	}

	


}
