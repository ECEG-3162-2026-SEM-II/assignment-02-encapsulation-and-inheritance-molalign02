package com.jju;
public class BankAccount {
    private String accountHolder;
    protected double balance; // Protected so subclasses can see it, but not the public

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Student Task: Ensure balance cannot be negative during initialization
         this.balance = (initialBalance < 0) ? 0.0 : initialBalance;
    }

    public void deposit(double amount) {
        // Student Task: Implement deposit logic with validation
          if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        // Student Task: Implement withdrawal logic (prevent overdraft)
           if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public String getAccountHolder() {
    return accountHolder;
}
    public double getBalance() {
        return balance;
    }
}