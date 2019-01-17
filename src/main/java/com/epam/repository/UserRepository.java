package com.epam.repository;

import com.epam.dto.User;

import java.util.List;

public interface UserRepository {
    User getUserByLogin(String login);

    void addUser(User user);

    List<User> getUserList();
}

