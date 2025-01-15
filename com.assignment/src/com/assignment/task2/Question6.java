package com.assignment.task2;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] ads) {
		System.out.println("Calc The Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int number1 = sc.nextInt();
		int number2, result;
		
		sc.nextLine();
		
		System.out.print("Enter an operator(+, - , *, /) or Enter q to exit: ");
		String operation = sc.nextLine();
		
		while(!operation.equals("q")) {
			switch(operation) {
			case "+":
				System.out.print("Enter 2nd number: ");
				number2 = sc.nextInt();
				result = number1 + number2;
				System.out.println(number1 + " + "+number2+" = "+result);
				number1 = result;
				sc.nextLine();
				System.out.print("Enter an operator(+, - , *, /) or Enter q to exit: ");
				operation = sc.nextLine();
				break;
			
			case "-":
				System.out.print("Enter 2nd number: ");
				number2 = sc.nextInt();
				result = number1 - number2;
				System.out.println(number1 + " - "+number2+" = "+result);
				number1 = result;
				
				sc.nextLine();
				System.out.print("Enter an operator(+, - , *, /) or Enter q to exit: ");
				operation = sc.nextLine();
				break;
			
			case "*":
				System.out.print("Enter 2nd number: ");
				number2 = sc.nextInt();
				result = number1 * number2;
				System.out.println(number1 + " * "+number2+" = "+result);
				number1 = result;
				
				sc.nextLine();
				System.out.print("Enter an operator(+, - , *, /) or Enter q to exit: ");
				operation = sc.nextLine();
				break;
			
			case "/":
				System.out.print("Enter 2nd number: ");
				number2 = sc.nextInt();
				result = number1 / number2;
				System.out.println(number1 + " / "+number2+" = "+result);
				number1 = result;
				
				sc.nextLine();
				System.out.print("Enter an operator(+, - , *, /) or Enter q to exit: ");
				operation = sc.nextLine();
				break;
			
			default:
				System.out.println("Invalid operator. Please try again.");
                System.out.print("Enter an operator (+, -, *, /) or Enter q to exit: ");
                operation = sc.nextLine();
			}
		}
		
		sc.close();
		System.out.println("The End!");
	}
}
