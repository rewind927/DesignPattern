package com.design.pattern.mediator;

import java.util.Date;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User user1 = new User("Robert");
        User user2 = new User("John");

        //TODO:
        System.out.println(new Date().toString() + " [" + user1.getName() + "] : " + "Hi! John!");
        System.out.println(" [" + user2.getName() + "] be notified!");
        System.out.println(new Date().toString() + " [" + user2.getName() + "] : " + "Hello! Robert!");
        System.out.println(" [" + user1.getName() + "] be notified!");
    }

}
