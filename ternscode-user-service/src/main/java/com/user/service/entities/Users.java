package com.user.service.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Users {
    private Long userId;
    private String name;
    private String phone;
    List<Contacts> contacts=new ArrayList<>();

    public Users(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public Users(Long userId, String name, String phone, List<Contacts> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }
}
