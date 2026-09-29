package com.setconstructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StuDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student t = (Student)con.getBean("student");
		System.out.println(t);
		t.display();
		System.out.println(t.id);
	}

}
