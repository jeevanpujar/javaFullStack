package com.sristi.basics.scanner.project;

import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the vale ");
		int range=sc.nextInt();
		int i=1;
		while(i<=range) {
			if(i % 2==0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();
	}
}
