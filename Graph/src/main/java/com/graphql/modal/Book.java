package com.graphql.modal;

import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {

	public static List<Book> getBooks() {
		return List.of(
				new Book(1, "Book 1", 100,1),
				new Book(2, "Book 2", 200,2),
				new Book(3, "Book 3", 300,3),
				new Book(4, "Book 4", 400,1)
		);
	}

	public static Optional<Book> getBookById(Integer id) {
		return getBooks().stream().filter(book -> book.id().equals(id)).findFirst();
	}
}
