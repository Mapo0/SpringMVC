package com.epam.repository.impl;

import com.epam.dto.User;
import com.epam.dto.UserRole;
import com.epam.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;


public class UserRepositoryImpl implements UserRepository {
    private List<User> userList= new ArrayList<>();

    public UserRepositoryImpl(){
        User Admin = new User("admin", "admin");
        Admin.setUserRole(UserRole.ADMIN);
        userList.add(Admin);
        User Client = new User("user","user");
        Client.setUserRole(UserRole.CLIENT);
        userList.add(Client);
    }
    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public List<User> getUserList() {
        return userList;
    }

    public UserRepositoryImpl(List<User> userList) {
        this.userList = userList;
    }
}
