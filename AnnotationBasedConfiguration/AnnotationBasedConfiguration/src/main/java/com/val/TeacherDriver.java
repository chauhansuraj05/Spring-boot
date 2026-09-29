package com.val;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anno.Student;
import com.anno.StudentConfig;

public class TeacherDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(TeacherConfig.class);
		Teacher t = (Teacher)con.getBean("teacher");
		
		System.out.println(t);
		t.display();

	}

}
