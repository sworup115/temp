package com.te.Spring;

public class Car {
	Garage g;
	String name;

//	public Car(Garage g, String name) {
//		super();
//		this.g = g;
//		this.name = name;
	//}
	void move() {
		g.start();
		System.out.println("car move");
	}

	public void setG(Garage g) {
		this.g = g;
	}

	public void setName(String name) {
		this.name = name;
	}

}
