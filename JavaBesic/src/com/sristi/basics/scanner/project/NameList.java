package com.sristi.basics.scanner.project;

import java.util.Scanner;

public class NameList {
	public static void main(String[] args) {
		String[] name=new String[]{"jeevan","Pramod","Prakash","satish"};
		System.out.println("Enter name to register");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		boolean flag=true;
		for (int i=0;i<name.length;i++) {
			if(name[i].equalsIgnoreCase(input)) {
				flag=false;
				break;
			}else {
				flag=true;
			}
		}
		if(!flag) {
			System.out.println(input+" Name is not unique");
		}else {
			System.out.println(input+" You are registered");
		}
		sc.close();
		
	}
	

}
