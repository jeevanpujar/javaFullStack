package com.bankapp.service;

public class Savings extends Account {

	private static final double MINIMUM_BALANCE = 500;

    public Savings(double balance) {
        super(balance);  
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < MINIMUM_BALANCE) {
            System.out.println("Cannot withdraw: Minimum balance must be maintained!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

