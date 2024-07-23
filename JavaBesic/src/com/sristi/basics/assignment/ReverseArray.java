package com.sristi.basics.assignment;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr= {22,13,44,5,12,45,15};
		System.out.println("Before reverse");
		print(arr);
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println("After reverse");
		print(arr);
		
	}

	private static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
