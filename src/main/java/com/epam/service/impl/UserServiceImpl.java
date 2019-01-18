package com.epam.service.impl;

import com.epam.dto.User;
import com.epam.repository.UserRepository;
import com.epam.repository.impl.UserRepositoryImpl;
import com.epam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepositoryImpl userRepository;
    @Autowired
    UserServiceImpl(UserRepositoryImpl userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User getUserRepository(User user) {
        User foundUser= userRepository.getUserByLogin(user.getLogin());
        if (foundUser.getPassword().equals(user.getPassword()) )
        {
            return foundUser;
        }
        return null;
    }

    @Override
    public void addUser(User user) {

    }
}
