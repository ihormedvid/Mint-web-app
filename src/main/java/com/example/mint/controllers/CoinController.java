package com.example.mint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoinController {
    @GetMapping("/")
    public String coins(){
        return "coins";
    }
}
