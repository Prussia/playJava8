package org.prussia.play.java.eight.lambda;

public class Car implements Vehicle, FourWheeler {

	public void print() {
		Vehicle.super.print();
	    FourWheeler.super.print();
		System.out.println("");
		System.out.println("I am a car!");
	}

}
