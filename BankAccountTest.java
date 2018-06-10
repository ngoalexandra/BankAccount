package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount chase = new BankAccount();
		BankAccount bankofamerica = new BankAccount();
		
		double cashamount1 = 55.00;
		double cashamount2 = 200.00;
		double cashamount3 = 75.00;
		double cashamount4 = 1000.00;
		System.out.println("Chase Account: ");
		chase.deposit(cashamount2, "checkingBalance");
		chase.deposit(cashamount1, "savings");
		chase.getCheckings();
		chase.getSavings();
		chase.seeTotal();
		System.out.println("Bank of America Account: ");
		bankofamerica.deposit(cashamount3, "savings");
		bankofamerica.getSavings();
		bankofamerica.getCheckings();
		bankofamerica.seeTotal();
		bankofamerica.withdraw(cashamount4, "checkingBalance");
		System.out.println("Chase Account: ");
		chase.withdraw(cashamount4, "checkingBalance");

	}
}
