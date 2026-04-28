package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/name/{name}")
    public User getByName(@PathVariable String name) {
        return service.getByName(name);
    }
    
    @GetMapping("/address/{address}")
    public List<User> getByAddress(@PathVariable String address) {
        return service.getByAddress(address);
    }

    @PostMapping
    public void create(@RequestBody User user) {
        service.create(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        service.update(user);
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        service.delete(name);
    }

}
