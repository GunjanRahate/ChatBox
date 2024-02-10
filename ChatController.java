package com.webistic.chatbox1.controller;

// ChatController.java

import org.springframework.web.bind.annotation.*;
;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @GetMapping("/")
    public String showChat() {
        return "chat";
    }
}
