package com.sristi.basics.oopsdemo;

public class Book {
	/*
	 * Write a program to print the book details. class Book ∙Has properties s
	 * title, author, price.category ∙Has parameterized constructor ∙Has method as
	 * void getDetails() to print the details of the book ∙checkBookType()->
	 * ∙If(price is greater than 500 then premium books, else standard book class
	 * Main
	 */
	String title;
	String author;
	double price;
	String category;
	
	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	void getDetails() {
		System.out.println("Title ="+title);
		System.out.println("Author ="+author);
		System.out.println("Price ="+price);
		System.out.println("Category ="+category);
	}
	void checkBookType(double price) {
		if(price>500)
			System.out.println("Premium book");
		else
			System.out.println("Standard book");
	}

}
