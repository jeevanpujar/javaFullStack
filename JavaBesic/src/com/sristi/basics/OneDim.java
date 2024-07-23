package com.sristi.basics;

import java.util.Iterator;

public class OneDim {
	public static void main(String[] args) {
		int num[]=new int[4];
		System.out.println(num.length);
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		int result=0;
		for(int i=0;i<num.length;i++) {
			int val=num[i];
			result+=val;
			System.out.println(val);
		}
		System.out.println(result);
		int squar=0;
		for (int val : num) {
			System.out.println(val);
			squar+=(int) Math.pow(val, 2);
		}
		System.out.println(squar);
		
	}

}
