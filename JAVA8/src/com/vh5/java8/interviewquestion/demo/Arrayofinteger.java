package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Arrayofinteger {

	public static void main(String[] args) {
		
		int[] arr = {0,2,3,4,10,12,14,15,16, 20, 21,28,30,35,50,51,55,60,61,66};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		//System.out.println(list);
		
		Map<Integer,List<Integer>> a = list.stream().collect(Collectors.groupingBy(x-> x/10*10 ,LinkedHashMap::new,Collectors.toList()));
		System.out.println(a);
	}
}
