package com.example.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping  //경로 지정가능
    public String index(){
        return "index";
    }

}
