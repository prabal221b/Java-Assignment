package com.assignment.task4;

public class Question5 {
	public static void print(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] addMat(int[][] arr1, int[][] arr2) {
		int[][] add = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<add.length; i++) {
			for(int j=0; j<add[0].length; j++) {
				add[i][j] = arr1[i][j] + arr2[i][j];
			}	
		}	
		return add;
	}
	
	public static void main(String[] args) {
		int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] mat2 = {{3, 2, 1}, {6, 5, 4}, {9, 8 ,7}};
		System.out.println("Matrix 1");
		print(mat1);
		System.out.println("Matrix 2");
		print(mat2);
		System.out.println("Addition of both Matrices: ");
		int[][] add = addMat(mat1 , mat2);
		print(add);

	}

}
