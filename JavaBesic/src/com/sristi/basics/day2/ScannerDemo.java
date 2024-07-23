package com.sristi.basics.day2;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("enter value");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.err.println("Name="+name);
		int userId=sc.nextInt();
		System.out.println("UserId="+userId);
		sc.nextLine();
		String city=sc.nextLine();
		System.out.println("City="+city);
		double salry=sc.nextDouble();
		
		System.out.println("Salary"+salry);
		sc.close();
	}

}
