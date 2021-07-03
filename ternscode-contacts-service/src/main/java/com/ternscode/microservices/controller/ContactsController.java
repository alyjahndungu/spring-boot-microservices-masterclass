package com.ternscode.microservices.controller;

import com.ternscode.microservices.entities.Contacts;
import com.ternscode.microservices.services.ContactsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactsController {
    private final ContactsService contactsService;
    @GetMapping("/user/{userId}")
    public List<Contacts> getContacts(@PathVariable("userId") Long userId) {
        return this.contactsService.getContactsOfUser(userId);
    }
}
