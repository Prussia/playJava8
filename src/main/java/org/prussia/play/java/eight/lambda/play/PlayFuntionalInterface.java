package org.prussia.play.java.eight.lambda.play;

public class PlayFuntionalInterface {

	public static void main(String[] args) {
//		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
//		Integer converted = converter.convert("123");
//		System.out.println(converted); // 123
		
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);   // 123
	}
}
