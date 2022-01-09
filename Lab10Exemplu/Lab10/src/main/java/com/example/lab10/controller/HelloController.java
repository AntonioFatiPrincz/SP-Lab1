package com.example.lab10.controller;

import com.example.lab10.example.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {
   public final ClientComponent clientComponent;

   @Autowired
   public HelloController(ClientComponent clientComponent){

       this.clientComponent = clientComponent;
   }

    @GetMapping("")
    public  String hello() {
       return "Hello from SpringBoot and " + clientComponent;
   }

}
