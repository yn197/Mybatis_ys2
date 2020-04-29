package com.cs.mapper;

import com.cs.domain.User;

import java.util.List;

public interface UserMapper {

    public void save(User user);

    public User findById(int id);

    public List<User> findAll();


}
