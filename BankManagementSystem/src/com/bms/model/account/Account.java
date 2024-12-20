package com.bms.model.account;

//why we made Accound class as an abstract class
/*The Account class is created as abstract because we are using it as a base class that will define common behavior and properties for all types of accounts, but it doesn't make sense to instantiate it directly. The abstract keyword ensures that we cannot create objects of the Account class directly, and it allows us to define abstract methods (like calculateInterest()) that must be implemented by concrete subclasses of Account.

Here’s why we use abstract for the Account class:

1. Shared Functionality for All Account Types (Code Reusability)
The Account class holds common functionality like deposit(), withdraw(), and balance management, which can be shared across all types of accounts (like SavingsAccount, CurrentAccount, etc.). By making it abstract, we define the core behaviors that will be inherited by subclasses. This prevents us from duplicating the same code in every account type.

2. Enforcement of Custom Behavior (Polymorphism)
The Account class declares an abstract method for calculateInterest(). This forces subclasses to provide their own implementation for how interest is calculated, depending on the type of account. For example, a SavingsAccount might calculate interest differently from a CurrentAccount.

Without making Account abstract, we could potentially create a generic Account class with a calculateInterest() method that might not apply in all cases. By making it abstract, we ensure that each subclass must provide its own version of the method.

3. Preventing Direct Instantiation of Base Account Class
Since Account is meant to be a general representation of an account, and we don’t want users to create a generic "Account" object directly (because it doesn’t represent a real account without more specific details like interest rates or account types), we make the class abstract. */


public abstract class Account {
    private long accountNumber;
    private double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public abstract double calculateIntrest();

    public double deposit(double deposit) {

        if(deposit>0){
            balance += deposit;
            System.out.println("deposit amount: "+deposit + " balance: "+balance);
        }
        else{
            System.out.println("Invalid deposit");
        }
        return balance;

    }
    public void withdraw(double withdraw){
        if(withdraw>0 && withdraw<balance){
            balance -=withdraw;
            System.out.println("withdraw amount: "+withdraw + " balance: "+balance);
        }
        else{
            System.out.println("Invalid withdraw");
        }

    }
}
