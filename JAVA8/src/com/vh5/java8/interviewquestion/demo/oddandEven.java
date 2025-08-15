package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class oddandEven {
	public static void main(String[] args) {
		
	int arr[] = {1,2,3,4,5,6,7,8,9};
	
	List<Integer> a =Arrays.stream(arr).boxed().collect(Collectors.toList());
	
	List<List<Integer>> aa= a.stream().collect(Collectors.groupingBy(x-> x%2==0,Collectors.toList()))
			.entrySet().stream().map(z-> z.getValue()).collect(Collectors.toList());
	 System.out.println(aa);
	}
}
