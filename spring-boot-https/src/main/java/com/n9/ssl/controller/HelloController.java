package com.n9.ssl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello/ssl")
    public String helloSSL() {
        return "hello from SSL";
    }
}
