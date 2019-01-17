package com.epam.service;


import com.epam.dto.User;

import java.util.List;

public interface UserService {

    public List<User> getUserRepository(String login);
}
