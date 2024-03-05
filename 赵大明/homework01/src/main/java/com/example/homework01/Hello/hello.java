package com.example.homework01.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping
    public String Hello() {
        return "hello world!";
    }
}
