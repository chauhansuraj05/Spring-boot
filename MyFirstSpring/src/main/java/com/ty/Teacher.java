package com.ty;

public class Teacher {
     
	private int id;
	private String name;
	private int age;
	
	
	public void display() {
		System.out.println("ID :"+ id +", Name :" +name + ", Age :"+ age );
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
