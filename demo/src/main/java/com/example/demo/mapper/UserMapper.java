package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

	List<User> findAll();

    User findByName(String name);
    
    List<User> findByAddress(String address);

    void insert(User user);

    void update(User user);

    void delete(String name);
}