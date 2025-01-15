package com.assignment.task6;

public class Question1 {
	public static class Student{
		String name;
		int enrollmentNo;
		public Student(String name, int enrollmentNo) {
			this.name = name;
			this.enrollmentNo = enrollmentNo;
		}
	}
	public static void main(String[] args) {
		Student s = new Student("Amay", 132);
		System.out.println("Name: "+s.name+", Enrollment No.: "+s.enrollmentNo);
	}
}
