package com.assignment.task4;
import java.util.Scanner;

public class Question1 {
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
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
		print(arr);
		sc.close();
	}
}
