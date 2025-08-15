package com.vh5.java8.interviewquestion.demo;

public class logic {

	public static void main(String[] args) {
		print(null);
	}
	
	private static void print(String s) {
		System.out.println("String");	
    }
	
	private static void print(Object o) {
		System.out.println("Object");
	}
}
