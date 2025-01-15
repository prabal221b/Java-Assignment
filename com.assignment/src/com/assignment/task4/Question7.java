package com.assignment.task4;

public class Question7 {

	public static void main(String[] args) {
		int[] arr = {2,2,3,3,4,4,4,11,11,11,11};
		int j = 1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arr[j++] = arr[i];
			}
		}
		while(j<arr.length) {
			arr[j++]=0;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
