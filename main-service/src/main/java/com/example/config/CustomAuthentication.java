package com.example.config;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Component;

import java.util.Collection;
@ToString
public class CustomAuthentication extends JwtAuthenticationToken {

    public CustomAuthentication(
            Jwt jwt,
            Collection<? extends GrantedAuthority> authorities
            ) {
        super(jwt,authorities);
    }

}
