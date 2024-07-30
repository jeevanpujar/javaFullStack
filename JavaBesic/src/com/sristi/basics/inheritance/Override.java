package com.sristi.basics.inheritance;

import java.util.Scanner;

public class Override {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the program language");
		String str=sc.next();
		TeamLead t = null;
		if(str.equalsIgnoreCase("java")) {
			t=new Group1();
			t.doProject();
		}else if(str.equalsIgnoreCase("dotnet")){
			t=new Group2();
			t.doProject();
		}
	}

}
