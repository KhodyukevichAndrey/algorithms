package com.KA.algorithm.patterns.behavioral.mediator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SimpleTextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
