package com.example.weddingdinner.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter @Setter
public class Response {
    private HttpStatus status;
    private String message;
}
