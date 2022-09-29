package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/hello")
    String hello(String username, Model model)
    {
        model.addAttribute("username", username);
        return "hello";
    }

}
