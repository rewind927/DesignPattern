package com.design.pattern.singleton;

public class Account {
    private static Account account;
    private int money = 10000;

    private Account() {

    }

    public synchronized static Account getInstance() {
        if (account == null) {
            account = new Account();
        }
        return account;
    }

    public void deposit(int depositMoney) {
        money += depositMoney;
        System.out.println("deposit " + depositMoney + ", Account balance is "+money);
    }

    public void withdraw(int withdrawMoney) {
        money -= withdrawMoney;
        System.out.println("withdraw "+ withdrawMoney + ", Account balance is "+money);
    }
}
