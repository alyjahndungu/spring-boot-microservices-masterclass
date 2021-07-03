package com.ternscode.microservices.services;

import com.ternscode.microservices.entities.Contacts;

import java.util.List;

public interface ContactsService {
    List<Contacts> getContactsOfUser(Long userId);
}
