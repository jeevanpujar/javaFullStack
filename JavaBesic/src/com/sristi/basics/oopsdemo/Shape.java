package com.sristi.basics.oopsdemo;

public class Shape {
	void area(int x) {
		System.out.println("Squar :"+(x*x));
	}
	void area(float x) {
		System.out.println("Cercle "+(Math.PI*x*x));
	}
	int area(int x,int y) {
		return x*y;
	
	}
	double area(int x,float y) {
		return x*y*0.5;
	
	}

}
