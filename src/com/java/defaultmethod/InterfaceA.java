package com.java.defaultmethod;

public interface InterfaceA {

	default void display (String message) {
		
		System.out.println("Welcome in default method of interface " + message);
	}
}
