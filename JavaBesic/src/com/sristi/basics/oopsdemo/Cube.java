package com.sristi.basics.oopsdemo;

import java.util.Scanner;

class Cube extends Figurine {
    @Override
    void volume(int side, int unused) {
        int volume = side * side * side;
        System.out.println("Volume of the Cube: " + volume);
    }
}

class Cuboid extends Figurine {
    @Override
    void volume(int length, int width) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();
        int volume = length * width * height;
        System.out.println("Volume of the Cuboid: " + volume);
    }
}

class Oval extends Figurine {
    @Override
    void volume(int majorAxis, int minorAxis) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();
        double volume = (4.0 / 3.0) * Math.PI * majorAxis * minorAxis * height;
        System.out.println("Volume of the Oval: " + volume);
    }
}

class Cylinder extends Figurine {
    @Override
    void volume(int radius, int height) {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the Cylinder: " + volume);
    }
}
