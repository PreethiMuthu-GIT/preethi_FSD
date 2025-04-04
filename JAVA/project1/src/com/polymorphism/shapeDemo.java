package com.polymorphism;

public class shapeDemo {
	public void Area(double radius) {
		System.out.println("Area of Circle:"+((Math.PI*(radius*radius))));
	}
	public void Area(int lenght,int width) {
		System.out.println("Area of rectangle:"+(lenght*width));
	}
	public void Area(int base, float height) {
		System.out.println("Areaq of Triangle:"+((0.5)*height*base));
	}
	public void Area(int side) {
		System.out.println("Area of Square:"+(side*side));
		
	}
	
     public static void main(String[] args) {
		shapeDemo sd = new shapeDemo();
		sd.Area(0.5);
		sd.Area(8);
		sd.Area(6, 6);
		sd.Area(6, 5.5f);
	}
}
