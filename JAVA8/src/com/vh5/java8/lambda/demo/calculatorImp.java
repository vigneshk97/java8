package com.vh5.java8.lambda.demo;
// normal way to did 
interface calculator{
	void m1();
}

public class calculatorImp implements calculator {

	@Override
	public void m1() {
		System.out.println("m1 method calling");
	}
	public static void main(String[] args) {
		calculatorImp cal = new calculatorImp();
		cal.m1();
	}

}
