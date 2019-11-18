package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(1, "Mastering Spring", "JMK"));

		return bookList;
	}
}
