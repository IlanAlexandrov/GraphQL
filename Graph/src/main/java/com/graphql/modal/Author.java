package com.graphql.modal;

import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {

	public static List<Author> getAuthors() {
		return List.of(
			new Author(1, "Author 1"),
			new Author(2, "Author 2"),
			new Author(3, "Author 3"),
			new Author(4, "Author 4")
		);
	}

	public static Optional<Author> getAuthorById(Integer id) {
		return getAuthors().stream().filter(book -> book.id().equals(id)).findFirst();
	}
}
