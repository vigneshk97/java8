package com.vh5.java8.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// stream api is used to process collection of object.
// A stream is a sequence of object that supports various methods which can be pipelined to produce the desired result.
public class streamapi {

	public static void main(String[] args) {
		
	
	List<String> list1 = new ArrayList<>();
	list1.add("1");
	list1.add("vignesh");
	list1.add("lekha");
	list1.add("mishi");
	
	for(String a : list1) {
		System.out.println("loop : "+ a);
	}
	
	list1.stream().forEach(x -> System.out.println("looping "+ x));
	
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "vi");
	map.put(2, "so");
	
	map.entrySet().forEach(t -> System.out.println(t));
	
}
}
