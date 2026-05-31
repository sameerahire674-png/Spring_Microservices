package com.sam;

import org.springframework.stereotype.Component;

@Component // tell the ioc and to create the bean for this class 
           // to create an object and print the msg form config class.
public class Student {
	public Student() {
		System.out.println("Hello I am sameer Ahire and i am learning the spring bboot concept and currently i started the Spring Annotation");
	}

}
