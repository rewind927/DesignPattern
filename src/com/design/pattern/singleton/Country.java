package com.design.pattern.singleton;

public class Country {
    public static void main(String[] args) {

        //TODO add thread safe singleton
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Government governmentFortestTreadSafe = Government.getInstance();
                }
            }).start();
        }

        //TODO refactor with singleton pattern
        Government government = new Government();
        government.setOfficer(100);
        System.out.println("government has " + government.getOfficer() + " officers. \n");


        government = new Government();
        System.out.println("government has " + government.getOfficer() + " officers.");

    }
}
