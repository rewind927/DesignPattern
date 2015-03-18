package com.design.pattern.singleton;

public class AccountClient {
    public static void main(String[] args) {
        ATM atmKH = new ATM();
        atmKH.deposit(3000);

        ATM atmTP = new ATM();
        atmTP.withdraw(5000);
    }
}
