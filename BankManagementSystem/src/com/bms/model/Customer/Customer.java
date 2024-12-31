package com.bms.model.Customer;

import com.bms.model.account.Account;

import java.util.ArrayList;
import java.util.List;

public class Customer{

    private String customerName;
    private int customerId;
    private String customerAddress;
    private List<Account> accountlist;


    //constructor
    public Customer(String customerName, int customerId, String customerAddress) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.accountlist = new ArrayList<Account>();
    }


    //getter setter to ensure encapsulation
    //why we are setting getters and setters as public

    public  String getcustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName=customerName;
    }

    public int getcustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public String getcustomerAddress(){
        return customerAddress;
    }
    public void setcustomerAddress(String customerAddress){
        this.customerAddress=customerAddress;
    }

    //to string method

    public String toString(){
        return "customerName: " +customerName + ", customerId: " + customerId + ", customerAddress: " + customerAddress;

    }

    public void add(Account account){
        accountlist.add(account);
        System.out.println("Account added successfully  ; " +account);
    }
    public List<Account> getaccountlist() {
        return accountlist;
    }

    //remove an account by account number
    public boolean remove(long accountNumber){
        Account account = getaccountbynumber(accountNumber);
        if(account != null){
            accountlist.remove(account);
            System.out.println("Account removed successfully  ; " +account);
            return true;
        }

        else{
            System.out.println("No account found.");
            return false;
        }

    }

    //a method to get account by using account number. we can use this method in remove account method above
    private Account getaccountbynumber(long accountNumber) {
        for (Account account : accountlist){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;

    }

    public void generateAccountSummary(Account account){
        System.out.println("Account summary of customer :"+customerName);
        System.out.println("Account Number : "+ account.getAccountNumber());
        System.out.println("Account Type : " +account.getAccountType());
        System.out.println("Account Balance :" +account.getBalance());
        System.out.println("Total deposits :" +account.TotalDeposits());
        System.out.println("Total withdraws :" +account.TotalWithdrawals());
        System.out.println("Total number of Transactions :"+account.totalTransactions());



    }

}
