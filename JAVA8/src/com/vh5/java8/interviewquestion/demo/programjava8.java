package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Comparator;

public class programjava8 {

	public static void main(String[] args) {
		 
		String s= "i am  learning Stream APi in Java ";
		
		String ans =Arrays.stream(s.split(" "))
				.max(Comparator.comparing(String::length))
				.get();
		System.out.println(ans);
		
	}
}
