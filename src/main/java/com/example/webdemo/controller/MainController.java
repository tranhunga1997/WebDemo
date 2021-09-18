package com.example.webdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"","/"})
public class MainController {

    @GetMapping
    public ResponseEntity<String> Home(){
        return ResponseEntity.ok("Hello World");
    }
}
