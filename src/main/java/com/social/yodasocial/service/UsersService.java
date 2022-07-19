package com.social.yodasocial.service;

import com.social.yodasocial.entities.User;
import com.social.yodasocial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UserRepository userRepository;
    private List<String> users;

    public UsersService() {
        this.users = new ArrayList<>();
        users.add("pippo");
        users.add("topolino");
        users.add("paperino");
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        throw new IllegalArgumentException();
    }
}
