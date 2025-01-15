package com.assignment.task7;
import java.util.TreeSet;

public class Question7 {
	static TreeSet<String> t =  new TreeSet<>();
	public static void permutation(String str, String newStr){
        if(str.length() == 0) {
        	t.add(newStr);
        	return;
        }
        for(int i=0; i<str.length(); i++) {
        	char c = str.charAt(i);
        	String subStr = str.substring(0,i) + str.substring(i+1);
        	permutation(subStr, newStr+c);
        }
    } 
	
	public static void main(String[] args) {
		String str = "abca";
		permutation(str, "");
		for(int i=0; i<t.size(); i++) {
			System.out.print(t.removeFirst()+" ");
		}
	}

}
