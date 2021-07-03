package com.ternscode.microservices.services;

import com.ternscode.microservices.entities.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactsServiceImpl implements ContactsService{
    List<Contacts> list = List.of(
            new Contacts(1L, "jeffbezos@gmail.com", "Bezos", 1311L),
            new Contacts(2L, "larryopen@gmail.com", "Larry", 1311L),
            new Contacts(3L, "rohanmorgan@gmail.com", "Morgan", 1312L),
            new Contacts(4L, "shashabanks@gmail.com", "Shasha", 1314L)
    );


    @Override
    public List<Contacts> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId()
                .equals(userId)).collect(Collectors.toList());
    }
}
