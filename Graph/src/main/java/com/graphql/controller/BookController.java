package com.graphql.controller;

import com.graphql.modal.Author;
import com.graphql.modal.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

	@QueryMapping
	public List<Book> books() {
		return Book.getBooks();
	}

	@QueryMapping
	public Optional<Book> bookById(@Argument Integer id) {
		return Book.getBookById(id);
	}

	@SchemaMapping
	public Optional<Author> author(Book book) {
		return Author.getAuthorById(book.authorId());
	}
}
