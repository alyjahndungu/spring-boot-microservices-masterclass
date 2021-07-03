package com.user.service.controller;


import com.user.service.entities.Users;
import com.user.service.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

//    private final RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public Users getUser(@PathVariable(value = "userId") Long userId){

        Users user = this.userService.getUser(userId);
        //http://localhost:9002/contact/user/1311

//        List contacts = this.restTemplate.getForObject("http://ternscode-contact-service/contact/user/" + user.getUserId(), List.class);
//
//
//        user.setContacts(contacts);
        return user;
    }
}
