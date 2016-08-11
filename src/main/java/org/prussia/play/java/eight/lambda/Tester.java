package org.prussia.play.java.eight.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Tester {
	final static String SALUTATION = "Hello";

	public static void main(String args[]) {
		test4Interface();
		test4Collection1();
		test4Collection2();
		test4FunctionInterface();
	}

	interface GreetingService {
		void sayMessage(String message);
	}
	
	public static void test4Interface(){
		GreetingService greetingService = message -> System.out.println(SALUTATION + " " + message);
		greetingService.sayMessage("Test");
	}
	
	public static void test4Collection1(){
		Author[] authors = Book.class.getAnnotationsByType(Author.class);
		List<Author> authorList = Arrays.asList(authors);
		authorList.stream().forEach(a -> {
			System.out.println(a.name());
		});
	}
	public static void test4Collection2(){
		List<String> names = new ArrayList<>();
		names.add("1");
		names.add("2");
		names.add("3");
		names.forEach(System.out::println);
	}
	
	public static void test4FunctionInterface(){
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("Print all numbers:");
		list.forEach(System.out::print);
		eval(list, n->true);
		eval(list, n->n%2==0);
		eval(list, n->n>5);
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		System.out.println("");
		for(Integer n: list){
			if(predicate.test(n)){
				System.out.print(n);
			}
		}
	}
}
