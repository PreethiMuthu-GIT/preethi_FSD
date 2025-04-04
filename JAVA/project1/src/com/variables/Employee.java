package com.variables;

  
public class Employee {
	  int empid = 2001;
	  static String empname = "Preethi";
	  double empsalary = 5000.99;
	  int empatmpin = 3672;

	public static void main(String[] args) {
		
		Employee em = new Employee();
		String empadd = "Tamilnadu";
		
		System.out.println("********Employee details*********");
		System.out.println("\tEmployee id is:"+em.empid);
		System.out.println("\tEmployee name is:"+Employee.empname);
		System.out.println("\tEmployee Salary is:"+em.empsalary);
		System.out.println("\tEmployee atm pin is:"+em.empatmpin);
		System.out.println("\tEmployee address:"+empadd);
		
		
		
	}
	
	
	
	

}
