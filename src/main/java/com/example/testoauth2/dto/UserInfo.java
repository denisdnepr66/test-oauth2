package com.example.testoauth2.dto;

import java.util.List;

import lombok.Value;

@Value
public class UserInfo {
    private String id, displayName, email;
    private List<String> roles;
}
