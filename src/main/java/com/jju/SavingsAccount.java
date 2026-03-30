package com.jju;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        // Must be the first line
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        // Reusing deposit logic from parent
        deposit(interest);
    }
}

