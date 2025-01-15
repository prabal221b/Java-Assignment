package com.assignment.task7;

public class Question11 {

	public static void main(String[] args) {
		int[] arr = { 1,3,-1,5,-1,2,3 };
		int target = 4;

		
		for(int i=0; i<arr.length; i++) {
			int currentSum = 0;
			for(int j=i;j<arr.length; j++) {
				currentSum += arr[j];
				if(currentSum == target) {
					int k = i;
					System.out.print("[ ");
					while(k <= j) {
						System.out.print(arr[k] +" " );
						k++;
					}
					System.out.print("]");
					System.out.println();
				}
			}
			
		}
	}

}
