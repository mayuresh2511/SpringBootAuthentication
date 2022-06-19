package com.example.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/")
  public String welcomePage(){
    return "Welcome to home page";
  }

  @GetMapping("/user")
  public String userPage(){
    return "Welcome user";
  }

  @GetMapping("/admin")
  public String adminPage(){
    return "Welcome admin";
  }
}
