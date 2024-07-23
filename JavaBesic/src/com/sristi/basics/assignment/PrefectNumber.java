package com.sristi.basics.assignment;

public class PrefectNumber {
	public static void main(String[] args) {
		int num=496;
		int sum=0;
		for(int i=1;i<=num/2 ;i++) {
			if(num % i == 0) {
			sum+=i;
			}
		}
		if(sum==num) {
			System.out.println(num+" number is perfectNumber");
		}else {
			System.out.println(num+" number not is perfectNumber");
		}
	}
}
