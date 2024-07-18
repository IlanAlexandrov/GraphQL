package com.graphql.modal;

import java.util.List;

public record Book(Integer id, String name, Integer pageCount) {

	public static List<Book> getBooks() {
		return List.of(
				new Book(1, "Book 1", 100),
				new Book(2, "Book 2", 200),
				new Book(3, "Book 3", 300),
				new Book(4, "Book 4", 400)
		);
	}
}
