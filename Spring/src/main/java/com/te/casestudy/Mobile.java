package com.te.casestudy;

public class Mobile {
	Company c;
	int camera;
	void call() {
		c.switchon();
		System.out.println(" call going in");
		
	}
	public Mobile(Company c, int camera) {
		super();
		this.c = c;
		this.camera = camera;
	}

}
