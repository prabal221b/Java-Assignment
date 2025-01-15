package com.assignment.task3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean op = true;
		int num1, num2;
		do {
			System.out.print("Enter first number: ");
			num1 = sc.nextInt();
	
			System.out.print("Enter second number: ");
			num2 = sc.nextInt();
			sc.nextLine();

			System.out.println("Sum of the number is "+ (num1+num2));
			System.out.print("Enter Y/y to try again or anything else to exit: ");
			String input = sc.nextLine();
			if(!input.equalsIgnoreCase("y")) {
				System.out.println("Exiting");
				op = false;
			}
		}
		while(op);
		
		

		sc.close();

	}

}
