package com.vh5.java8.stream.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class mapSort {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		
		List<Entry<String, Integer>> kee = new ArrayList<>(map.entrySet());
		Collections.sort(kee, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					return o1.getKey().compareTo(o2.getKey());
			}
		});
		 for (Entry<String, Integer> entry : kee) {
			//System.out.println(entry.getKey()+ ""+ entry.getValue());
		}
		 
		 List<Entry<String, Integer>> jee = new ArrayList<>(map.entrySet());
		// Collections.sort(jee, new Comparator<Entry<String, Integer>>() {
		 Collections.sort(jee, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//		  for (Entry<String, Integer> entry : jee) {
//			  System.out.println(entry.getKey() +"......"+ entry.getValue());		
//		}
		  
		  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // java 8
		  
		  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}
}
