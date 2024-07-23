package com.sristi.basics.scanner.project;

import java.util.Scanner;

public class NameList {
	public static void main(String[] args) {
		String[] name=new String[]{"jeevan","Pramod","Prakash","satish"};
		System.out.println("Enter name to register");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		for (int i=0;i<name.length;i++) {
			if(name[i].equalsIgnoreCase(input)) {
				System.out.println(input+" Name is not unique");
				break;
			}else {
				System.out.println(input+" You are registered");
				break;
			}
		}
		sc.close();
		
	}
	

}
