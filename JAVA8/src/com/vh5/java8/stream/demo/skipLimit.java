package com.vh5.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class skipLimit {

	public static void main(String[] args) {
		
		List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		         a.stream()
		         .filter(x -> x% 2 == 0)
				.skip(1)
				.limit(7)
				.forEach(System.out::println);
				//.collect(Collectors.toList());
		
		//System.out.println("aaa...:"+ a);
	}
}
