package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class interviewQuestionjava8 {

	public static void main(String[] args) {

		String str = "iamlearninganddev";
		String[] a = str.split("");
		// System.out.println(Arrays.toString(a) );
		Map<String, Long> map1 = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 System.out.println("map.......1"+map1);

		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map......:" + map);

		List<String> ss = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(z -> z.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("duplicate..." + ss);

		List<String> dd = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(z -> z.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("unqie value :" + dd);

		String gg = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(w -> w.getValue() > 1).findFirst().get().getKey();
		System.out.println("first non repeat " + gg);

		int[] num = { 1, 2, 4, 7, 9, 12, 32, 33 };

		Integer nn = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("second high value a array " + nn);

		Integer mm = Arrays.stream(num).boxed().sorted().skip(1).findFirst().get();
		System.out.println("second lower value of a array" + mm);
		
		String[] sss = {"java","spring boot","spring MVC","Microservice","Rest Api spring boot application"};
		
		String s = Arrays.stream(sss).reduce((l1,l2) -> l1.length()>l2.length()? l1 : l2).get();
		System.out.println("large array in list in string...."+ s);
		
		String q = Arrays.stream(sss).reduce((u1,u2)-> u1.startsWith("M")? u1:u2).get();
		System.out.println(",,,,"+ q);
		
		String q1 = Arrays.stream(sss).reduce((u1,u2)-> u1.equalsIgnoreCase("java11")? u1:u2).get();
		System.out.println(",,,,"+ q1);
		
		List<String> nnn=Arrays.stream(num).boxed()
		.map(s1-> s1+ "")
		.filter(x-> x.startsWith("3")).
		collect(Collectors.toList());
		System.out.println("mmm"+ nnn);
		
		Map<String, Integer> mpp = new HashMap<>();
		mpp.put("sachin", 100);
		mpp.put("rohit", 99);
		mpp.put("dhoni", 98);
		mpp.put("sky", 97);
		mpp.put("vignesh", 101);
		
	Map.Entry<String, Integer>	 www=mpp.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(0);
		System.out.println("........"+www);
		}
	
	

}
