package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFirstcharcter {

	public static void main(String[] args) {
		
          String s = "Hello World";
       String ans = Arrays.stream(s.split("")).filter(x-> s.indexOf(x)== s.lastIndexOf(x)).findFirst().get();
      // System.out.println(ans);
       
       char ansq = s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap:: new, 
    		   Collectors.counting()))
	  .entrySet().stream().filter(m->m.getValue()== 1).map(m->m.getKey()).findFirst().get();
      System.out.println(ansq);
	}
}
