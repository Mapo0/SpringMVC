package com.epam.service.impl;

import com.epam.dto.User;
import com.epam.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserRepository(String login) {
        return null;
    }
}
