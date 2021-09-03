package com.yeon.ho.used.web.controller;

import com.yeon.ho.used.config.auth.PrincipalDetails;
import com.yeon.ho.used.handler.exception.CustomValidationException;
import com.yeon.ho.used.service.auth.AuthService;
import com.yeon.ho.used.web.dto.auth.SignUpDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@Log4j2
public class AuthController {

    private final AuthService authService;

//    @GetMapping("/")
//    public String testIndex() {
//        return "index2";
//    }

    @GetMapping("/auth/login")
    public String loginForm() {
        return "auth/login";
    }

    @GetMapping("/auth/signup")
    public String signupForm() {
        return "auth/signup";
    }

    @PostMapping("/auth/signup")
    public String signup(@Valid SignUpDTO signUpDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errorMap = new HashMap<>();
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            throw new CustomValidationException("유효성 검사 실패함", errorMap);
        }else {
            authService.signUp(signUpDTO);
            return "auth/login";
        }
    }

    @GetMapping("/user/{id}/profile-details")
    public String profilePage(@PathVariable int id, @AuthenticationPrincipal PrincipalDetails principalDetails) {
        log.info(principalDetails.getUser());
        return "user/profile-details";
    }

}
