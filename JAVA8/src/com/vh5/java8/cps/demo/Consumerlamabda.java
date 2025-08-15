package com.vh5.java8.cps.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// 
public class Consumerlamabda {
	
	public static void main(String[] args) {
			
//	Consumer<Integer> demos = t -> System.out.println("print :"+ t);
//	demos.accept(30);
	
	List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
	list1.stream().forEach(t -> System.out.println("print :"+ t));
	}
}
