package com.epam.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
public class GreetingController {

    @RequestMapping("/index")
    public String welcome() {
        return "login";
    }
    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }


}