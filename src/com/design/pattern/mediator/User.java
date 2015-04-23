package com.design.pattern.mediator;

public class User {
    public String name;
    public ChatRoom chatRoom;
    public String getName() {
        return name;
    }

    public User(String name, ChatRoom chatRoom){
        this.name  = name;
        this.chatRoom = chatRoom;
        chatRoom.registerUser(this);
    }

    public void sendMessage(String message){
        chatRoom.showMessage(this, message);
    }
}
