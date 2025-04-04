package com.constructor;

public class Employee {
	//with constructor
	 private Employee() {
		 String empname = "preethi";
		 int age = 20;
		 System.out.println("employee name:"+empname);
		 System.out.println("employee age:"+age);
	 }
	 public Employee(String add, float salary) {
		 System.out.println("employee address:"+add);
		 System.out.println("employee salary:"+salary);
			 
	 }
	 
 public static void main(String[] args) {
	 Employee em = new Employee();
	 Employee em1 = new Employee("tamilnadu",7000.99f);
	
}
}
