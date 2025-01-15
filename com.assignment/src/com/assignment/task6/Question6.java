package com.assignment.task6;

import java.util.Scanner;

public class Question6 {
	static class Complex{

		public void addition(int[] num1, int[] num2) {
			int realResult = num1[0] + num2[0];
			int imagResult = num1[1] + num2[1];
			if(imagResult < 0) {
				System.out.println("Number 1 + Number 2 = "+realResult+" - "+imagResult+"i");
			}
			else {
				System.out.println("Number 1 + Number 2 = "+realResult+" + "+imagResult+"i");
			}
		}
		public void subtraction(int[] num1, int[] num2) {
			int realResult = num2[0] - num1[0];
			int imagResult = num2[1] - num1[1];
			if(imagResult < 0) {
				System.out.println("Number 1 - Number 2 = "+realResult+" "+imagResult+"i");
			}
			else {
				System.out.println("Number 2 - Number 1 = "+realResult+" + "+imagResult+"i");
			}
			
		}
		
	}
	public void addition(int[] num1, int[] num2) {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] nums = new int[2][2];
		for(int i=0; i<2; i++) {
			System.out.println("Enter real part of number "+(i+1));
			nums[i][0] = sc.nextInt();
			System.out.println("Enter imaginary part of number"+(i+1));
			nums[i][1] = sc.nextInt();
			
			if(nums[i][1] < 0) {
				System.out.println("Number "+(i+1)+" is "+ nums[i][0]+" "+nums[i][1]+"i");
			}
			else {
				System.out.println("Number "+(i+1)+" is "+ nums[i][0]+" + "+nums[i][1]+"i");
			}
		}
		Complex c1 = new Complex();
		c1.addition(nums[0], nums[1]);
		c1.subtraction(nums[0], nums[1]);
		
		
		
		sc.close();
	}

}
