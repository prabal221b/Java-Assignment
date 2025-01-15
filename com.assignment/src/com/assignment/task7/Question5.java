package com.assignment.task7;

import java.util.Scanner;

public class Question5 {
	static boolean checkIfArmstrong(int num) {
		int check = num;
		while(num != 0) {
			check -= Math.pow(num%10 , 3);
			num = num/10;
		}
		if(check == 0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(checkIfArmstrong(num)) {
			System.out.println("Armstrong Number.");
		}else {
			System.out.println("Not Armstrong.");
		}
		sc.close();
	}
}
