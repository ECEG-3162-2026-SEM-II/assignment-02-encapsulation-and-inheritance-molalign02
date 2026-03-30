package com.jju;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Testing Savings Account ---");
        // Initial balance 1000, Interest rate 0.05 (5%)
        SavingsAccount savings = new SavingsAccount("Alice", 1000.0, 0.05);
        System.out.println("Initial Balance: $" + savings.getBalance());
        
        savings.applyInterest(); // Should add $50.0
        System.out.println("After Interest: $" + savings.getBalance());
        
        savings.deposit(200);
        System.out.println("After $200 Deposit: $" + savings.getBalance());

        System.out.println("\n--- Testing Checking Account ---");
        // Initial balance 100
        CheckingAccount checking = new CheckingAccount("Bob", 100.0);
        System.out.println("Initial Balance: $" + checking.getBalance());
        
        // Test withdrawal with fee
        checking.withdraw(20.0); // Should deduct 20.0 + 1.50 = 21.50
        System.out.println("After $20 Withdrawal (inc. $1.50 fee): $" + checking.getBalance());
        
        // Test overdraft protection (Insufficient funds for amount + fee)
        System.out.println("Attempting to withdraw $80 (Total $81.50)...");
        checking.withdraw(80.0); 
        System.out.println("Balance after failed withdrawal: $" + checking.getBalance());

        System.out.println("\n--- Testing Negative Initial Balance ---");
        BankAccount badAccount = new BankAccount("Charlie", -500.0);
        System.out.println("Charlie's Balance (should be 0.0): $" + badAccount.getBalance());
    }
}


