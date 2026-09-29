package com.hasa.object;

public class Person {
	
	private Mobile mobile;
      void display() {
    	  System.out.println("Displaying From Person");
    	  mobile.call();
      }
      
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
      
      
}

