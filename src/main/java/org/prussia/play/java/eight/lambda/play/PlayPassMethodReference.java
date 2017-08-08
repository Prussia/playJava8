package org.prussia.play.java.eight.lambda.play;

public class PlayPassMethodReference {

	public static void main(String[] args) {
		MyUtil util = new MyUtil();
		Converter<String, String> converter = util::startsWith;
		String converted = converter.convert("Java");
		System.out.println(converted);    // "J"
		
		String middleName = "Bla";
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Prussia" + middleName, "Hu");
		middleName = "Ka";
		System.out.println(person.firstName);
		System.out.println(person.lastName);
	}

}
