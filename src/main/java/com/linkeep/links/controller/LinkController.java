package com.linkeep.links.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/links")
public class LinkController{
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
}