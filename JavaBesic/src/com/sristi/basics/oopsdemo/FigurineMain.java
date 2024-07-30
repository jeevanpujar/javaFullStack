package com.sristi.basics.oopsdemo;

import java.util.Scanner;

public class FigurineMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Figurine figurine = null;
		boolean control=false;
		System.out.println("Enter the figure to calculate volume:");
		do{
			System.out.println("Cube , Cuboid , Oval, Cylinder");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("Cube")) {
				figurine = new Cube();
				System.out.print("Enter the side length of the Cube: ");
				int side = sc.nextInt();
				figurine.volume(side, 0);
			}else if(choice.equalsIgnoreCase("Cuboid")) {
				figurine = new Cuboid();
				System.out.print("Enter the length of the Cuboid: ");
				int length = sc.nextInt();
				System.out.print("Enter the width of the Cuboid: ");
				int width = sc.nextInt();
				figurine.volume(length, width);
			}else if(choice.equalsIgnoreCase("Oval")) {
				figurine = new Oval();
				System.out.print("Enter the major axis of the Oval: ");
				int majorAxis = sc.nextInt();
				System.out.print("Enter the minor axis of the Oval: ");
				int minorAxis = sc.nextInt();
				figurine.volume(majorAxis, minorAxis);
			}else if(choice.equalsIgnoreCase("Oval")){
				figurine = new Cylinder();
				System.out.print("Enter the radius of the Cylinder: ");
				int radius = sc.nextInt();
				System.out.print("Enter the height of the Cylinder: ");
				int height = sc.nextInt();
				figurine.volume(radius, height);
			}else {
				System.out.println("Please enter valid option");
				control=true;
			}
		}while(control);

	}
}
