package com.design.pattern.mediator;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User robert = new User("Robert", chatRoom);
        User john = new User("John", chatRoom);

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
