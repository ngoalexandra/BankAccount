package com.codingdojo.bankaccount;
public class BankAccount {
	//	class attributes
	public long accountNumber;
	public double checkingBalance;
	public double savings;
	//	static variables are made to be used for every instance
	public static int numOfAccounts = 0;
	public static int total = 0;
	//	constructor method
	public BankAccount(){
		numOfAccounts ++;
		this.accountNumber = accountNum();		
	}
	//	long is used instead of int because we are returning a longer number
	private long accountNum() {
		long account_num = (long) Math.floor(Math.random()* 9_000_0000) + 10_000_00000;
		return account_num;
	}
	//	every time you have a getter method, you need to return
	public double getCheckings() {
		System.out.println("Your checking balance: " + this.checkingBalance);
		return this.checkingBalance;
	}
	public double getSavings() {
		System.out.println("Your savings balance: " + this.savings);
		return this.savings;
	}
	public void deposit(double amount, String account_type) {
		if (account_type.equals("checkingBalance")) {
			System.out.println("current checking balance: " + this.checkingBalance);
			this.checkingBalance = this.checkingBalance + amount;
			System.out.println("After deposit your checking balance is now: " + this.checkingBalance);
		}
		else {
				//	if the account type is not checkingBalance, then account type must be savings		
				System.out.println("current savings balance: " + this.savings);
				this.savings = this.savings + amount;
				System.out.println("After deposit your savings balance is now: " + this.savings);		
		}
		total += amount;
		System.out.println("Current total: $" + total);

	}
	
	public void withdraw(double withdrawAmount, String accountType) {
		if (accountType.equals("checkingBalance")) {
			if(withdrawAmount > this.checkingBalance) {
				System.out.println("You cannot withdraw, there are insufficient funds");
			}
			else {
				this.checkingBalance = this.checkingBalance - withdrawAmount; 
			}
		}
	}
	
	public double seeTotal() {
		System.out.println("Account # " + accountNumber + " currently has " + "$" + total);
		return total;
		
		
	}
	

}
