package com.epam.interceptor;


import com.epam.dto.User;
import com.epam.manager.SessionUserManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@Component
public class AuthInterCeptor extends HandlerInterceptorAdapter {

    @Autowired
    private SessionUserManagerImpl sessionUserManagerImpl;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        User foundUser = sessionUserManagerImpl.getCurrentSessionUser();
        if (Objects.isNull(foundUser)) {
            httpServletResponse.sendRedirect("/login");
            return false;
        }

        httpServletRequest.setAttribute("user", foundUser);
        return true;
    }
}