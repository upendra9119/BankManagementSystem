package com.bms.model.account;

public class SavingsAccount extends Account {

    private double intrestRate;

    public SavingsAccount (long accountNumber,double intialBalance, double intrestRate) {
       super( accountNumber,intialBalance);
       this.intrestRate = intrestRate;

    }
    @Override
    public double calculateIntrest() {

        double intrestAmount = getBalance() * intrestRate;
        return intrestAmount;
    }
}
