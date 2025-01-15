package com.assignment.task4;

public class Question6 {
	public static void findPairs(int[] arr, int key) {
		//assuming the array is sorted or will sort it first
		int i = 0;
		int j = arr.length -1;
		while(i < j) {
			if(arr[i] + arr[j] == key) {
				System.out.println(arr[i]+","+arr[j]);
				i++; j--;
			}
			if(arr[i] + arr[j] > key) {
				j--;
			}
			if(arr[i] + arr[j] < key) {
				i++;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6};
		int target = 6;
		
		findPairs(arr, target);
		

	}

}
