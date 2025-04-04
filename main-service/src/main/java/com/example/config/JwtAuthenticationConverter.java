package com.example.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JwtAuthenticationConverter implements Converter<Jwt, CustomAuthentication> {
    @Override
    public CustomAuthentication convert(Jwt source) {
        List<GrantedAuthority> authorities = parseAuthorities(String.valueOf(source.getClaims().get("authorities")));
        return new CustomAuthentication(source, authorities);

    }


    private List<GrantedAuthority> parseAuthorities(String authorities) {
        String cleanAuthority = authorities.substring(1).substring(0, authorities.length() - 2);
        return AuthorityUtils.createAuthorityList(cleanAuthority);
    }
}
