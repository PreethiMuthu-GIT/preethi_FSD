package com.flowcontrol;

import java.util.Scanner;

public class Leap_year {
 public static void main(String[] args) {
//A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400
//A leap year (except a century year) can be identified if it is exactly divisible by 4.
//A century year should be divisible by 4 and 100 both.
//A non-century year should be divisible only by 4.
	 
  Scanner sc = new Scanner(System.in);
  System.out.println("enter a year:");
  int year = sc.nextInt();
//1st condition check- It is century leap year
// 2nd condition check- It is leap year and not century year
  if((year%400 == 0) || (year%4==0 && year%100!=0))  {
	  System.out.println(year+" is a leap year");  
  }
  else {
	  System.out.println(year+" is a non-leap year");
  }
  
}
}
