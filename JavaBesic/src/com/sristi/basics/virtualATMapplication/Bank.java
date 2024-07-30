package com.sristi.basics.virtualATMapplication;

public abstract class Bank {
	double balance;
    String accountHolderName;

    public Bank(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    abstract void withdraw(double amount);

    abstract void deposit(double amount);

}
