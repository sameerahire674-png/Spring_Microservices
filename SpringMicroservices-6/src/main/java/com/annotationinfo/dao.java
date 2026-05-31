package com.annotationinfo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class dao {
	public void getprocess() {
		System.out.println("This @Repository annotation is used for the write to the database logic.");
		System.out.println("Order Process Is succesful..");
	}

}
