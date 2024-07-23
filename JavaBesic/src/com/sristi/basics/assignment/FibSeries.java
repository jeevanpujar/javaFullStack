package com.sristi.basics.assignment;

public class FibSeries {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int len=10;
		int sum=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<len;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
		}
		
	}

}