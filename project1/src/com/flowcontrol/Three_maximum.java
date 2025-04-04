package com.flowcontrol;

import java.util.Scanner;

public class Three_maximum {
  public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number 1:");
	int num1 = sc.nextInt();
	System.out.println("Enter the number 2:");
	int num2 = sc.nextInt();
	System.out.println("Enter the number 3:");
	int num3 = sc.nextInt();
	
	if(num1>num2 && num1>num3) {
		System.out.println("Maximum number is: "+num1);
	}
	else if(num2>num1 && num2>num3) {
		System.out.println("Maximum number is: "+num2);
	}
	else {
		System.out.println("Maximum number is: "+num3);
	}
}
}
