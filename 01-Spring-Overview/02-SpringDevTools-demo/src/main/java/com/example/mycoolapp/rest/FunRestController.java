package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String Hello(){
        return "Hello World !" ;
    }

    @GetMapping("/users")
    public String users(){ return "This is userEndpoint";}
}
