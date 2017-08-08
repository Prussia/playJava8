package org.prussia.play.java.eight.lambda.play;

import java.util.Objects;
import java.util.function.Predicate;

public class PlayPredicate {

	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length() > 0;
		
		System.out.println(predicate.test("foo"));              // true
		System.out.println(predicate.negate().test("foo"));     // false

		Predicate<Object> nonNull = Objects::nonNull;
		System.out.println(nonNull.test(new Object()));
		
		Predicate<Object> isNull = Objects::isNull;
		System.out.println(isNull.test(null));

		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isContain = (s)-> s.contains("Prussia");
		System.out.println(isContain.test("Prussia"));
		System.out.println(isEmpty.test("Prussia"));
	}

}
