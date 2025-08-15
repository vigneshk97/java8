package com.vh5.java8.cps.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLambda {
	public static void main(String[] args) {
		
//	Predicate<Integer> pre = t ->  t%2 == 0;
//	System.out.println(pre.test(6));
	
	List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
	list1.stream().filter(t ->t%2 ==0).forEach( t -> System.out.println("print : "+ t));
		
	}
	
}
