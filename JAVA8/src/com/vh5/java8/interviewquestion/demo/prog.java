package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class prog {

	public static void main(String[] args) {
		 String s = "vigneshkalynaraman";
		 
		 Map<String, Long> vowelCount = Arrays.stream(s.split(""))
		            .filter(ch -> "aeiou".contains(ch)) // filter only vowels
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));		
		 System.out.println(vowelCount);
	}
}
