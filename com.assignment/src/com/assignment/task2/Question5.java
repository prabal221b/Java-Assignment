package com.assignment.task2;

public class Question5 {
	public static void checkGrade(double percentage) {
		if(percentage > 90 && percentage <= 100) {
			System.out.println("A");
		}
		else if(percentage > 75 && percentage <= 90) {
			System.out.println("B");
		}
		else if(percentage > 65 && percentage <= 75) {
			System.out.println("C");
		}
		else {
			System.out.println("No Grade.");
		}
	}
	public static void main(String[] ads) {
		double studentGrades[] = {95.12, 77.53, 66.35, 50.45};
		for(int i=1; i<=studentGrades.length; i++) {
			System.out.print("Grade for Student"+i+" is: ");
			checkGrade(studentGrades[i-1]);
		}
		
		
		
	}
}
