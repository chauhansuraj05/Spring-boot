package com.ty;

public class Subject {
	
	private int id;
	private String sub_name;
	private double credits;
	
	public void display() {
		System.out.println("ID :"+ id +", Name :" +sub_name + ", Credits :"+ credits );
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	
	

}
