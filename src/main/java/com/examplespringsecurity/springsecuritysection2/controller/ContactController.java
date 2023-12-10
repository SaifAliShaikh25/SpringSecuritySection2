package com.examplespringsecurity.springsecuritysection2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ContactController {

    @GetMapping("contacts")
    public String getMyContacts(){
        return "Here are my Contacts from DB";
    }
}
