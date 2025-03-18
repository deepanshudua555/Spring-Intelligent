package com.hatsu.schoolManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"", "/", "/home"})
    public String displayHomePage() {
//        model.addAttribute("username", "Deepanshu Dua");
        return "home.html";
    }

}
