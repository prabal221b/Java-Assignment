package com.assignment.task2;

public class Question2 {
	public static void checkIfAlphabet(char curr) {
		if((curr >= 'a' && curr < 'z') || (curr >= 'A' && curr < 'Z')) {
			System.out.println(curr +" is an alphabet");
		}
		else {
			System.out.println(curr +" is NOT an alphabet");
		}
	}
	public static void main(String[] asd) {
		char a = 'a';
		char b = 'B';
		char c = '%';
		checkIfAlphabet(a);
		checkIfAlphabet(b);
		checkIfAlphabet(c);
	}
}
