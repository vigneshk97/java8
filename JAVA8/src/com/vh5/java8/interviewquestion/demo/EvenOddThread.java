package com.vh5.java8.interviewquestion.demo;

public class EvenOddThread {
	static int count = 1;
	static final int MAX = 10;
	static final Object lock = new Object();

	public static void main(String[] args) {
		Thread odd = new Thread(() -> {
			while (count < MAX) {
				synchronized (lock) {
					if (count % 2 == 1) {
						System.out.println("Odd: " + count++);
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (Exception e) {
						}
					}
				}
			}
		});

		Thread even = new Thread(() -> {
			while (count < MAX) {
				synchronized (lock) {
					if (count % 2 == 0) {
						System.out.println("Even: " + count++);
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (Exception e) {
						}
					}
				}
			}
		});

		odd.start();
		even.start();
	}
}
