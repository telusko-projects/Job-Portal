package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Book;
import com.telusko.service.BookService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/bookApi")
@Tag(name = "BookController",description = "to perform operations on books")
public class BookController {

	@Autowired
	private BookService bookService;

	
	@Operation(summary = "delete operation on books",
			description = "it is used to delete book via id")
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
		return new ResponseEntity<>(bookService.deleteBook(id), HttpStatus.OK);
}
	
	@Operation(summary = "add operation on books",
			description = "it is used to add book")
	@PostMapping("/addBook")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookService.addBook(book),HttpStatus.CREATED);
	}
	
	
	
	@Operation(summary = "update on books",
			description = "it is used to update books via id")
	@PutMapping("/updateBook/{id}")
public ResponseEntity<Book>	updateBook(@PathVariable int id,@RequestBody Book newBook){
		return new ResponseEntity<Book>(bookService.updateBook(id,newBook),HttpStatus.CREATED);
	}
	
	
	@Operation(summary = "get operation on books",
			description = "it is used to get book via id")
	@GetMapping("/getBook/{id}")
public ResponseEntity<Book>	updateBook(@PathVariable int id){
		return new ResponseEntity<Book>(bookService.findBook(id),HttpStatus.OK);
	}
	
	
}
