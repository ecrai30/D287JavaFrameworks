package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class AboutController {

    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // This will return the about.html template
    }
}
