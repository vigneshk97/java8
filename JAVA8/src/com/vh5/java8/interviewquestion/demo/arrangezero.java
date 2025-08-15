package com.vh5.java8.interviewquestion.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrangezero {

	public static void main(String[] args) {
		
		int[] a = {1,0,0,5,3,0,0};
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		//System.out.println(list);
		List<Integer> list1 = list.stream().filter(x->x==0).collect(Collectors.toList());
		List<Integer> list2 = list.stream().filter(x->x!=0).collect(Collectors.toList());
		
		List<Integer> finalList = new ArrayList<>();
		finalList.addAll(list1);
		finalList.addAll(list2);
		System.out.println(finalList);
		
		
		
	}
}
