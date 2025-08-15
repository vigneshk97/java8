package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class programcount {

	public static void main(String[] args) {
		String s = "lekhashreevignesh";
		
	 Map<String, Long> ans =  Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	 System.out.println("given a word find the occurance of each character"+ ans);
	}
}
