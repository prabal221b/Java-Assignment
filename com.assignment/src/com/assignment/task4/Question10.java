package com.assignment.task4;

public class Question10 {
	public static void checkIfEqual(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			System.out.println("NOT equal.");
			return;
		}
		else {
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					System.out.println("NOT equal.");
					return;
				}
			}
		}
		System.out.println("equal");
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,5,6,4,7,8,9};
		int[] arr2 = {2,3,5,6,4,3,7};
		int[] arr3 = {1,5,6,4,7,8,9};
		
		System.out.print("Array 1 and Array 2 are ");checkIfEqual(arr1, arr2);
		System.out.print("Array 1 and Array 3 are ");checkIfEqual(arr1, arr3);

	}

}
