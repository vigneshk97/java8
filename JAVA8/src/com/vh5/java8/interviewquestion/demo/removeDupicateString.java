package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;

public class removeDupicateString {

	public static void main(String[] args) {
		
		String a = "badsaffmdffegf";
		
		Arrays.stream(a.split("")).distinct().forEach(System.out::print);
	}
}
