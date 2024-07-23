package com.sristi.basics.day2;

public class CmdDemo {
	public static void main(String[] args) {
		String userName=args[0];
		System.out.println("userName="+userName);
		int userId=Integer.parseInt(args[1]);
		String sal=args[2];
		double salary=Double.parseDouble(sal);
		
		System.out.println("userId="+userId);
		System.out.println("salary="+salary);
	}

}
