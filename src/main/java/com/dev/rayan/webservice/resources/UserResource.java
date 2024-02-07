package com.dev.rayan.webservice.resources;

import com.dev.rayan.webservice.entities.User;
import com.dev.rayan.webservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        User createdUser = userService.create(user);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdUser.getId())
                .toUri();
        return ResponseEntity.created(uri).body(createdUser);
    }

    @GetMapping
    public ResponseEntity<List<User>> readAll() {
        List<User> userList = userService.readAll();
        return ResponseEntity.ok().body(userList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> readById(@PathVariable Long id) {
        User user = userService.readById(id);
        return ResponseEntity.ok().body(user);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.update(id,user);
        return ResponseEntity.ok().body(updatedUser);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
