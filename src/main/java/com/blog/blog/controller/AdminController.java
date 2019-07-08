package com.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Administrator
 * @Date 2019/7/7 23:31
 * @Description TODO
 **/
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @RequestMapping(value = "/login")
    public String login(){
        return "admin/login";
    }
}
