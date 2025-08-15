package com.vh5.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class reduce {

	public static void main(String[] args) {
		
		List<Integer>  listt = Arrays.asList(1,2,3,4,5,6);
		
		List<String> letter = Arrays.asList("name","vignesh","roobinibri","lekhashreee","mishitha");
		
		int sum =0;
		for(int a : listt) {
			sum = sum+ a;
		}
		System.out.println("sum."+ sum);
		
	int su =listt.stream().mapToInt(x-> x).sum();
	System.out.println("su....."+ su);
	
	int aa=listt.stream().reduce(0,(z,b)-> z+b);
	System.out.println("a."+ aa);
	
	int cc= listt.stream().reduce(Integer::sum).get(); 
	System.out.println("cc..."+cc);
	
	
	int bb = listt.stream().reduce(Integer::compareTo).get();
	System.out.println(bb);
	
	String longestno=letter.stream()
	.reduce((letter1,letter2)-> letter1.length()> letter2.length() ? letter1 : letter2).get();
	System.out.println("log......"+ longestno);
		
		
		
	}
}
