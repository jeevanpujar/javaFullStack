package com.sristi.basics.oopsdemo;

public class Student {
	/*
	 * Write a program to print grades of two student objects class Student ∙Has
	 * properties name, department ∙Has parameterized constructor ∙Has method as
	 * void printDetails() to print the details of the Student ∙Has method String
	 * getGrades(int… marks ) to calculate sum, average and grade as A(90-100) or
	 * B(80-90) or C(70-80) or D(60-70) or E(50-59) or fail class Main ∙Has PSVM -
	 * Get User input to get student name, id and marks (to populate the array).
	 * ∙Now create 2 student objects and populate with the values ∙Call both the
	 * methods to print student details and grade
	 */
	String name;
	String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void print() {
		System.out.println("Name ="+name);
		System.out.println("Department ="+department);
	}
	String getGrade(int... marks) {
		int sum=0;
		for (int i : marks) {
			sum+=i;
		}
		System.out.println("Sum = "+sum);
		double avg=sum/marks.length;
		System.out.println("Avg ="+avg);
		//find grade using Ternary Operator
		String grade=avg>=90 ? "A" : avg>=80 ? "B" : avg>=70 ? "C" : avg>=60 ? "D" : avg>=50 ? "E":"Fail";
		System.out.println("Grade ="+grade);
		//using if condition
		if(avg>=90) {
			return "A";
		}else if(avg>=80) {
			return "B";
		}else if(avg>=70) {
			return "C";
		}else if(avg>=60) {
			return "D";
		}else if(avg>=50) {
			return "E";
		}else {
			return "Fail";
		}
	}
	
	

}
