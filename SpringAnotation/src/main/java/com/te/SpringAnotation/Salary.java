package com.te.SpringAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Salary {
	@Autowired
	Mockrating mock;

	@Override
	public String toString() {
		return "Salary [mock=" + mock + "]";
	}
	

}
