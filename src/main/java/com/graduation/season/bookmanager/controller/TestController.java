package com.graduation.season.bookmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    /**
     * http://localhost:9527/getTest
     * @return
     */
    @GetMapping("/")
    public String getTest(){
        return "index.html";
    }


}
