package com.example.service;

import com.example.config.CustomUserDetails;
import com.example.model.SecurityUser;
import com.example.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomUserDetailsManager implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        SecurityUser user = userRepository.findByEmail(email)
                .orElseThrow(()-> new RuntimeException("Пользователь не найден"));
        return  new CustomUserDetails(user);
    }
}
