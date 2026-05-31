package com.sam1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sam1.entity.Employee;


@Configuration
@ComponentScan
public class config {
	@Bean     // create the Employee class object and handle the IOC
	//@Primary //it is used for the proiority set first we can print the employee() method then class
	public Employee getemp() {//this is created customized object and it gives the IOC for controll
		Employee emp=new Employee();
		return emp;
	}
	@Bean
	@Primary//set the pro=iority whose the first will be print.
	public Employee getemp2() {
		Employee emp=new Employee();
		System.out.println("Method Called..");
		emp.id=122;
		return emp;
	}

}
