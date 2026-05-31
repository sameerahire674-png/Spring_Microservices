package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Student s1=(Student)context.getBean("s1");
		s1.display();
		Student s2=(Student)context.getBean("s2");
		s2.display();
		Student s3=(Student)context.getBean("s3");
		s3.display();
	}

}
