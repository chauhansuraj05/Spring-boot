package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
     public static void main(String[] args) {
    	 BeanFactory beanFactory = new ClassPathXmlApplicationContext("config.xml");
    	  Student s = (Student) beanFactory.getBean("student"); 
    	  System.out.println(s);
//    	  System.out.println(s.getId());
//    	  System.out.println(s.getName());
    	   
    	  s.display();
    	  
    	  
    	  System.out.println("==================================================");
    	  
    	  
    	  Teacher t = (Teacher) beanFactory.getBean("teacher"); 
    	  System.out.println(t);
    	  t.display();
    	  
          System.out.println("==================================================");
    	  
    	  
    	  Subject ss = (Subject) beanFactory.getBean("subject"); 
    	  System.out.println(ss);
    	  ss.display();
		
	}
}
