package com.sristi.basics;

public class Greater {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		if(x>y && x>z) {
			System.out.println(x);
		}else if(y>z) {
			System.out.println(y);
		}else {
			System.out.println(z);
		}
	  int a=x>y && x>z ? x :y>z? y : z;
	  System.out.println(a+" is greater ");
	  
	}

}
