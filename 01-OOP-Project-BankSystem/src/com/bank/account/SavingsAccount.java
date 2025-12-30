package com.bank.account;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest added. New balance: " + balance);
    }
}
