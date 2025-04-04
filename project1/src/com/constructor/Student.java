package com.constructor;

public class Student {
  //without constructor
	String name;
	int age;
	
	public  void assign() {
		name = "preethi";
		age = 20;
	}
	public  void display() {
		System.out.println("Student name:"+name);
		System.out.println("Student age:"+age);
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.assign();
		st.display();
		
		
	}
}
