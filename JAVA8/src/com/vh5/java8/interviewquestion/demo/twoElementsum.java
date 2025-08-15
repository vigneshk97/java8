package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class twoElementsum {

	public static void main(String[] args) {
		
		int[] a = {7,8,6,4,3,2,2}; 
		
	int aaa=Arrays.stream(a).boxed().collect(Collectors.toList()).stream().limit(2).reduce(1,(c,b) -> c*b);
		System.out.println(aaa);
	}
}
