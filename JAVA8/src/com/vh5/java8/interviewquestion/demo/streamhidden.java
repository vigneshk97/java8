package com.vh5.java8.interviewquestion.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamhidden {
 public static void main(String[] args) {
	
	 
	 List<String> listt = Arrays.asList("vignesh",null,"roobi",null,"lekha","vin");
	List<String>  aa=listt.stream().filter(name ->name != null).collect(Collectors.toList());
	 System.out.println(aa);
	 
	 List<String>  b = listt.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
	  System.out.println(b);
	  
	  Stream.iterate(1, x-> x+2).limit(5)
	  .forEach(System.out::println);
	  
	  List<Integer> nn=  IntStream.range(1, 20).boxed().collect(Collectors.toList());
	  System.out.println(nn);
	  
	  
	  List<Integer> yy = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
	  System.out.println(yy);
	  
}
 
}
