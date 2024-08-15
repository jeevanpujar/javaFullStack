package com.training.quest1;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enther the course opetion for students or employee ");
		String option=sc.nextLine();
		Institute  institute = null;
		if(option.equalsIgnoreCase("student")) {
			institute = new StudentCourses();
		}else if(option.equalsIgnoreCase("employee")){
			institute = new EmployeeCourses();
		}
		
		String[] courses = institute.showCourses();
		for (String course : courses) {
			System.out.println(course);
		}
	}

}
