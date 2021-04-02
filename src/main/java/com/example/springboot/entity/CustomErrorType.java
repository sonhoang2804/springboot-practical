package com.example.springboot.entity;

import lombok.Data;

@Data
public class CustomErrorType {

    private String errorMessage;

    public CustomErrorType (String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
