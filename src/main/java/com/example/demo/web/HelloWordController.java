package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping("/hello")
    public  String hello(@RequestParam(value = "name") String name) {
        return "Hey " + name;
    }
}
