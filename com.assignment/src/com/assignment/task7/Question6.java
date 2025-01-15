package com.assignment.task7;

public class Question6 {

	public static void countOccurences(String str) {
		int[] freq = new int[26];
		for(int i=0; i<str.length(); i++) {
			char curr = str.charAt(i);
			freq[curr - 'a']++;
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i] != 0) {
				System.out.println("Frequency of "+(char)(i+'a')+ " is "+freq[i]);
			}
			
		}
	}
	
	public static void main(String[] args) {
		String str = "aabccdaaaz";
		countOccurences(str);
	}

}
