package com.assignment.task6;

public class Question3 {
	static class Employees{
		String name;
		int year;
		String address;
		public Employees(String name, int year, String address) {
			this.name = name;
			this.year = year;
			this.address = address;
		}
	}

	public static void main(String[] args) {
		Employees emp1 = new Employees("Robert", 1994, "64C - Walls Street");
		Employees emp2 = new Employees("Sam", 2000, "68D - Walls Street");
		Employees emp3 = new Employees("John", 1999, "26B - Walls Street");
		System.out.println("Name\tYear of\t\tAddress");
		System.out.println("\tJoining");
		
		System.out.println(emp1.name+"\t"+emp1.year+"\t"+emp1.address);
		System.out.println(emp2.name+"\t"+emp2.year+"\t"+emp2.address);
		System.out.println(emp3.name+"\t"+emp3.year+"\t"+emp3.address);
	}

}
