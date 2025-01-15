package com.assignment.task7;

public class Question1 {
	public static void firstNonRepeated(String str) {
		int[] freq = new int[26];
		for(int i=0; i<str.length(); i++) {
			char curr = str.charAt(i);
			freq[curr - 'a']++;
		}
		for(int i=0; i<str.length(); i++) {
			char curr = str.charAt(i);
			if(freq[curr - 'a'] == 1) {
				System.out.println(curr);
				return;
			}
		}
	}

	public static void main(String[] args) {
		String str = "aaijdfnihrwejorewn";
		firstNonRepeated(str);
	}

}
