package com.assignment.task4;

import java.util.Scanner;

public class Question3 {

	public static void print(int[] arr) {
		System.out.print("Array : [ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	
	public static void linearSearch(int[] arr, int key) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Number found at index: "+i);
				return;
			}
		}
		System.out.println("Number not found in the array.");
		
	}
	
	public static void main(String[] asds) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = {5,3,6,9,10,12,19};
		print(arr);
		
		System.out.print("Enter the number you wish to search in the array: ");
		int key = sc.nextInt();
		
		linearSearch(arr, key);
		sc.close();
	}

}
