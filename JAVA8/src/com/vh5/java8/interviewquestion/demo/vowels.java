package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;

public class vowels {
public static void main(String[] args) {
	
	String a = " I am Learning Stream APi in JAVA java";
	
	 Arrays.stream(a.split(" ")).filter(x-> x.replaceAll("[^aeiouAEIOU]", "").length()==2).forEach(System.out::println);
}
}
