package org.prussia.play.java.eight.lambda;

public interface Vehicle {
	default void print() {
		System.out.println("");
		System.out.println("I am a vehicle!");
	}

	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}
