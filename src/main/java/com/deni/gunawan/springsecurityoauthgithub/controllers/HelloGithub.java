package com.deni.gunawan.springsecurityoauthgithub.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGithub {

    @GetMapping
    public String helloGithub(){
        return "Hello github ";

    }

    @GetMapping("/index")
    public String accessBerhasil(){
        return  "Selamat datang dihalaman github ";
    }

}
