package com.anno;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.anno.*;


public class AnnDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student s = (Student)con.getBean("student");
		System.out.println(s);
	}
}
