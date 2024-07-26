package com.sristi.basics.oopsdemo;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] employees=new Employee[3];
		employees[0]=new Employee("Jeevan", "Programmer");
		employees[1]=new Employee("Pramod", "Manager");
		employees[2]=new Employee("Prakash","Director");
		for (int i=0;i<employees.length;i++) {
			System.out.println("employee name ="+employees[i].name);
			String empDesg=employees[i].designation;
			double instanceVariable=0;
			switch(empDesg.toUpperCase()) {
			case "PROGRAMMER":
				instanceVariable = employees[i].calcBonus(10000);
				break;
			case "MANAGER":
				instanceVariable = employees[i].calcBonus(10000,5000);
				break;
			case "DIRECTOR":
				instanceVariable = employees[i].calcBonus(10000,5000,3000);
				break;
			}
			System.out.println("InstanceVariable ="+instanceVariable);
			System.out.println("====================================");
		}
		
	}
}
