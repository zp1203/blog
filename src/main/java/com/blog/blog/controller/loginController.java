package com.blog.blog.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @CrossOrigin
    @GetMapping(value = "/api/login")
    public String login(@RequestParam String username, @RequestParam String password){
        if(!StringUtils.isEmpty(username)&&!StringUtils.isEmpty(password)){
            if(password.equals("123")) return "success";
        }
        return "false";
    }
}
