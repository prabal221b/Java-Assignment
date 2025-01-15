package com.assignment.task2;

public class Question4 {
	public static void checkIfLeapYear(int year) {
		if(year%4 == 0) {
			System.out.println(+year+" is Leap Year.");
		}
		else {
			System.out.println(+year+" is NOT a Leap Year.");
		}
	}
	public static void main(String[] ads) {
		int year1 = 1996;
		int year2 = 2001;
		checkIfLeapYear(year1);
		checkIfLeapYear(year2);
		
	}
}
