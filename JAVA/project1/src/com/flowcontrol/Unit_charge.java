package com.flowcontrol;

import java.util.Scanner;

public class Unit_charge {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Electricity Unit:");
		int unit = input.nextInt();
		float amount;
		if(unit <= 50) {
			 amount = unit*(0.50f);
		}
		else if(unit <= 150) {
			 amount = unit*(0.75f);
		}
		else if(unit <=250) {
			 amount = unit*(1.20f);
		}
		else {
			 amount = unit*(1.50f);
		}
		System.out.println("amount "+amount);
		float surcharge = amount * 0.20f;
		float billAmount = amount + surcharge;
		System.out.println("Total Electricity Bill: "+billAmount);
		
	}
}
