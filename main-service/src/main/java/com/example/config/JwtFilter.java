package com.example.config;

import com.example.exception.IncorrectDataException;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

//@Component
//@AllArgsConstructor
//public class JwtFilter extends OncePerRequestFilter {
//    private final JwtUtil jwtUtil;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String authHeader = request.getHeader("Authorization");
//        String username = null;
//        String jwt = null;
//        if (authHeader != null&& authHeader.startsWith("Bearer ")){
//            jwt=authHeader.substring("Bearer ".length());
//            try{
//                username = jwtUtil.getUsername(jwt);
//            }catch (ExpiredJwtException e){
//                throw new IncorrectDataException("Время токена истекло");
//            }catch (SignatureException e){
//                throw  new IncorrectDataException("Не верная подпись");
//            }catch (Exception e){
//                throw new IncorrectDataException("Ошибка токена");
//
//            }
//        }
//        if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null){
//            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = null;
//            try {
//                 usernamePasswordAuthenticationToken =
//                        new UsernamePasswordAuthenticationToken(username,
//                                null,
//                                jwtUtil.getAuthorities(jwt).stream().map(SimpleGrantedAuthority::new).toList());
//            }catch (Exception e){
//                throw new IncorrectDataException("Ошибка токена");
//            }
//
//            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//            filterChain.doFilter(request,response);
//        }
//    }
//}
