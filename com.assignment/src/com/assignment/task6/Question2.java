package com.assignment.task6;

public class Question2 {
	static class Triangle{
		int side1, side2, side3;
		public int perimeter(int side1, int side2, int side3) {
			return side1 + side2 + side3;
		}
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println("Perimeter of the Triangle: "+t.perimeter(3, 4, 5));
	}

}
