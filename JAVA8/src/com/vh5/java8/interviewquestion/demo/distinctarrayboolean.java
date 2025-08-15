package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctarrayboolean {

	public static void main(String[] args) {
		
		int[] a = {1,4,9,0,5,3};
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		boolean li =list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).values().stream().noneMatch(x->x>1);
		System.out.println(li);
		
	}
}
