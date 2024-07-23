package com.sristi.basics.scanner.project;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[] userNames=new String[]{"jeevan","Pramod","Prakash","satish"};
		System.out.println("Enter username to login");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		for (int i=0;i<userNames.length;i++) {
			if(userNames[i].equalsIgnoreCase(input)) {
				System.out.println("Welcome "+input+" You are logged in successfully");
				break;
			}else {
				System.out.println(input+" Invalid username");
				break;
			}
		}
		sc.close();
		
	}

}
