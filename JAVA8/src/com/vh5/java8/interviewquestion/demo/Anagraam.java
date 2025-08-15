package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Anagraam {

	public static void main(String[] args) {
		
		String[] a = {"pan","nap","team","meat","tree","pat","tap"};
		
		List<String> list = Arrays.asList(a);
		System.out.println(list);
		Collection<List<String>> b =list.stream().collect(Collectors.groupingBy(x-> Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList()))).values();
		System.out.println(b);
		
	}
}
