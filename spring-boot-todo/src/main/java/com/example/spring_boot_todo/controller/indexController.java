package com.example.spring_boot_todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

  // http:localhost:8080 -> "Hello, world!"
  // GET / -> "Hello, world!"

  @GetMapping
  public String index() {
    return "index";
  }
}
