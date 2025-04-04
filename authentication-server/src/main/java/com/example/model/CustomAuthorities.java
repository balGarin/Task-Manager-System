package com.example.model;

import org.springframework.security.core.GrantedAuthority;

public class CustomAuthorities  implements GrantedAuthority {
    private String name;
    @Override
    public String getAuthority() {
        return name;
    }
}
