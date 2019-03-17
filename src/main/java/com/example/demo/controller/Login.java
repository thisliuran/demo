package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {

    @GetMapping("login.html")
    public String getLogin(){

        return "login.html";
    }
}
