package com.sristi.basics.scanner.project;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int greatest=x>y && x>z ? x : y>z ? y: z;
	  System.out.println(greatest+" is greater ");
	  sc.close();
	}
}
