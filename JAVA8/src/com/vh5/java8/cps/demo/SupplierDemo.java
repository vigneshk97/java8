package com.vh5.java8.cps.demo;

import java.util.function.Supplier;

//  method don't have any agrement but return .
public class SupplierDemo implements Supplier<String>{

	@Override
	public String get() {
		
		return "hi vignesh";
	}
	public static void main(String[] args) {
		SupplierDemo de = new SupplierDemo();
		de.get();
		System.out.println(de.get());
	}

}
