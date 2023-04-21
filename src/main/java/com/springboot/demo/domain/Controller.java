package com.springboot.demo.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-boot")
public class Controller {
    @GetMapping()
    public String Controller(){

        return "Hello World!";
    }
}