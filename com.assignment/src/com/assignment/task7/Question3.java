package com.assignment.task7;

public class Question3 {

	public static boolean checkIfNonRepeating(String str) {
		int[] freq = new int[26];
		for(int i=0; i<str.length(); i++) {
			char curr = str.charAt(i);
			freq[curr - 'a']++;
			if(freq[curr - 'a'] == 2) {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		String str = "abcdefghija";
		if(checkIfNonRepeating(str)) {
			System.out.println("All characters are unique.");
		}else {
			System.out.println("NOT unique.");
		}
	}
}
