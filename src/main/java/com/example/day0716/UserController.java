package com.example.day0716;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        return null;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return null;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return null;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") long id, @RequestBody User user) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id) {

    }
}
