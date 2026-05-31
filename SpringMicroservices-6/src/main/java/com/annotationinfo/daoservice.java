package com.annotationinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class daoservice {
	@Autowired
dao d;
public void process() {
	d.getprocess();
	System.out.println("Autowired is used to inject the object in target class");
	System.out.println("The DAO process is sucessful..!");
}
}
