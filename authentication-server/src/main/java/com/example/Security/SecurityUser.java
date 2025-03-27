package com.example.Security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class SecurityUser {
    private Long id;
    private String name;
    private String password;
    private String email;
    private String authority;
}
