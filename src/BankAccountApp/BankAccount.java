package BankAccountApp;

import java.util.Random;

public class BankAccount {
    // Properties of a bank account
    private static int id = 1000;  // Internal id
    private String accountNumber;  // Id + random 2-digit number + first 2 of ssn
    private static final String routingNumber = "058664752025";
    private String name;
    private String ssn;
    private double balance;

    // Constructor(s)
    public BankAccount(String ssn, double initialDeposit) {
        this.ssn = ssn;
        setAccountNumber();
        this.balance = initialDeposit;
        id++;
    }

    // Getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setAccountNumber() {
        Random random = new Random();
        int randNum = random.nextInt(90) + 10;

        this.accountNumber = id + "" + randNum + "" + ssn.substring(0, 2);
        System.out.println(accountNumber);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        this.balance -= amount;
    }
}
