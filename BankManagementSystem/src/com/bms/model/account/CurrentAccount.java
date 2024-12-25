package com.bms.model.account;

import com.bms.model.Transaction.Transaction;

public class CurrentAccount extends Account {
    private double overdraftlimit;

    public CurrentAccount(long accountNo, double intialbalance, double overdraftlimit) {
        super(accountNo,intialbalance);
        this.overdraftlimit = overdraftlimit;

    }
    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount < overdraftlimit) {
           double balance = getBalance()-amount;
           //balance -= amount;
           System.out.println("withdrawnAmount : "+amount + " CurrentBalance: " + balance);
            addTransaction(new Transaction("Tranx" + System.currentTimeMillis(),
                    "withdraw",
                    amount,
                    balance));
        }
        else {
            System.out.println("your Overdraft Limit exceeded");
        }


    }

    @Override
    public double calculateIntrest() {
        return 0;
    }
}
