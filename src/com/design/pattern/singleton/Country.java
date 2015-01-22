package com.design.pattern.singleton;

public class Country {
    public static void main(String[] args) {
        Government government = new Government();
        government.setOfficer(100);
        System.out.println("government has "+government.getOfficer()+" officers. \n");


        government = new Government();
        System.out.println("government has "+government.getOfficer()+" officers.");
    }
}
