package com.bean;

import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.has.Mobile;
import com.has.PersonConfig;

public class StudentDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student s = (Student)con.getBean("createObject");
		System.out.println(s);
		System.out.println(s.id);
		System.out.println(s.name);
		
		ArrayList<Integer> ar=(ArrayList<Integer>)con.getBean("getObject");
		System.out.println(ar);
//		Student s2=con.getBean(Student.class);
//		System.out.println(s2);

	}

}
