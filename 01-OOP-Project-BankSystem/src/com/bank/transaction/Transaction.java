package com.bank.transaction;

import java.time.LocalDateTime;

public class Transaction {
    private String accountNumber;
    private double amount;
    private LocalDateTime dateTime;
    private String type; // Deposit or Withdraw

    public Transaction(String accountNumber, double amount, String type) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.dateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return dateTime + " - " + type + " - " + accountNumber + " - " + amount;
    }
}
