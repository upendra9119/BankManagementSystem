package com.bms.model.Customer;

public class Customer {

    private String customerName;
    private int customerId;
    private String customerAddress;


    //constructor
    public Customer(String customerName, int customerId, String customerAddress) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
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

}
