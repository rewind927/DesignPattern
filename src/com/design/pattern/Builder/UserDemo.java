package com.design.pattern.Builder;

public class UserDemo {
    public static void main(String args[]) {
        User user = new User("Karen", "Lin", 29);

        UserJavaBeans userJavaBeans = new UserJavaBeans("Karen", "Lin");
        userJavaBeans.setPhone("0988888888");

        System.out.println("User's first Name: " + userJavaBeans.getFirstName());
        System.out.println("User's last Name: " + userJavaBeans.getLastName());
        System.out.println("User's age: " + userJavaBeans.getAge());
        System.out.println("User's phone: " + userJavaBeans.getPhone());
        System.out.println("User's address: " + userJavaBeans.getAddress());

    }
}
