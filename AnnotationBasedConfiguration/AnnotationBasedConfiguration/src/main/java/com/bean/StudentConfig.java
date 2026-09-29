package com.bean;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bean")
public class StudentConfig {

	
	@Bean
	public Student createObject() {
		return new Student();	
	}
	
	@Bean
	public ArrayList<Integer> getObject(){
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		return arr;
	}
}
