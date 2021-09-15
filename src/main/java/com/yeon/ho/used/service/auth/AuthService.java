package com.yeon.ho.used.service.auth;

import com.yeon.ho.used.domain.user.User;
import com.yeon.ho.used.web.dto.auth.SignUpDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


public interface AuthService {

    void signUp(SignUpDTO signUpDTO);

    User updateImage(int principalId, MultipartFile profileImageUrl);

    default User SignUpDTOToEntity(SignUpDTO signUpDTO) {
        return User.builder()
                .userName(signUpDTO.getUserName())
                .email(signUpDTO.getEmail())
                .address(signUpDTO.getAddress())
                .phone(signUpDTO.getPhone())
                .password(signUpDTO.getPassword())
                .build();
    }

}
