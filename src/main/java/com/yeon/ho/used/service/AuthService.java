package com.yeon.ho.used.service;

import com.yeon.ho.used.domain.user.User;
import com.yeon.ho.used.web.dto.auth.SignUpDTO;
import org.springframework.stereotype.Service;


public interface AuthService {

    void signUp(SignUpDTO signUpDTO);

    default User SignUpDTOToEntity(SignUpDTO signUpDTO) {
        return User.builder()
                .firstName(signUpDTO.getFirstName())
                .lastName(signUpDTO.getLastName())
                .userName(signUpDTO.getUserName())
                .email(signUpDTO.getEmail())
                .password(signUpDTO.getPassword())
                .build();
    }

}
