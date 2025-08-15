package com.vh5.java8.interviewquestion.demo;

import java.util.Arrays;

public class unqineElement {
public static void main(String[] args) {
	
	int arr[]  = {1,2,3,4,3,4,4,5,7,8};
	
	 int a = Arrays.stream(arr).distinct().sum();
	 System.out.println("Given a array find the sum of unique element..."+ a);
}
}
