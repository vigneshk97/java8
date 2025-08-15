package com.vh5.java8.stream.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bifunction implements BiFunction<List<Integer>, List<Integer>, List<Integer>>{

	

	@Override
	public List<Integer> apply(List<Integer> t, List<Integer> u) {
		return Stream.of(t,u)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
public static void main(String[] args) {
		BiFunction fun = new Bifunction();
		List<Integer> t = Stream.of(1,2,3,24,5,6,7,8).collect(Collectors.toList());
		List<Integer> u = Stream.of(1,13,5,27,8,9,0,7).collect(Collectors.toList());
		System.out.println("........:"+fun.apply(t, u));
		
	

BiFunction<List<Integer>, List<Integer>, List<Integer>>  f = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
	
	@Override
	public List<Integer> apply(List<Integer> t, List<Integer> u) {
		return Stream.of(t,u)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
	}
	
};
System.out.println("........1:"+fun.apply(t, u));


BiFunction<List<Integer>,List<Integer>, List<Integer>> bifunction =(y,a) ->{
	return Stream.of(t,u).flatMap(List::stream).distinct().collect(Collectors.toList());
};
System.out.println("nc........:"+ bifunction.apply(t, u));
}
}
