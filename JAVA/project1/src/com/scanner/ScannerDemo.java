package com.scanner;

import java.util.Scanner;

public class ScannerDemo{
	
	public static void main(String[] args) {
		
		Scanner sp = new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sp.nextLine();
		
		System.out.println("Enter age:");
		int age = sp.nextInt();
		
		System.out.println("Enter salary:");
		float salary = sp.nextFloat();	
		 
		System.out.println("Enter confirmed Salary:");
		double csalary = sp.nextDouble();
	
		System.out.println(uname+"\n"+age+"\n"+salary+"\n"+csalary);
		
		
		
	}

}
