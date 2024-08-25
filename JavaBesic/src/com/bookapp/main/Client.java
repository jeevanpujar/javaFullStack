package com.bookapp.main;

import java.util.List;
import java.util.Scanner;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;

public class Client {
	public static void main(String[] args) throws BookNotFoundException {
		Scanner sc=new Scanner(System.in);
		BookServiceImpl bookService = new BookServiceImpl();
		System.out.println("Enter your choice");
		System.out.println("1.All book details \n"
				+ "2.Book by authour \n"
				+ "3.Search by Category\n"
				+ "4.Search by less price\n"
				+ "5. search by Authore and Category\n"
				+ "6.search by Id\n"
				+ "7.seaarch by year");
		int option=sc.nextInt();
		List<Book> books=null;
		switch (option) {
		case 1: 
			System.out.println("All book Details ");
			books = bookService.getAll();
			for (Book book : books) {
				System.out.println(book);
			}
			break;
		case 2:
			System.out.println("Enter the book author name");
			try {
				books=bookService.getByAuthorContains(sc.next());
				for (Book book : books) {
					System.out.println(book);
				}
			} catch (BookNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter the book Category");
			try {
				books=bookService.getByCategory(sc.next());
				for (Book book : books) {
					System.out.println(book);
				}
			} catch (BookNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 4: 
			System.out.println("Enter the book price");
			try {
				books=bookService.getByPriceLessThan(sc.nextDouble());
				for (Book book : books) {
					System.out.println(book);
				}
			} catch (BookNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 5:
			System.out.println("Enter the book Authore and Category");
			try {
				books=bookService.getByAuthorContainsAndCategory(sc.next(), sc.next());
				for (Book book : books) {
					System.out.println(book);
				}
			} catch (BookNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 6:
			System.out.println("Enter the bookId");
			try {
				Book book = bookService.getById(sc.nextInt());
				System.out.println(book);
			} catch (BookNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 7:
			System.out.println("Enter the book published year");
			try {
				books=bookService.getByDatePublished(sc.nextInt());
				for (Book book : books) {
					System.out.println(book);
				}
			} catch (BookNotFoundException e) {
				e.printStackTrace();
			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}

}
