package com.has;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PerDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(PersonConfig.class);
		Mobile m = (Mobile)con.getBean("mobile");
		Person p = (Person)con.getBean("person");
		
		p.display();
		con.close();
	}
}
