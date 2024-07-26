package com.sristi.basics.oopsdemo;

public class VarArgDemo {
	void calSum(String name,int... nums ) {
		System.out.println("Name "+name);
		int sum=0;
		for (int i : nums) {
			sum+=i;
		}
		System.out.println("Sum :"+sum);
		
	}
	void calSum(String name) {
		System.out.println("Name "+name);
	}
	public static void main(String[] args) {
		VarArgDemo v=new VarArgDemo();
		v.calSum("Jeevan", 1,2,3,4,5);
		v.calSum("Pramod");
		v.calSum("Prakash", 3,4);
	}

}
