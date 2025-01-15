package com.assignment.task6;

public class Question5 {
	static class Rectangle{
		int length, breadth, area;
		public Rectangle() {
			area = 0;
		}
		public Rectangle(int length, int breadth) {
			this.length = length;
			this.breadth = breadth;
			area = length * breadth;
		}
		public Rectangle(int length) {
			this.length = this.breadth = length;
			area = length * breadth;
		}
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3,4);
		Rectangle r3 = new Rectangle(4);
		System.out.println("Area of rectangle 1 is "+r1.area);
		System.out.println("Area of rectangle 2 is "+r2.area);
		System.out.println("Area of rectangle 3 is "+r3.area);
	}

}
