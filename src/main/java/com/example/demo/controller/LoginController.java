package com.example.demo.controller;

import com.example.demo.model.LoginRequest;
import com.example.demo.model.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        if ("user".equals(request.getUsername()) && "password".equals(request.getPassword())) {
            return new LoginResponse(true, "Login successful");
        }
        return new LoginResponse(false, "Invalid credentials");
    }
}
