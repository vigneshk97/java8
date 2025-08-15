package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
//  Arrange the number in descending and ascending order
public class descandacs {

	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		Arrays.stream(arr).mapToObj(x-> x).sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		Arrays.stream(arr).sorted().forEach(System.out::println);
	}
}
