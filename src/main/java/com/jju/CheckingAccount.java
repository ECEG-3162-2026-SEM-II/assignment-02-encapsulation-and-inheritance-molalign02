package com.jju;

public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50;

    public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }
  // 1. Student Task: Create constructor and call the superclass constructor and ensure balance is valid
    

   @Override
    public void withdraw(double amount) {
        // Define the variable
        double totalDeduction = amount + TRANSACTION_FEE;
       // 2. Student Task: Implement withdraw logic here

        if (amount > 0 && balance >= totalDeduction) {
            super.withdraw(totalDeduction);
        }
    }

    
}