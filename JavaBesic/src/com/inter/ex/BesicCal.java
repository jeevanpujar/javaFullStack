package com.inter.ex;

public class BesicCal implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Add ="+(x+y));

	}

	@Override
	public void prod(int x, int y) {
		System.out.println("Product ="+(x*y));
	}

}
