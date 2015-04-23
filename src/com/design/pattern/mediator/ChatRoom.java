package com.design.pattern.mediator;

import java.util.ArrayList;

public class ChatRoom {
    public ArrayList<User> users;

    public void registerUser(User user) {
        users.add(user);
    }

    public void showMessage(User user, String message){
        //TODO
    }
}
