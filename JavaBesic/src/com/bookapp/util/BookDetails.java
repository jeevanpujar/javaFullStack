package com.bookapp.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> getBooks(){
		List<Book> books = Arrays.asList(new Book("ABC", 11, 100, "JEEVAN", "PROGRAMING", LocalDate.of(2024, 1, 10)),
				new Book("DEF", 22, 200, "PRAKASH", "SPORTS", LocalDate.of(2023, 1, 10)),
				new Book("GHI", 33, 300, "PRAMOD", "ENGLISH", LocalDate.of(2024, 1, 10)),
				new Book("JKL", 44, 400, "SUBHADRA", "KANNADA", LocalDate.of(2024, 1, 10)),
				new Book("MNO", 55, 500, "YANKAPPA", "LANGUAGE",LocalDate.of(2021, 1, 10)),
				new Book("PQR", 66, 600, "MUTTU", "STORE", LocalDate.of(2022, 1, 10)));
		          return books;

	}

}
