package com.sristi.basics.oopsdemo;

public class ProcessorMain {
	public static void main(String[] args) {
		Processor processor=new Processor();
		int x=10;
		int y=20;
		double a=10.00;
		double b=20.20;
		System.out.println("--------------------------");
		processor.calculate(x);
		System.out.println("--------------------------");
		processor.calculate(a);
		System.out.println("--------------------------");
		processor.calculate(a, b);
		System.out.println("--------------------------");
		processor.calculate(x, y);
		System.out.println("--------------------------");
		processor.calculate(a, y);
	}

}
