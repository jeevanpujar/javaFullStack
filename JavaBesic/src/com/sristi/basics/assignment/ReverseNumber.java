package com.sristi.basics.assignment;

public class ReverseNumber {
	public static void main(String[] args) {
		int n=125;
		int reversNum = 0;
		System.out.println("original number="+n);
		while(n>0) {
			int rem=n%10;
			n=n/10;
			reversNum=reversNum *10 +rem;
		}
		System.out.println("Reverse Number ="+reversNum);
	}

}
