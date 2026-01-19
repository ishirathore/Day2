package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Html {
    @GetMapping("/home")

    public String Hello(){
        return "index";
    }
    @GetMapping("/contact")
    public String Contact(){
        return "contact";
    }
    @GetMapping("/about")
    public String About(){
        return "about";
    }
}
