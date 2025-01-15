package com.assignment.task2;
import java.util.Scanner;

public class Question8 {
	public static void taxSlab(double sal) {
		double tax;
		if(sal >= 12) {
			tax = sal * .25 * 100000; 
			System.out.println("Need to pay Rs."+tax);
		}
		else if(sal >= 6 && sal < 12) {
			tax = sal * .18 * 100000; 
			System.out.println("Need to pay Rs.");
		}
		else if(sal >= 2.5 && sal < 6) {
			tax = sal * 10000; 
			System.out.println("Need to pay Rs."+tax);
		}
		else {
			System.out.println("No tax required");
		}
	}
	public static void main(String[] ads) {
		Scanner sc = new Scanner(System.in);
		double salary;
		while(true){
			System.out.print("Enter your salary(in lakhs) or Negative value to quit : ");
			try{
				salary = sc.nextDouble();
			}
			catch(Exception e) {
				System.out.println("Invalid value entered.");
				break;
			}
			
			if(salary >= 0) {
				taxSlab(salary);
			}
			else {
				System.out.println("Quitting!");
				break;
			}
			
		}
		sc.close();	
	}
}
