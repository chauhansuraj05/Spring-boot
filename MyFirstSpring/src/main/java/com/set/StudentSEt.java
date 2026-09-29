package com.set;

import java.util.Set;

public class StudentSEt { 
	
	private int id ; 
	private String name ;
	private int age;
	private Set<String> sub;
	
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
	
	
	public Set<String> getSub() {
		return sub;
	}
	public void setSub(Set<String> sub) {
		this.sub = sub;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sub=" + sub + "]";
	}
	
	public void display() {
		for(String s : sub) {
			System.out.println(s);
		}
	}
    
    

}
