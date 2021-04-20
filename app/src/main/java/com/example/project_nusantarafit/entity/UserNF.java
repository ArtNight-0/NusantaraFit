package com.example.project_nusantarafit.entity;

public class UserNF {
    private String username, email, password;

    public UserNF(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public UserNF() {
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
