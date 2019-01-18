package com.epam.manager;

import com.epam.dto.User;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class SessionUserManagerImpl implements SessionUserManager{

    private User currentSessionUser;

    @Override
    public void setCurrentSessionUser(User user) {
        this.currentSessionUser = user;
    }

    @Override
    public User getCurrentSessionUser() {
        return this.currentSessionUser;
    }
}