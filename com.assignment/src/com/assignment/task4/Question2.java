package com.assignment.task4;

import java.util.Scanner;

public class Question2 {

	public static int avg(int[] arr) {
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total/arr.length;
	}
	
	public static void main(String[] asds) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the numbers: ");
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Average is "+avg(arr));;
		sc.close();
	}
}
