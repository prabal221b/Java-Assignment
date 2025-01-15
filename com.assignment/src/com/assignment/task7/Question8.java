package com.assignment.task7;

public class Question8 {
	public static void max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i< arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max value is "+max);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,5,3,10,16,20,13,17,28,9,6};
		max(arr);

	}

}
