package com.inter.ex;

public class MainCal {
	public static void main(String[] args) {
		IScientficCal cal=new ScientificCal();
		cal.add(10, 20);
		cal.prod(10, 20);
		cal.square(10);
		cal.cube(20);
		
	}

}
