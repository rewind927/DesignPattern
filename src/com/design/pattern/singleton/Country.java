package com.design.pattern.singleton;

public class Country {
    public static void main(String[] args) {
        Government government = Government.getInstance();
        government.setOfficer(100);
        System.out.println("government has "+government.getOfficer()+" officers. \n");


        government = Government.getInstance();
        System.out.println("government has "+government.getOfficer()+" officers.");
    }
}
