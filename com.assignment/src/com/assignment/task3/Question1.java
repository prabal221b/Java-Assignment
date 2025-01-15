package com.assignment.task3;
import java.util.Scanner;

public class Question1 {
	public static void fibonacci(int n) {
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			if(i == 0 || i == 1) {
				arr[i] = i;
				System.out.print(arr[i]+" ");
			}else {
				arr[i] = arr[i-1] + arr[i-2];
				System.out.print(arr[i]+" ");
			}
				
		}
		
		
	}
	public static void main(String[] asd) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number till which you want the series: ");
		int num = sc.nextInt();
		fibonacci(num);
		sc.close();
	}
	
}
