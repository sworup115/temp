package com.te.SpringAnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mockrating {
	@Value(" excelent")
	String rating;
	@Value("92")
	int pracicalmark;
	@Value("98")
	int theorymark;
	public void setRating(String rating) {
		this.rating = rating;
	}
	public void setPracicalmark(int pracicalmark) {
		this.pracicalmark = pracicalmark;
	}
	public void setTheorymark(int theorymark) {
		this.theorymark = theorymark;
	}
	@Override
	public String toString() {
		return "Mockrating [rating=" + rating + ", pracicalmark=" + pracicalmark + ", theorymark=" + theorymark + "]";
	}
	

}
