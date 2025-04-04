package com.example.config;

import io.jsonwebtoken.*;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.rsocket.RSocketSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.DefaultUriBuilderFactory;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.*;

//@Component
//public class JwtUtil {
//
//    private final String keyUrl;
//
//    private final RestTemplate template;
//
//
//    public JwtUtil(JwtAuthenticationConverter converter, @Value("${keySetURI}") String keyUrl, RestTemplateBuilder builder) {
//        this.keyUrl = keyUrl;
//        this.template = builder
//                .uriTemplateHandler(new DefaultUriBuilderFactory(keyUrl))
//                .requestFactory(() -> new HttpComponentsClientHttpRequestFactory())
//                .build();
//    }
//
//
//    private PrivateKey getSecret() throws Exception{
//        String secret = template.exchange("", HttpMethod.GET, new HttpEntity<>(defaultHeaders()), String.class).getBody();
//        byte[] keyBites = Base64.getDecoder().decode(secret);
//        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBites);
//        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//        return keyFactory.generatePrivate(keySpec);
//
//    }
//
//
//    public String getUsername(String token) throws Exception {
//        return getAllClaimsFromToken(token).getSubject();
//    }
//
//
//    public List<String> getAuthorities(String token)throws Exception {
//        return getAllClaimsFromToken(token).get("Authorities", List.class);
//    }
//
//
//    private Claims getAllClaimsFromToken(String token)throws Exception {
//        return Jwts.parser()
//                .decryptWith(getSecret())
//                .build()
//                .parseEncryptedClaims(token).getPayload();
//    }
//
//
//    private HttpHeaders defaultHeaders() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
//        return headers;
//    }
//}

