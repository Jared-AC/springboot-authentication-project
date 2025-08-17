package com.example.demo.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MirestController {
@GetMapping ("/index")

public String index(){
    return "Hello, World!";
}

    
}
