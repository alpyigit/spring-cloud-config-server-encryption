package com.management.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Value("${user.count}")
    private String count;

    @GetMapping
    public String getCount(){
        return "UserCount:" + count;
    }
}
