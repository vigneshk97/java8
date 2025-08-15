package com.vh5.java8.cps.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierLambda {
public static void main(String[] args) {
	

	Supplier<String> supp = () ->  "hi vignesh";
		
	//System.out.println(supp.get());
	
	List<String> list1 = Arrays.asList("a");
	System.out.println(list1.stream().findAny().orElseGet(() ->  "hi vignesh"));
}
}
