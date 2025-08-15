package com.vh5.java8.interviewquestion.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class nonRepeaterCharacher {

	public static void main(String[] args) {
		
		String a = "Hello World";
		
		char y  = a.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap:: new,Collectors.counting()))
		//System.out.println(nn);
		.entrySet().stream().filter(m->m.getValue()>1).map(m->m.getKey()).findFirst().get();
		System.out.println(y);
		
		
	}
}
