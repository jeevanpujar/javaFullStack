package com.sristi.basics.assignment;

public class SumAvgArray {
	public static void main(String[] args) {
		int[] num= {20,10,60,50,70,30,25,74};
		int sum=0;
		
		for (int i : num) {
			sum +=i;
		}
		System.out.println("sum of array="+sum);
		System.out.println("Avg of array="+(float)sum/num.length);
	}

}
