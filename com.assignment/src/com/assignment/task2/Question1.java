package com.assignment.task2;

public class Question1 {
	public static void checkInteger(int num) {
		if(num>=0) {
			System.out.println(num +" is Positive");
		}
		else {
			System.out.println(num +" is Negative");
		}
	}
	public static void main(String[] ads) {
		int num1 = 10;
		int num2 = -10;
		checkInteger(num1);
		checkInteger(num2);
		
	}
}
