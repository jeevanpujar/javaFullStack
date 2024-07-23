package com.sristi.basics.assignment;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int len=lenOfnum(num);
		int armStrongNum=armStrong(num,len);
		if(num==armStrongNum) {
			System.out.println(num+" is armStrong number");
		}else {
			System.out.println(num+" is not armStrong number");
		}
	
	}

	private static int armStrong(int num, int len) {
		int armNum=0;
		while(num>0) {
			int r=num%10;
			num=num/10;
			armNum +=(int) Math.pow(r, len);
		}
		return armNum;
	}

	private static int lenOfnum(int num) {
		int l=0;
		while(num>0) {
			num=num/10;
			l++;		
	}
	return l;	
	}

}
