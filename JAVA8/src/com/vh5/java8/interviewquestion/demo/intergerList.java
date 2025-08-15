package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intergerList {

	public static void main(String[] args) {
		String [] a = {"123","asd","asde","456"};
		
	List<Integer> aa =Arrays.stream(a).filter(m->m.matches("[0-9]+")).map(Integer:: valueOf).collect(Collectors.toList());
	System.out.println(aa);
		
	}
}
