package com.jju;

public class SavingsAccount extends BankAccount {
    private double interestRate; 

  // 1. Student Task: Create constructor here 
    
 public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        // 2. Student Task: Implement interest application logic here
          double interest = balance * interestRate;
        deposit(interest);
    }

  // 3. Student Task: Create getter for interestRate here
    
    public double getInterestRate() {
    return interestRate;
}
}