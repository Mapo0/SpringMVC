package com.epam.repository.impl;

import com.epam.dto.User;
import com.epam.dto.UserRole;
import com.epam.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private List<User> userList= new ArrayList<>();

    public UserRepositoryImpl(){
        User admin = new User("admin", "admin");
        admin.setUserRole(UserRole.ADMIN);
        userList.add(admin);
        User client = new User("user","user");
        client.setUserRole(UserRole.CLIENT);
        userList.add(client);
    }

    @Override
    public User getUserByLogin(String login){
        return userList.stream().filter(u -> u.getLogin().equals(login)).findFirst().get();
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
