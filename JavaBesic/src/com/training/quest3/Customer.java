package com.training.quest3;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("T for touch screen or B for basic phone");
		String option=sc.next();
		FeaturePhone phone=null;
		if(option.equalsIgnoreCase("B")) {
			phone=new BasicMobile();
			phone.call();
			phone.messaging();
		}else {
			phone=new TouchScreenMobile();
			phone.call();
			phone.messaging();
			((TouchScreenMobile) phone).showApps();
			((TouchScreenMobile) phone).cameraTypes();
			
		}
	}
}
