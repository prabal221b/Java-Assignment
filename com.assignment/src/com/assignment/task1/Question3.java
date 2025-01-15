package com.assignment.task1;

public class Question3 {
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static void swapWithoutTemp(int a, int b) {
		a = a+b;
		b = a - b;
		a = a - b;
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	
	public static void main(String[] ads) {
		int a = 20;
		int b = 10;
		swap(a,b);
		swapWithoutTemp(a,b);
	}
}
