package com.user.service.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contacts {
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;
}
