package com.assignment.task7;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Question10 {
	public static void print(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i][0] +" : "+arr[i][1]);
		}
	}
	public static void sortByKeys(HashMap<Integer, Integer> hm) {
		int[][] arr = new int[hm.size()][2];
		int k=0;
		for(HashMap.Entry<Integer, Integer> i:hm.entrySet()) {
			arr[k][0] = i.getKey();
			arr[k][1] = i.getValue();
			k++;
		}
		Arrays.sort(arr, Comparator.comparingInt(o -> (o[0])));
		print(arr);
	}
	public static void sortByValues(HashMap<Integer, Integer> hm) {
		int[][] arr = new int[hm.size()][2];
		int k=0;
		for(HashMap.Entry<Integer, Integer> i:hm.entrySet()) {
			arr[k][0] = i.getKey();
			arr[k][1] = i.getValue();
			k++;
		}
		Arrays.sort(arr, Comparator.comparingInt(o -> (o[1])));
		print(arr);
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		hm.put(1, 5);
		hm.put(3, 8);
		hm.put(6, 2);
		hm.put(2, 1);
		hm.put(5, 9);
		
		System.out.println("By Keys");
		sortByKeys(hm);
		System.out.println("By Values");
		sortByValues(hm);


	}

}
