package com.sristi.basics.assignment;

public class ReversePattern {
	public static void main(String[] args) {
		for(int i=4;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
