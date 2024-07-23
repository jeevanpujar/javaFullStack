package com.sristi.basics;

public class SwitchDemo {
	public static void main(String[] args) {
		String session="winter";
		switch(session.toUpperCase()) {
		case "RAINY":
			System.out.println("drink tea");
			break;
		case "WINTER":
			System.out.println("drink soup");
			break;
		case "SUMMER":
			System.out.println("eat an icecream");
			break;
		case "AUTUMN":
			System.out.println("enjoy the wind");
			break;
		default : {
			System.out.println("Invalid");
		}
		}
	}

}
