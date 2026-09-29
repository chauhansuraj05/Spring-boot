package com.val;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	@Value(value="101")
	int id;
	@Value(value="smith")
	String name;
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}
