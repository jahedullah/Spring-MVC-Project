package com.Jahedul.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String showLoginPage(){

        return "login-page";
    }

    @RequestMapping("/user-homepage")
    public String showUserHomePage(){

        return "user-homepage";
    }
}
