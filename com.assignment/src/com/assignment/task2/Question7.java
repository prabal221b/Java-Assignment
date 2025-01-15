package com.assignment.task2;
import java.util.Scanner;

public class Question7 {
	public static void main(String[] ads) {
		Scanner sc = new Scanner(System.in);
		boolean start =true;
		while(start) {
			System.out.print("Enter a number: ");
			if(sc.nextInt()>=0) {
				System.out.println("Good going");
			}
			else {
				System.out.println("It's Over");
				start = false;
			}
		}
		sc.close();
	}
}
