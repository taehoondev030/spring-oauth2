package com.example.simple_todo_list.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody // 응답 body를 보내줌
    public String mainAPI() {
        return "main route";
    }
}
