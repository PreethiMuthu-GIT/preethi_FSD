package com.flowcontrol;

import java.util.Scanner;

public class Profit_loss {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Cost Price: ");
	int costPrice = sc.nextInt();
	System.out.println("Enter the Selling Price: ");
	int sellPrice = sc.nextInt();
	int profit, loss;
	//if selling price is more than costprice then there is profit..
	//or else there is loss
	if(sellPrice > costPrice) {
		profit = sellPrice - costPrice;
		System.out.println("Profit is: "+profit);
	}
	else if(sellPrice < costPrice) {
		loss = costPrice - sellPrice;
		System.out.println("Loss is: "+loss);
	}
	else {
		System.out.println("no profit...no loss..");
	}
}
}
