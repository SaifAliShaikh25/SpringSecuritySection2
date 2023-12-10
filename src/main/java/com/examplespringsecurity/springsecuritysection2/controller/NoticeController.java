package com.examplespringsecurity.springsecuritysection2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NoticeController {

    @GetMapping("notices")
    public String getMyNotices(){
        return "Here are my notices from DB";
    }
}
