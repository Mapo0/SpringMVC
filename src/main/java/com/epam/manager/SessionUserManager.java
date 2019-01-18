package com.epam.manager;

import com.epam.dto.User;

public interface SessionUserManager {

    public void setCurrentSessionUser(User user);

    public User getCurrentSessionUser();
}