package com.inter.ex;

public class ScientificCal extends BesicCal implements IScientficCal {

	@Override
	public void square(int x) {
		System.out.println("Square of num="+Math.pow(x, 2));
		
	}

	@Override
	public void cube(int x) {
		System.out.println("Cube of num="+Math.pow(x, 3));
		
	}

}
