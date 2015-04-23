package com.design.pattern.mediator;

import java.util.ArrayList;
import java.util.Date;

public class ChatRoom {
    public ArrayList<User> users = new ArrayList<User>();

    public void registerUser(User user) {
        users.add(user);
    }

    public void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
        for (User targetUser: users) {
            if (targetUser != user) {
                System.out.println(" [" + targetUser.getName() + "] be notified!");
            }
        }
    }

}
