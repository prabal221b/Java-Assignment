package com.assignment.task6;

public class Question4 {
	static class Student{
		String name;
		public Student(String name) {
			this.name = name;
		}
		public Student() {
			name = "Unknown";
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student("Amay");
		Student s2 = new Student();
		
		System.out.println("Student 1 name is "+s1.name);
		System.out.println("Student 2 name is "+s2.name);
	}

}
