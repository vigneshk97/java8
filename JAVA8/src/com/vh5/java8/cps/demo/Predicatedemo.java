package com.vh5.java8.cps.demo;

import java.util.function.Predicate;

// conditional check either true or false (boolean return type)
public class Predicatedemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if(t%2 == 0) {
			return true;
		}else {
			return false;
		}
		//return false;
	}
	public static void main(String[] args) {
		Predicatedemo dem = new Predicatedemo();
		dem.test(7);
		System.out.println(dem.test(6));
	}
	
	

	
}
