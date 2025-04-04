package com.iterativeStatements;

import java.util.Scanner;

public class FibonacciSequence {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a positive integer:");
	int n = sc.nextInt();
	
	int f_term = 0;
	int s_term = 1;
	System.out.print("fibonacci sequence: " + f_term + " "+s_term +" ");
	for(int i = 3; i<=n; i++ ) {
		int n_term = f_term + s_term;
		System.out.print(n_term+" ");
		f_term = s_term;
		s_term = n_term;
	}
	
}
}
