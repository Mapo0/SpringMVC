package com.epam.service;


import com.epam.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

  public   User getUserRepository(User user);

  void addUser(User user);
}
