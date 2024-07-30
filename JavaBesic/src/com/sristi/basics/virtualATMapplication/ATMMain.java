package com.sristi.basics.virtualATMapplication;

import java.util.Scanner;

public class ATMMain {
    private static final String[] PINS = {"1234", "2345", "3456"};
    private static Bank[] accounts = new Bank[3];
    private static String[][] transactionHistories = new String[3][100];
    private static int[] transactionCounts = new int[3];

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        accounts[0] = new Savings(10000, "Jeevan");
        accounts[1] = new Current(20000, "Pramod");
        accounts[2] = new Savings(15000, "Prakash");

        addInitialTransaction(0, "Deposited: 5000");
        addInitialTransaction(0, "Withdrew: 2000");
        addInitialTransaction(1, "Deposited: 10000");
        addInitialTransaction(1, "Withdrew: 5000");
        addInitialTransaction(2, "Deposited: 3000");
        addInitialTransaction(2, "Withdrew: 1000");


        System.out.println("Welcome to the Virtual ATM!");
        Bank userAccount = authenticateUser(scanner);
        if (userAccount == null) {
            System.out.println("Wrong PIN. Exiting...");
            return;
        }

        int userIndex = getUserIndex(userAccount);

        System.out.println("Hello, " + userAccount.accountHolderName + "!");

        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + userAccount.balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    addTransaction(userIndex, "Deposited: " + depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    addTransaction(userIndex, "Withdrew: " + withdrawAmount);
                    break;
                case 4:
                    displayTransactionHistory(userIndex);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the ATM!");
    }

    private static Bank authenticateUser(Scanner scanner) {
        System.out.println("Please enter your 4-digit PIN:");
        String enteredPin = scanner.next();
        for (int i = 0; i < PINS.length; i++) {
            if (PINS[i].equals(enteredPin)) {
                return accounts[i];
            }
        }
        return null;
    }

    private static int getUserIndex(Bank userAccount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == userAccount) {
                return i;
            }
        }
        return -1;
    }

    private static void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. View Transaction History");
        System.out.println("5. Exit");
    }

    private static void addTransaction(int userIndex, String transaction) {
        if (transactionCounts[userIndex] < transactionHistories[userIndex].length) {
            transactionHistories[userIndex][transactionCounts[userIndex]++] = transaction;
        } else {
            System.out.println("Transaction history is full.");
        }
    }

    private static void addInitialTransaction(int userIndex, String transaction) {
        transactionHistories[userIndex][transactionCounts[userIndex]++] = transaction;
    }

    private static void displayTransactionHistory(int userIndex) {
        System.out.println("\nTransaction History:");
        if (transactionCounts[userIndex] == 0) {
            System.out.println("No transactions yet.");
        } else {
            for (int i = 0; i < transactionCounts[userIndex]; i++) {
                System.out.println(transactionHistories[userIndex][i]);
            }
        }
    }
}
