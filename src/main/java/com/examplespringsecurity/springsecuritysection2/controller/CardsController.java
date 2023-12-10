package com.examplespringsecurity.springsecuritysection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CardsController {

    @GetMapping("myCards")
    public String getMyCards(){
        return "Here are my card details from DB";
    }
}
