package com.codingdojo.ali.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingBalance;
	
	public static int numberOfAccounts;
	public static int totalAmountStored;
	private static Random random = new Random();
	
	//New account random number generator
	private static String randomNumberGenerator() {
		return Integer.toString(random.nextInt((1000000000)+1000000000));
	}
	
	public BankAccount() {
		this.accountNumber = BankAccount.randomNumberGenerator();
		this.checkingBalance = 0;
		this.savingBalance = 0;
		numberOfAccounts++;
		
	}
	
	//Class member that tracks the total amount of money stored in every account created.
	public BankAccount(double checkingBalance, double savingBalance) {
		this.accountNumber = BankAccount.randomNumberGenerator();
		this.checkingBalance = checkingBalance;
		this.savingBalance = savingBalance;
		numberOfAccounts++;
		totalAmountStored +=(this.checkingBalance + this.savingBalance);
	}
	
	//Getter and setter method for the user's checking account balance
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	//Getter and setter method for the user's saving account balance
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	//Method that will allow a user to deposit money into either the checking or saving, 
	//and add to total amount stored.
	public void depositMoney(double depositAmount, String accountType) {
		if (accountType == "checkingBalance" || accountType == "checking") {
			this.checkingBalance += depositAmount;
			totalAmountStored += depositAmount;
			System.out.println("$" + depositAmount + " was deposited into your checkings account #" + this.accountNumber);
		}
		else if (accountType =="savingAccount" || accountType == "saving") {
			this.savingBalance += depositAmount;
			totalAmountStored += depositAmount;
			System.out.println("$" + depositAmount + " was deposited into your savings account #" + this.accountNumber);
		}
		else {
			System.out.println("Say something I'm giving up on you!");
		}
	}
	
	//Method that will allow a user to withdraw money from either the checking or saving, 
	//and subtract from total amount stored.
	public void withdrawMoney(double withdrawAmount, String accountType) {
		if (accountType == "checkingBalance" || accountType == "checking") {
			if (withdrawAmount <= this.checkingBalance) {
				this.checkingBalance -= withdrawAmount;
				totalAmountStored -= withdrawAmount;
				System.out.println("$" + withdrawAmount + " was withdrawn from your checking account #" + this.accountNumber);
			}
			else {
				System.out.println("Oh dear, your checking account has not enough funds to proceed :(");
				System.out.println("Your checking account balance is: $" + this.getCheckingBalance());
			}
		}
		else if (accountType == "savingBalance" || accountType == "saving") {
			if (withdrawAmount <= this.savingBalance) {
				this.savingBalance -= withdrawAmount;
				totalAmountStored -= withdrawAmount;
				System.out.println("$" + withdrawAmount + " was withdrawn from your saving account #" + this.accountNumber);
			}
			else {
				System.out.println("Oh dear, your saving account has not enough funds to proceed :(");
				System.out.println("Your saving account balance is: $" + this.getSavingBalance());
			}
		}
		else {
			System.out.println ("Are you sure you are not ging me a bulls**t?!?!");
		}
	}
	
	//Total account balance in the bank:
	public void accountBalance() {
		System.out.println("Total balance is: $" + (this.getCheckingBalance() + this.getSavingBalance()));
	}
	
}
