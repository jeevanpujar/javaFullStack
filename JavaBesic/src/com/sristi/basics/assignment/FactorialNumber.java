package com.sristi.basics.assignment;

public class FactorialNumber {
	public static void main(String[] args) {
		int fact=1;
		int val=10;
		for(int i=1;i<=val;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial 10 number is "+fact);
	}

}
