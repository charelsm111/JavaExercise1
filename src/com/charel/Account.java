package com.charel;

public class Account {

    private String accountNumber;
    private String pin;
    private String name;
    private Integer balance;

    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    String getAccountNumber() {
        return this.accountNumber;
    }

    void setPin(String pin) {
        this.pin = pin;
    }

    String getPin() {
        return pin;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setBalance(Integer balance) {
        this.balance = balance;
    }

    Integer getBalance() {
        return this.balance;
    }
}
