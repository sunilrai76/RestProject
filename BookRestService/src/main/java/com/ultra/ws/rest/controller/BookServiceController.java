package com.ultra.ws.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ultra.ws.rest.domain.Book;
/**
 * BookServiceController class
 * @author parth
 *
 */
@RestController
public class BookServiceController {

	@RequestMapping("/BookService/books")
	public List<Book> getBooks(){
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("1","Java in Action", "Sunil"));
		books.add(new Book("2","Java in Action1", "Ram"));
		books.add(new Book("3","Java in Action2", "SunRAMil"));
		books.add(new Book("4","Java in Action3", "Sunil"));
		books.add(new Book("5","Java in Action4", "Sunil"));
		books.add(new Book("6","Java in Action5", "Sunil"));
		return books;
	}
}
