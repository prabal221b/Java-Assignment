package com.assignment.task3;

public class Question10 {

	public static void main(String[] args) {
		int a=1, b=1;
		for(int i=0; i<4; i++) {
			for(int j=1; j<=11; j++) {
				if(a+b > 11) {
					System.out.print("* ");
				}
				else {
					while(j<=a) {
						System.out.print("* ");
						j++;
					}
					while(j<=11-b) {
						System.out.print("  ");
						j++;
					}
					System.out.print("* ");
				}
			}
			a = a+2;
			b = b+2;
			System.out.println();
		}

	}

}
