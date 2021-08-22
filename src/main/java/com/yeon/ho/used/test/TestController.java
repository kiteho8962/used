package com.yeon.ho.used.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class TestController {

    @GetMapping("/")
    public String testPage() {
        return "index";
    }

    @GetMapping("/auth/login")
    public String testLogin() {
        return "auth/login";
    }

    @GetMapping("/auth/signin")
    public String testSignin() {
        return "auth/signin";
    }


}
