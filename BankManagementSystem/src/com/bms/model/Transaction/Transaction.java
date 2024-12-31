package com.bms.model.Transaction;

import java.time.LocalDateTime;

public class Transaction {

    String transactionId;
    String transactionType;
    double amount;
    double postbalance;
    LocalDateTime timestamp;


    public String getTransactionId() {
        return transactionId;
    }
   public String getTransactionType() {
        return transactionType;
   }
   public double getAmount() {
        return amount;
   }
   public double getPostbalance() {
        return postbalance;
   }
   public LocalDateTime getTimestamp() {
        return timestamp;
   }

    public Transaction(String transactionId, String transactionType, double amount, double postbalance) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.postbalance = postbalance;
        this.timestamp = LocalDateTime.now();
    }


    public String toString() {
        return "transactionId=" + transactionId + ", transactionType=" + transactionType + ", amount=" + amount + ", postbalance=" + postbalance + ", timestamp=" + timestamp;
    }

}
