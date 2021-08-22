package com.yeon.ho.used.web;

import com.yeon.ho.used.service.AuthService;
import com.yeon.ho.used.web.dto.auth.SignUpDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping("/auth/login")
    public String loginForm() {
        return "auth/login";
    }

    @GetMapping("/auth/signup")
    public String signupForm() {
        return "auth/signup";
    }

    @PostMapping("/auth/signup")
    public String signup(SignUpDTO signUpDTO) {
        authService.signUp(signUpDTO);
        return "auth/login";
    }

}
