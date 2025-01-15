package com.assignment.task2;
import java.util.Scanner;

public class Question9 {
	
	public static double calculateBill(int units) {
		double totalBill = 0;
		if(units < 0) {
			return -1;
		}
		if(units <= 60 && units >= 0) {
			totalBill = units * 0.30;
		}
		else if(units <=150 && units > 60) {
			totalBill = (60 * 0.30) + ((units - 60) * 0.75);
		}
		else if(units <=300 && units > 150) {
			totalBill = (60 * 0.30) + (90 * 0.75) + (units - 150) * 1.10 ;
		}
		else if(units > 300) {
			totalBill = (60 * 0.30) + (90 * 0.75) + (150 * 1.10) + (units - 300) * 2.5;
		}
		
		//25+165+67.5+18
		
		return (totalBill + .20 * totalBill);
	}
	
	public static void main(String[] ads) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of units: ");
		
		int units = sc.nextInt();
	
		double bill = calculateBill(units);
		if(bill == -1) {
			System.out.println("Invalid units entered.");
		} else {
			System.out.println("Your Bill is Rs "+bill);
		}
		
		sc.close();
	}
}
