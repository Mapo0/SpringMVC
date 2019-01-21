package com.epam.interceptor;

import com.epam.dto.User;
import com.epam.dto.UserRole;
import com.epam.manager.SessionUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

public class AdminInterCeptor extends HandlerInterceptorAdapter {
    @Autowired

    private SessionUserManager sessionUserManager;


    @Override

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)

            throws Exception {

        User foundUser = sessionUserManager.getCurrentSessionUser();


        //UserRole
        if (Objects.isNull(foundUser) || !foundUser.getUserRole().equals(UserRole.ADMIN)) {

            response.sendRedirect("/index");

            return false;

        }


        return true;


    }

}
