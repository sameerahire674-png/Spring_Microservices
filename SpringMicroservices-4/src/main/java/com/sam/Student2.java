package com.sam;

import org.springframework.stereotype.Component;

@Component
public class Student2 {
	public Student2() {
		String arr[]= {"Sameer","Vijay","kailas","Kalpesh","Shubham"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
