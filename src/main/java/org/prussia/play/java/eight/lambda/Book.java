package org.prussia.play.java.eight.lambda;

import java.util.Arrays;

@Author(name = "Prussia")
@Author(name = "Muuu")
@Author(name = "Straight")
public class Book {

	public static void main(String[] args) {
		Author[] authors = Book.class.getAnnotationsByType(Author.class);
		Arrays.asList(authors).stream().forEach(a -> {
			System.out.println(a.name());
		});
	}

}
