package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class eachWordsOccur {
public static void main(String[] args) {
	String a = "Vigneshkalyanaraman";
	//String a = "I am a Leaning java java 8 Stream API ";
 Map<String, Long> w = Arrays.stream(a.split(""))
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 System.out.println("given a word find the occurance of each words"+w);
 
 Map<String, Long> q = Arrays.stream(a.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
 System.out.println("given a word find the occurance of each words"+q);
}
}
