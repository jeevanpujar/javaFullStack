package com.training.quest2;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		System.out.println("z for zip, j for jar, r for rar");
		Scanner sc=new Scanner(System.in);
		String options=sc.next();
		Extractor extractor=null;
		switch (options) {
		case "z": 
			extractor=new ZipExtractor();
			extractor.extractFiles("a.txt","b.txt","c.txt");
			break;
		case "j":
			extractor=new JarExtractor();
			extractor.extractFiles("a.jar","b.jar","c.jar");
			break;
		case "r":
			extractor=new RarExtractor();
			extractor.extractFiles("a.rar","b.rar","c.rar");
			break;
		default:
			System.out.println("invalid value: " + options);
			break;
		}
	}

}
