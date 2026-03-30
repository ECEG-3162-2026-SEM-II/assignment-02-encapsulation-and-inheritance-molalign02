package com.jju;

public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50;

    public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double totalDeduction = amount + TRANSACTION_FEE;
        
        // Rule: Only perform withdrawal if balance covers amount + fee
        if (amount > 0 && balance >= totalDeduction) {
            // Use super.withdraw to perform the actual math on the balance
            super.withdraw(totalDeduction);
        }
    }
}

