package com.sam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sam1.entity.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		Employee e=context.getBean(Employee.class);
		//Employee e=(Employee)context.getBean("getemp2");//also you can run direct in getBean("getemp method name");
		System.out.println(e.id);
		System.out.println(e.name);
	}

}
