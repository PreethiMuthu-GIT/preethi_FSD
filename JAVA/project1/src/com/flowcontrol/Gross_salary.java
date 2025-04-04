package com.flowcontrol;

import java.util.Scanner;

public class Gross_salary {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Basic Salary:");
	int salary = sc.nextInt();
	float hra, da;
	
	if(salary <=10000) {
		hra = salary * 0.2f;
		da = salary  * 0.8f;
	}
	else if(salary <= 20000) {
		hra = salary *0.25f;
		da = salary * 0.9f;
	}
	else {
		hra = salary * 0.3f;
		da = salary * 0.95f;
	}
	System.out.println("hra is: "+hra);
	System.out.println("da is: "+da);
	float total = salary+hra+da;
	System.out.println("Gross Salary: "+total);
			
}
}
