package com.yashvant.thymeleafpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about(Model model) {
        System.out.println("Inside about() method");

        model.addAttribute("name", "Yashvant Yadav");
        model.addAttribute("currentDate", new java.util.Date().toString());

        return "about";
        //about.html
    }
}
