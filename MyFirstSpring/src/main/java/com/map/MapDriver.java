package com.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapDriver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("mapconfig.xml");
		StudentMap s = (StudentMap)ac.getBean("studentmap");
		 System.out.println(s);
		 s.display();
		 
	}

}
