package com.iterativeStatements;

import java.util.Scanner;

public class FactorialCalculation {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a positive Integer: ");
	int n = sc.nextInt();
	
	if(n<0) {
		System.out.println("Factorial is not defined for negative numbers.");
	}
	else {
		long fact = 1;
	
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("factorial of "+n+":"+fact);
	}
}
}
