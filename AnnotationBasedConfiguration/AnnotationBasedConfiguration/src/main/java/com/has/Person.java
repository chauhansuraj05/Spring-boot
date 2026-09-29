package com.has;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	Mobile mobile;

	public void display() {
		System.out.println("Displaying from Person");
		mobile.call();
		
	}
	
	
//	public Mobile getMobile() {
//		return mobile;
//	}
//
//	public void setMobile(Mobile mobile) {
//		this.mobile = mobile;
//	} 
}
