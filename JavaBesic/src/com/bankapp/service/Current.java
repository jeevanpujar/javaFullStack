package com.bankapp.service;

public class Current extends Account {
	private static final double OVERDRAFT_LIMIT = 1000;

    public Current(double balance) {
        super(balance);  
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < OVERDRAFT_LIMIT) {
            System.out.println("Overdraft limit exceeded!");
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
