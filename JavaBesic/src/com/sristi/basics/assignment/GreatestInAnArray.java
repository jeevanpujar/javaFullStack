package com.sristi.basics.assignment;

public class GreatestInAnArray {

	public static void main(String[] args) {
		int[] num= {20,10,60,50,70,30,25,74};
		int val=num[0];
		for(int i=1;i<num.length;i++) {
			val=val>num[i]?val : num[i];
		}
		System.out.println("Greatest In An Array is="+val);

	}

}
