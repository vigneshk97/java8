package com.vh5.java8.interviewquestion.demo;

import java.util.stream.IntStream;

public class firstandLastElement {

	public static void main(String[] args) {
		
		int[] a = {2,4,6,5,4,3};
		
		IntStream.range(0, a.length/2).map(x-> a[x]*a[a.length-x-1]).forEach(System.out::println);
		
	}
}
