package com.assignment.task1;
import java.util.Scanner;

public class Question5 {
	public static void printArea(int r) {
		double area = 2 * 3.14 * (double)r;
		System.out.println("Area of the circle is "+area);
	}
	public static void main(String[] ads) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius = sc.nextInt();
		printArea(radius);
		sc.close();
	}
}
