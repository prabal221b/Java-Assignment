package com.assignment.task3;

import java.util.Scanner;

public class Question3 {
	public static void palindrome(int num) {
		if(num == 0 || num < 0) {
			System.out.println("Zero/Negative number entered, Exiting.");
			return;
		}
		int curr = num;
		int rev = 0;
		while(num!=0) {
			rev = rev*10 + (num % 10) ;
			num = num/10;
		}
		if(curr == rev) {
			System.out.println("Palindrom : True");
		}
		else {
			System.out.println("Palindrom : False");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive 2+ digits number to see if its a palindrom: ");
		int num = sc.nextInt();
		palindrome(num);
		sc.close();

	}

}
