package com.example.controller;

import com.example.model.user.User;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTaskController {

    @GetMapping("/hello")
    public String getHello(Authentication authentication){
        return authentication.getAuthorities().toString();
    }

    @GetMapping("/by")
    public Authentication getBy(Authentication authentication){
        return authentication;
    }
}
