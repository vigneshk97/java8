package com.vh5.java8.interviewquestion.demo;

public class secondarra {
public static void main(String[] args) {
	
	int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
	int arr[] = {1,2,3,4,5,6,7};
	for (int num : arr) {
	    if (num > max) {
	        second = max;
	        max = num;
	    } else if (num > second && num != max) {
	        second = num;
	    }
	}
	System.out.println("Second max = " + second);
}
}
