package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	@Value("101")
	int id;
	
	
	@Value("Smith")
	String name;
}
