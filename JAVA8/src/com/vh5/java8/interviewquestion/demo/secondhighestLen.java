package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Comparator;

public class secondhighestLen {

	public static void main(String[] args) {

		String s = "I am Learning stream in Java 8";

		String ans = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1)
				.findFirst().get();
           System.out.println(ans);
           
           int aaa = Arrays.stream(s.split(" ")).map(a->a.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
           System.out.println(aaa);
	}
	
	
}
