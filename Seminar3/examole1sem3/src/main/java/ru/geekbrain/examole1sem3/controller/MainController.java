package ru.geekbrain.examole1sem3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/homeTest")
    public String home(){
        return "homeTest.html";
    }

    @RequestMapping("/cats")
    public String cats(){
        return "cats.html";
    }
}
