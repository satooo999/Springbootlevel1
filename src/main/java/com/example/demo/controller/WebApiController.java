package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class WebApiController {

    @RequestMapping("/hello")
    private String hello() {
        return "お疲れ様でした!!";
    }
}
