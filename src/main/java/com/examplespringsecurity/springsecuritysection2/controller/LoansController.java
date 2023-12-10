package com.examplespringsecurity.springsecuritysection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class LoansController {

    @GetMapping("myLoans")
    public String getMyLoans(){
        return "Here are my loans from DB";
    }
}
