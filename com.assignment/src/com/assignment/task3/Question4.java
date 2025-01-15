package com.assignment.task3;

import java.util.Scanner;

public class Question4 {
	public static void isPrime(int num) {
		if(num <= 0) {
			System.out.println("0/Negative number entered, Exiting");
			return;
		}
		if(num == 1 || num ==2) {
			System.out.println("Prime!");
			return;
		}
		for(int i=2;i<num/2;i++) {
			if(num % 2 == 0) {
				System.out.println("Not a Prime.");
				return;
			}
		}
		System.out.println("Prime!");
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to  check if its a prime number: ");
		int num = sc.nextInt();
		isPrime(num);
		sc.close();
	}

}
