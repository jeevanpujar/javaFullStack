package com.sristi.basics.inheritance;

public class InherMain {
	public static void main(String[] args) {
		  InEmployee employee = new InEmployee();
		  employee.printDetails();
		InManager manager = new InManager();
		  manager.printDetails();
		  manager.calcBonus(100);
		 }

}
