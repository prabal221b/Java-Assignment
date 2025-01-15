package com.assignment.task3;

import java.util.Scanner;

public class Question2 {
	public static int factorial(int num) {
		if(num < 0) {
			return -1;
		}
		
		int fact = 1;
		if(num == 0) {
			return fact;
		}
		for(int i=1; i<=num; i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] ads) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to calcualte its factorial: ");
		int num = sc.nextInt();
		int factorial = factorial(num);
		if(factorial == -1) {
			System.out.println("Invalid number");
		}else {
			System.out.println(num+"! is "+factorial);
		}
		
		sc.close();
	}
}
