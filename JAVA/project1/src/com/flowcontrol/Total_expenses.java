package com.flowcontrol;

import java.util.Scanner;

public class Total_expenses {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the Purchased Quantity:");
	int quant = sc.nextInt();
	System.out.print("Enter the Amount Per Item:");
	float amount = sc.nextFloat();
	float expense;
	if (quant > 100) {
		expense = quant * amount;
		expense = expense - (expense * 0.1f);
	}
	else {
		expense = quant * amount;
	}
	System.out.println("Total Expenses is:"+expense);
	
}
}
