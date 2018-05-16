package com.melrin.java8.optional;

import java.util.Optional;

public class OptinalTest {

	public static void main(String[] args) {
		Optional<String> firstName = Optional.of("Tom");
		System.out.println("First Name is set? "+ firstName.isPresent());
		System.out.println( "First Name: " +  firstName.orElseGet( () -> "[none]"));
		System.out.println(firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
	}
}
