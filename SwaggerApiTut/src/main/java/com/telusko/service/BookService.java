package com.telusko.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Book;
import com.telusko.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public String deleteBook(int id) {
		bookRepo.deleteById(id);
		return "book deleted";
	}

	public Book addBook(Book book) {
		bookRepo.save(book);
		return book;
	}

	public Book findBook(Integer id) {
		Optional<Book> optional = bookRepo.findById(id);
		if (optional != null) {
			return optional.get();
		}
		return null;

	}


	public Book updateBook(int id, Book newBook) {
		Optional<Book> optional = bookRepo.findById(id);
		if (optional != null) {
			Book oldBook = optional.get();
			oldBook.setBookAuthor(newBook.getBookAuthor());
			oldBook.setBookName(newBook.getBookName());
			oldBook.setBookPrice(newBook.getBookPrice());

			bookRepo.save(oldBook);
			return oldBook;
		}
		return null;

	}
}
