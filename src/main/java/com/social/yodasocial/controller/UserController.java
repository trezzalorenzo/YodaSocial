package com.social.yodasocial.controller;

import com.social.yodasocial.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UsersService usersService;

    @GetMapping("/list")
    public List<String> getUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id, @RequestParam(required = false) String name){
        try{
            return usersService.getUserById(id);
        } catch (Exception e){
            return "ERRORE";
        }

    }

}
