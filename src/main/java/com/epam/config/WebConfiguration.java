package com.epam.config;

import com.epam.interceptor.AdminInterCeptor;
import com.epam.interceptor.AuthInterCeptor;
import com.epam.interceptor.UserInterCeptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
    /**

     * Бин общего интерсептера проверки наличия аутентификации

     */

    @Bean

    public AuthInterCeptor authenticationInterceptor() {

        return new AuthInterCeptor();

    }



    /**

     * Бин интерсептера проверки наличия роли ADMIN у пользователя

     */

    @Bean

    public AdminInterCeptor adminInterceptor() {

        return new AdminInterCeptor();

    }



    /**

     * Бин интерсептера кладущего в модель текущего пользователя

     */

    @Bean

    public UserInterCeptor userAwareInterceptor() {

        return new UserInterCeptor();

    }



    @Override

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/reg","index");



        registry.addInterceptor(userAwareInterceptor()).addPathPatterns("/**") ;







        registry.addInterceptor(adminInterceptor()).addPathPatterns("/admin");

    }




}
