package com.dev.rayan.webservice.resources;

import com.dev.rayan.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(null, "Maria Brown", "maria@gmail.com", "(60) 9 92567890", "maria123");
        return ResponseEntity.ok().body(user);
    }

}
