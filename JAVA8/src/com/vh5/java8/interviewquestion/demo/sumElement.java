package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.List;

public class sumElement {

	public static void main(String[] args) {
		
	int a[] = {1,2,3,4,5,6};
	
	int aa= Arrays.stream(a).sum();
	System.out.println(aa);
	
	List<Integer>  sum = Arrays.asList(1,2,3,4,5);
	
	int s= sum.stream().mapToInt(Integer::intValue).sum();
	System.out.println("ss.."+ s);
			}
}
