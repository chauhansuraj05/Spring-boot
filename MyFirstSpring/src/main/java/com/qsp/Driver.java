package com.qsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
     
	public static void main(String[] args) {
		ApplicationContext ac =  new ClassPathXmlApplicationContext("studentconfig.xml");
		  Student s = (Student)ac.getBean("mySubject");
		  
		  System.out.println(s.id);
		  System.out.println(s.name);
		  System.out.println(s.age);
		 
	}
}

