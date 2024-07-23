package com.sristi.basics.assignment;

public class Prime {
	public static void main(String[] args) {
		int num=7;
		boolean prime=false;
		for(int i=2; i<num/2 ;i++) {
			if(num >0 && num % i == 0) {
				prime=true;
				break;
			}
		}
		if(!prime) {
			System.out.println("num is prime");
		}else {
			System.out.println("num is not prime");
		}
	}

}
