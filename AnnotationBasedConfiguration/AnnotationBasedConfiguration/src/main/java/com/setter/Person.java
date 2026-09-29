package com.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
 private int id;
 private String name;
 private int age;
 
 
 public int getId() {
		return id;
	}
 	@Value(value="101")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value(value="Smith")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Value(value="25")
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

}
