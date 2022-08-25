package oop;

/* This program will demonstrate the use of methods  */

public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Hello");
        System.out.println("Your balance is $" + balance);
    }

    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
        System.out.println("You just deposited $" + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {
        balance -= amountToWithdraw;
        System.out.println("You just withdrew $" + amountToWithdraw);
        return amountToWithdraw;
    }

    public String toString() {
        return "This is a savings account with $" + balance + " saved.";
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);
        savings.checkBalance();
        savings.withdraw(200);
        savings.checkBalance();
        savings.deposit(500);
        savings.checkBalance();
        
        System.out.println(savings);
    }
}