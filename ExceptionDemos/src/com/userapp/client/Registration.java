package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Registration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flage=false;
		IValidationService validationService=new ValidationServiceImpl();
		try {
			System.out.println("enter the username ");
			String username=sc.next();
			flage=validationService.validateUsername(username);
			System.out.println("Enter pasword");
			String password=sc.next();
			flage=validationService.validatePassword(password);
			if(flage) {
				System.out.println("welcome "+username);
			}
		} catch (NameExistsException e) {
			System.out.println(e.getMessage());
		} catch (TooShortException e) {
			System.out.println(e.getMessage());
		} catch (TooLongException e) {
			System.out.println(e.getMessage());
		}
	}

}
