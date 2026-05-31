package com.demo;

import java.util.Arrays;
import java.util.List;

public class Student {
	public Student() {
		
	}
	private int id;
	private String name;
	private int age;
	private String address;
	private String[] subject;
	private List<Integer> marks;
	
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	private String[] futurerole;
	
	public void setFuturerole(String[] futurerole) {
		this.futurerole = futurerole;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Student Information:");
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Subjects :"+Arrays.toString(subject));
		System.out.print("Marks:");
		marks.forEach(i->System.out.print(i+" "));
		System.out.println("");
		System.out.println("Future Role:"+Arrays.toString(futurerole));
		System.out.println("=========================================================");
	}

}
