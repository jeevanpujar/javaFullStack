package com.sristi.basics.assignment;

import java.util.Arrays;

public class CountDublicate {
	public static void main(String[] args) {
		int[] arr={10,20,30,40,20,30,40,50};
		Arrays.sort(arr);
		int count=0;
		for (int i=0;i<arr.length;i=count) {
			int c=1;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					c++;
			}
			System.out.println(arr[i]+" repeated "+c+" times");
			count+=c;
		}
	}
}
