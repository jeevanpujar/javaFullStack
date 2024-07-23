package com.sristi.basics.scanner.project;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the renge of array");
		int r=sc.nextInt();
		System.out.println("Enter the value ");
		int[] nums=new int[r];
		double[] squareRoot=new double[r];
		for(int i=0;i<r;i++) {
			nums[i]=sc.nextInt();
			System.out.println(nums[i]);
			squareRoot[i]=Math.sqrt(nums[i]);
			System.out.println(nums[i]+" SquareRoot is "+squareRoot[i]);
		}
		sc.close();
	}

}
