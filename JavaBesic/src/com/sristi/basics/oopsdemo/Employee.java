package com.sristi.basics.oopsdemo;

public class Employee {
	String name;
	String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	double calcBonus(double basicAllowance) {
		return basicAllowance*0.5;
	}
	double calcBonus(double basicAllowance, double carAllowance) {
		return basicAllowance*0.5+carAllowance*0.5;
	}
	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return basicAllowance*0.5+carAllowance*0.5+houseAllowance*0.5;
	}
}
