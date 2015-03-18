package com.design.pattern.singleton;

public class ATM {
    public void deposit(int depositMoney) {
        Account.getInstance().deposit(depositMoney);
    }

    public void withdraw(int withdrawMoney) {
        Account.getInstance().withdraw(withdrawMoney);
    }
}
