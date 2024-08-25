package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		return BookDetails.getBooks();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> list = getAll();
		List<Book> booklist = new ArrayList<>();
		for (Book book : list) {
			if(book.getAuthor().equalsIgnoreCase(author)) {
				booklist.add(book);
			}
		}
		if(booklist.isEmpty()) {
			throw new BookNotFoundException();
		}else {
			return booklist;
		}
		
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> list = getAll();
		List<Book> booklist = new ArrayList<>();
		for (Book book : list) {
			if(book.getCategory().equalsIgnoreCase(category)) {
				booklist.add(book);
			}
		}
		if(booklist.isEmpty()) {
			throw new BookNotFoundException();
		}else {
			return booklist;
		}
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> list = getAll();
		List<Book> booklist = new ArrayList<>();
		for (Book book : list) {
			if(book.getPrice()<price) {
				booklist.add(book);
			}
		}
		if(booklist.isEmpty()) {
			throw new BookNotFoundException();
		}else {
			return booklist;
		}
	}

	@Override
	public List<Book> getByDatePublished(int year) throws BookNotFoundException {
		 List<Book> allBooks = getAll();
		    List<Book> booksByYear = new ArrayList<>();

		    for (Book book : allBooks) {
		        if (book.getDatePublished().getYear() == year) {
		            booksByYear.add(book);
		        }
		    }

		    if (booksByYear.isEmpty()) {
		        throw new BookNotFoundException("No books found for the year: " + year);
		    }

		    return booksByYear;
		}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> list = getAll();
		List<Book> booklist = new ArrayList<>();
		for (Book book : list) {
			if(book.getAuthor().equalsIgnoreCase(author) && book.getCategory().equalsIgnoreCase(category) ) {
				booklist.add(book);
			}
		}
		if(booklist.isEmpty()) {
			throw new BookNotFoundException();
		}else {
			return booklist;
		}
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> list = getAll();
		Book booklist = null;
		for (Book book : list) {
			if(book.getBookId()==bookId) {
				booklist=book;
			}
		}
		if(booklist==null) {
			throw new BookNotFoundException();
		}else {
			return booklist;
		}
	}

}
