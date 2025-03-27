package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

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




    @Bean
    public UserDetailsService userDetailsService() {
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager();
        String usersByUsernameQuery = "select username,password,email,enabled from users where email = ?";
        manager.setUsersByUsernameQuery(usersByUsernameQuery);
        return manager;
    }


}
