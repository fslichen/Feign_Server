package evolution.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
}
