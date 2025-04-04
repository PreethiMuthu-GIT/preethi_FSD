package com.command;

public class task {
	
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
		float num2 = Float.parseFloat(args[1]);
		byte num3 = Byte.parseByte(args[2]);
		short num4 = Short.parseShort(args[3]);
		long num5 = Long.parseLong(args[4]);
		double num6 = Double.parseDouble(args[5]);
		boolean num7 = Boolean.parseBoolean(args[6]);
		
		System.out.println("integer is:"+num1);
		System.out.println("float is:"+num2);
		System.out.println("byte is:"+num3);
		System.out.println("short is:"+num4);
		System.out.println("long is:"+num5);
		System.out.println("double is:"+num6);
		System.out.println("boolean is:"+num7);
		
		
		
	}

}
