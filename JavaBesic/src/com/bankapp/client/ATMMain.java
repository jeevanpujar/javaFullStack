package com.bankapp.client;

import java.util.Scanner;

import com.bankapp.service.Account;
import com.bankapp.service.Current;
import com.bankapp.service.Savings;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account type \n 1. Current \n 2. Savings");
		int n = sc.nextInt();
		Account account = null;

		switch (n) {
		case 1:
			account = new Current(20000);
			break;
		case 2:
			account = new Savings(10000);
			break;
		default:
			System.out.println("Invalid option");
		}

		System.out.println("Choose an action: \n 1. Withdraw \n 2. Deposit \n 3. Get Balance");
		n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Enter amount to withdraw:");
			double withdrawAmount = sc.nextDouble();
			account.withdraw(withdrawAmount);
			break;
		case 2:
			System.out.println("Enter amount to deposit:");
			double depositAmount = sc.nextDouble();
			account.deposit(depositAmount);
			break;
		case 3:
			System.out.println("Current balance: " + account.getBalance());
			break;
		default:
			System.out.println("Invalid choice.");
		}

		sc.close();
	}
}