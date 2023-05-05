package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saludo {


    @GetMapping("/saludo")
    public String saludar(){
        return "Hola mundo";
    }

}
