package com.assignment.task4;
import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
	
	public static void print(int[] arr) {
		System.out.print("Array : [ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}

	public static void binarySearch(int[] arr, int start, int end, int key) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
            	System.out.println("Key found at index : " + mid);
                return;
            }
            if (arr[mid] > key) {
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        System.out.println("Key not found in the array.");
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        int[] arr = { 2, 4, 6, 9, 10, 14, 17, 19, 25, 28 };
        Arrays.sort(arr); // in case array is not sorted;
        int end = arr.length-1;
        print(arr);
        
        System.out.print("Enter the number you wish to search in the array: ");
		int key = sc.nextInt();
        
        binarySearch(arr, 0, end, key);
        sc.close();
    }
}
