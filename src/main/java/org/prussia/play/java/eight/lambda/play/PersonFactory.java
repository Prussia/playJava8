package org.prussia.play.java.eight.lambda.play;

public interface PersonFactory<P extends Person> {
	P create(String firstName, String lastName);
}
