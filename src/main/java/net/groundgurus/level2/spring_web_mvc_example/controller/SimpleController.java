package net.groundgurus.level2.spring_web_mvc_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class SimpleController {
    @GetMapping
    public String home(Map<String, Object> model) {
        model.put("name", "Guest");
        return "index";
    }
}
