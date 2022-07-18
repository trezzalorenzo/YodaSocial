package com.social.yodasocial.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("/list")
    public String getUsers(){
        return "LIST USER";
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id, @RequestParam(required = false) String name){
        if(name == null) return "ERRORE";
        return "USER  " + id + " " +name;
    }

}
