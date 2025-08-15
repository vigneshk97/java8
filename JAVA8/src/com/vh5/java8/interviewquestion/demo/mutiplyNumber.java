package com.vh5.java8.interviewquestion.demo;

import java.util.stream.IntStream;

public class mutiplyNumber {

	public static void main(String[] args) {
		
		int [] aa = {1,3,4,6,7,8,9};
		
		int c =IntStream.range(0, aa.length).filter(m-> m%2!= 0).map(x->aa[x]).reduce(1,(a,b)-> a*b);
		System.out.println(c);
		
	}
}
