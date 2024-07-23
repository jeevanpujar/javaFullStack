package com.sristi.basics.assignment;

public class Sort {
	public static void main(String[] args) {
		int[] num= {20,13,27,55,43,33,28};
		System.out.println("before sort");
		print(num);
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("after sort");
		print(num);
	}

	private static void print(int[] num) {
		for (int i : num) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
