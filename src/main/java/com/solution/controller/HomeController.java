package com.solution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private Environment env;

    @GetMapping(path = "api")
    public @ResponseBody String welcome() {
        return "Welcome to WiFi-Analyzer API access";
    }

    @GetMapping(path = "api", params = "name")
    public @ ResponseBody String getName(@RequestParam(name = "name") String name) {
        return "Hi " + name;
    }

    @GetMapping(path = "api/{name}")
    public @ResponseBody String getNameAnotherWay(@PathVariable String name) {
        return "Hey " + name;
    }

    @GetMapping
    public String welcome(Model model) {
        String appName = env.getProperty("app.name");
        model.addAttribute("appName", appName);
        return "index";
    }

}