package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;

public class nonrepeat {
 public static void main(String[] args) {
	

	String a = "Spring boot rest api";
	
	String ans =Arrays.stream(a.split("")).filter(e->a.indexOf(e)==a.lastIndexOf(e)).findFirst().get();
	System.out.println("Given a String find the first repeat non character... "+ ans);
	
	
 }
}
