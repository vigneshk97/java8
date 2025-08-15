package com.vh5.java8.cps.demo;
// normal way did
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("print "+ t);
		
	}
	public static void main(String[] args) {
		ConsumerDemo cdemo = new ConsumerDemo();
		cdemo.accept(10);
	}

}
