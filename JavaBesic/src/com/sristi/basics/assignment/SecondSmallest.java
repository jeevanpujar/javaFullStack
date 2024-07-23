package com.sristi.basics.assignment;

import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] num= {20,10,60,5,50,70,30,25,74};
		System.out.println("Using Arrays.sort method");
		Arrays.sort(num);
		System.out.println("second Smallaest number ="+num[1]);
		System.out.println("without sort method");
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp =num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("second Smallaest number ="+num[1]);
	}

}
