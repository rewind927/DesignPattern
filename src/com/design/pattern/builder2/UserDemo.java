package com.design.pattern.builder2;

import com.design.pattern.builder2.User;

public class UserDemo {
    public static void main(String[] args) {

        User userKaren = new User.UserBuilder("Karen", "Lin").build();

        System.out.println("User's first Name: " + userKaren.getFirstName());
        System.out.println("User's last Name: " + userKaren.getLastName());
        System.out.println("User's age: " + userKaren.getAge());
        System.out.println("User's phone: " + userKaren.getPhone());
        System.out.println("User's address: " + userKaren.getAddress() + "\n");


        //TODO User: Grass Dig, Age: 18, Phone: 7533967, Address: Taipei

    }
}
