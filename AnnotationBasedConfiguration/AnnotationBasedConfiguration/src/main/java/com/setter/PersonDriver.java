package com.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.val.Teacher;
import com.val.TeacherConfig;

public class PersonDriver {
public static void main(String[] args) {
	ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(PersonConfig.class);
	Person p = (Person)con.getBean("person");
	System.out.println(p);
	p.display();
}
}
