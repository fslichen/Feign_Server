package evolution.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import evolution.pojo.Book;

@RestController
@RequestMapping("/api/books")
public class AnyController {
	@GetMapping("/find/all")
	public List<Book> findAll() {
		Book book = new Book();
		book.setAuthor("Chen");
		return Arrays.asList(book);
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Book book) {
		System.out.println(String.format("The book %s is created successfully.", book));
	}
	
	@GetMapping("/find/by/{isbn}")
	public Book findByIsbn(@PathVariable("isbn") String isbn) {
		System.out.println(String.format("The ISBN is %s.", isbn));
		Book book = new Book();
		book.setAuthor("Chen");
		return book;
	}
}
