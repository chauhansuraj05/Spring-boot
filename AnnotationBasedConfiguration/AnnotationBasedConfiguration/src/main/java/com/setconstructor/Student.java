package com.setconstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	int id;
	String name;
	
	public Student(@Value("101") int id, @Value("Smith") String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	
	
}
