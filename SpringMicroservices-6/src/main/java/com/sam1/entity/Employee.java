package com.sam1.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Employee {
	public int id=101;
	public String name="sameer";

	public Employee() {
		System.out.println("This @Bean Annotation is used for the creatre the customized object but it will handed the IOC");
	}
}
