package com.flowcontrol;

import java.util.Scanner;

public class Find_roots {
  public static void main(String[] args) {
	double a=2.3, b=4, c=5.6 ;
	double root1,root2;
	double discriminant = (b*b)-4*a*c;
	
	if (discriminant > 0) {
		root1 = (-b + Math.sqrt(discriminant) / (2*a));
		root2 = (-b - Math.sqrt(discriminant) / (2*a));
		
		System.out.printf("root1 = %.2f",root1);
		System.out.printf("\nroot2 = %.2f",root2);
	}
	else if(discriminant == 0) {
		root1 = (-b / (2*a));
		root2 = (-b / (2*a));
		
		System.out.printf("root1 = %.2f",root1);
		System.out.printf("\nroot2 = %.2f",root2);
	}
	else {
		double real = -b / (2*a);
		double imaginary = Math.sqrt(-discriminant) /(2*a);
		
		System.out.printf("root1 = %.2f + %.2fi",real,imaginary);
		System.out.printf("\nroot2 = %.2f - %.2fi",real,imaginary);
	}
	
}
}
