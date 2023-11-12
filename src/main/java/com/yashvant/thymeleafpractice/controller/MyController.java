package com.yashvant.thymeleafpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about() {
        System.out.println("Inside about() method");
        return "about";
        //about.html
    }
}
