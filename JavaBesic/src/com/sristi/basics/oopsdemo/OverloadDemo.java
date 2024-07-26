package com.sristi.basics.oopsdemo;

public class OverloadDemo {
	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.area(10);
		shape.area(10.5f);
		int rect=shape.area(10,20);
		System.out.println("Rectange "+rect);
		System.out.println("Tri "+shape.area(10,20.5f));
	}
}
