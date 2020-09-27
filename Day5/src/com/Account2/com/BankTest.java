package com.Account2.com;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.addCustomer("Jane", "Smith");
		bank.getCustomer(0).setAccount(new Account(2000));
		bank.getCustomer(0).getAccount().withdraw(500);
	double balance=bank.getCustomer(0).getAccount().getBalance();//”‡∂Ó
	System.out.println(balance);
	}

}
