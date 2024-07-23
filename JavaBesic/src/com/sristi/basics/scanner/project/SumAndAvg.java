package com.sristi.basics.scanner.project;

import java.util.Scanner;

public class SumAndAvg {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range of array");
		int r=sc.nextInt();
		System.out.println("Enter the array value");
		int nums[]=new int[r];
		int sum=0;
		for(int i=0;i<r;i++) {
			nums[i]=sc.nextInt();
			sum+=nums[i];
		}
		System.out.println("sum of array="+sum);
		System.out.println("Avg of array="+(float)sum/nums.length);
		sc.close();
	}


}
