package com.example.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
public class ErrorResponse {
    private HttpStatus status;
    private String reason;
    private String message;
    private String timestamp;
}
