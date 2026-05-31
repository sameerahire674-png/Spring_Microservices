package com.sam;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll No:");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name:");
		String name=sc.nextLine();
		System.out.println("Enter Student Marks:");
		float marks=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Student Email:");
		String email=sc.nextLine();
		System.out.println("Enter Student Address:");
		String address=sc.nextLine();
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFile.class);
		JdbcTemplate jdbctemplate=context.getBean(JdbcTemplate.class);
		String insert_into_query="Insert Into Student2 values(?,?,?,?,?)";
		int count=jdbctemplate.update(insert_into_query, roll, name, marks, email, address);
		if(count>0) {
			System.out.println("Data Inserted Sucessfully..!");
		}else {
			System.out.println("Data Inserted Failed..!");
		}
		
		
	}

}
