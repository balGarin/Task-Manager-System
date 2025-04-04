package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class SecurityUserConfig {


//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder(6);
//
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//        UserDetails user1 = User.withUsername("Dmitriy")
//                .password(passwordEncoder.encode("123456"))
//                .roles("ADMIN")
//                .build();
//        UserDetails user2 = User.withUsername("Anna")
//                .password(passwordEncoder.encode("qwertyu"))
//                .roles("USER")
//                .build();
//
//
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager(user1, user2);
//        return manager;
//
//    }







}
