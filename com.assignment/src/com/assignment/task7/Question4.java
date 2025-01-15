package com.assignment.task7;

public class Question4 {

	public static void countWords(String str) {
		int count = 1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ' && i != 0 && i <str.length()-1) {
				count++;
			}
		}
		System.out.println("Number of words: "+count);
	}
	
	public static void main(String[] args) {
		String str = "This is a sample setence.";
		countWords(str);
	}
}
