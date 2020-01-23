package com.charel;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber("112233");
        account.setPin("123456");
        account.setBalance(100);
        account.setName("John Doe");

        System.out.printf("Name: %s, Account number: %s, PIN: %s, Balance: %d",
                account.getName(), account.getAccountNumber(), account.getPin(), account.getBalance());
    }
}
