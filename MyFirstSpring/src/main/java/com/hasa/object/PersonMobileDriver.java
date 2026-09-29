package com.hasa.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMobileDriver {
   public static void main(String[] args) {
	   ApplicationContext ac = new ClassPathXmlApplicationContext("hasaobject.xml");
	   
	   Mobile m = (Mobile)ac.getBean("mobile");
	   System.out.println(m);
	   
	   Person p = (Person)ac.getBean("person");
	   System.out.println(p);
	   p.display();
}
}
