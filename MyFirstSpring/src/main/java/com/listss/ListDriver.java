package com.listss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.listss.Student;

public class ListDriver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("listconfig.xml");
		  Student s = (Student)ac.getBean("student");
		 s.display();
	}

}
