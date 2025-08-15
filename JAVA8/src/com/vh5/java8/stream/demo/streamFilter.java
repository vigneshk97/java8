package com.vh5.java8.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class streamFilter {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("ranjith");
		list.add("karthii");
		list.add("mishi");
		list.add("ram");
		list.add("lekhashree");
		
		for(String s : list) {
			if(s.startsWith("r")) {
			//System.out.println("list :"+ s);
			}
		}
		
		list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println("ss... "+ t));
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "v");
		map.put(2, "i");
		map.put(3, "g");
		map.put(4, "n");
		map.put(5, "e");
		map.put(6, "s");
		
		map.entrySet().stream().filter(s->s.getKey()%2!=0).forEach(s->System.out.println("map..."+ s));
	}
}
