package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
	private final UserMapper mapper;

    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public List<User> getAll() {
        return mapper.findAll();
    }

    public User getByName(String name) {
        return mapper.findByName(name);
    }
    
    public List<User> getByAddress(String address) {
        return mapper.findByAddress(address);
    }

    public void create(User user) {
        mapper.insert(user);
    }

    public void update(User user) {
        mapper.update(user);
    }

    public void delete(String name) {
        mapper.delete(name);
    }
}
