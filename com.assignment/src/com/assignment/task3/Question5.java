package com.assignment.task3;

import java.util.Scanner;

public class Question5 {
	public static void evenNums(int n) {
		int counter = 0;
		while(counter < n) {
			System.out.print(2*counter+" ");
			counter++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for first n even number: ");
		int num = sc.nextInt();
		evenNums(num);
		sc.close();

	}

}
