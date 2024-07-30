package com.sristi.basics.virtualATMapplication;

public class Savings extends Bank {

	public Savings(double balance,String accountHolderName) {
		super(balance,accountHolderName);
	}

	@Override
	void withdraw(double amount) {
		if(amount<=balance) {
			System.out.println("Withdrawal successful :"+amount);
			balance-=amount;
			System.out.println("Balance amount : "+balance);
		}else {
            System.out.println("Insufficient funds");
        }
		
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit Amount="+amount);
		balance += amount;
	    System.out.println("Deposit successful\n total balance: "+ balance);
		
	}

	

}
