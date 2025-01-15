package com.assignment.task7;

public class Question9 {
	public static void printCombination(String str, String newStr, int i) {
		if(i == str.length()) {
			if(!newStr.isEmpty()) {
				System.out.println(newStr);
			}
			return;
		}
		
		printCombination(str, newStr+str.charAt(i), i+1);
		printCombination(str, newStr, i+1);
	}

	public static void main(String[] args) {
		String str = "abcd";
		printCombination(str, "", 0);
		

	}

}
