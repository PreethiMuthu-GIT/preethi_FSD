package com.iterativeStatements;

import java.util.Scanner;

public class SumOfNaturalNumbers {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a positive integer n:");
	  int n = sc.nextInt();
	  int sum = 0;
	  for(int i=1; i<=n; i++) {
		  sum=sum+i;
	  }
	  System.out.println("Sum of 1 to n natural numbers: "+sum);
	  
}
}
