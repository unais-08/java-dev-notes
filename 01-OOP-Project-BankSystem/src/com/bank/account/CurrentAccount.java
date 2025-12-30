package com.bank.account;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Exceeded overdraft limit!");
        }
    }
}