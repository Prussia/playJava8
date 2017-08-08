package org.prussia.play.java.eight.lambda.play;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayLambda {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		    	System.out.println("a = " + a);
		    	System.out.println("b = " + b);
		    	int result = b.compareTo(a);
		    	System.out.println(result);
		        return result;
		    }
		});
		
		Collections.sort(names, (String a, String b) -> {
			System.out.println("a = " + a);
	    	System.out.println("b = " + b);
			int result = b.compareTo(a);
			System.out.println(result);
		    return result;
		});
	}

}
