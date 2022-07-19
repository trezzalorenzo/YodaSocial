package com.social.yodasocial.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
    private List<String> users;

    public UsersService() {
        this.users = new ArrayList<>();
        users.add("pippo");
        users.add("topolino");
        users.add("paperino");
    }

    public List<String> getAllUsers() {
        return users;
    }

    public String getUserById(int id) {
        if (id <= users.size()) {
            return users.get(id);
        }
        throw new IllegalArgumentException();
    }
}
