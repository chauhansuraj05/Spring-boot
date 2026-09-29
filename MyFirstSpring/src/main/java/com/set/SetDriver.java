package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetDriver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("setconfig.xml");
		  StudentSEt s = (StudentSEt)ac.getBean("studentset");
		 s.display();
	}

}
