package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;

public class repeatchar {

	public static void main(String[] args) {
		String s ="Hello World";
		
		s.chars().mapToObj(x->(char)x);
	}
}
