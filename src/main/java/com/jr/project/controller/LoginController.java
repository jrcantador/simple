package com.jr.project.controller;

import com.jr.project.dto.Login;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
  
    @GetMapping
    public Login basicauth() {
        return new Login("You are authenticated");
    }
}
