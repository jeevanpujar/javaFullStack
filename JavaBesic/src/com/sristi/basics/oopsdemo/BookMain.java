package com.sristi.basics.oopsdemo;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book[] books=new Book[2];
		System.out.println("Enetr the book details");
		for (int i=0;i<books.length;i++) {
			books[i]=new Book(sc.next(),sc.next(),sc.nextDouble(),sc.next());
		}
		System.out.println();
		for (int i=0;i<books.length;i++) {
			books[i].getDetails();
			System.out.println("====================");
			books[i].checkBookType(books[i].price);
		}
	}

}
