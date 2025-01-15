package com.assignment.task3;
import java.util.Scanner;

public class Question8 {
	
	public static void min(int[] arr, int lim) {
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<=lim; i++) {
			min = Math.min(min, arr[i]);
		}
		System.out.println("Min value is "+min);
	}
	
	public static void max(int[] arr, int lim) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<= lim; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println("Max value is "+max);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values would you like to enter?: ");		
		int num = sc.nextInt();

		int[] arr= new int[num];
		
		System.out.println("Enter the numbers: ");	
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
			min(arr, i); max(arr, i);
		}
		sc.close();
	}
}
