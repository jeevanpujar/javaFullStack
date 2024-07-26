package com.sristi.basics.oopsdemo;

import java.util.Scanner;

public class Studentmain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[] students=new Student[2];
		System.out.println("enter the student details");
		for(int i=0;i<students.length;i++) {
			students[i]=new Student(sc.next(), sc.next());
		}
		students[0].print();
		students[0].getGrade(60,70,80,90,90,90);
		students[1].print();
		students[1].getGrade(50,60,70,80,90,70);
	}
}
