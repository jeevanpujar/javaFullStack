package com.sristi.basics.virtualATMapplication;

public class Current extends Bank{

	public Current(double balance,String accountHolderName) {
		super(balance,accountHolderName);
	}

	@Override
	void withdraw(double amount) {
		//checking the extra charges for this transaction
		if(amount>=balance+100) {
			balance -= amount;
            System.out.println(amount+" Withdrawal successful");
        } else {
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
