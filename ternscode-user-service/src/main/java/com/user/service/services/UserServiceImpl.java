package com.user.service.services;

import com.user.service.entities.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<Users> list = List.of(
            new Users(1311L, "Durgesh Tiwari", "23525625"),
            new Users(1312L, "Ankit Tiwari", "99999"),
            new Users(1314L, "Ravi Tiwari", "888")
    );

    @Override
    public Users getUser(Long id) {
        return list.stream().filter(user
                -> user.getUserId()
                .equals(id))
                .findAny()
                .orElse(null);
    }
}
