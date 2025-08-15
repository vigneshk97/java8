package com.vh5.java8.stream.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class sortListDemo {

	public static void main(String[] args) {
		
		List<String> lis = new ArrayList<>();
		Set<String> lis1 = new HashSet();
		lis.add("vig");
		lis.add("sar");
		lis.add("ram");
		lis.add("vig");
		
		for(String a : lis) {
			System.out.println("a......."+ a);
		}
		
		lis1=lis.stream().collect(Collectors.toSet());
		lis1.stream().forEach(n->System.out.println(n));
		System.out.println("");
	}
}
