package com.ternscode.microservices.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contacts {
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;

    public Contacts(Long cId, String email, String contactName, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }
}
