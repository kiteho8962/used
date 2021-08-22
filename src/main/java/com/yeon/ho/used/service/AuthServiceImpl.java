package com.yeon.ho.used.service;

import com.yeon.ho.used.domain.user.User;
import com.yeon.ho.used.domain.user.UserRepository;
import com.yeon.ho.used.web.dto.auth.SignUpDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void signUp(SignUpDTO signUpDTO) {
        User user = SignUpDTOToEntity(signUpDTO);
        user.setPassword(bCryptPasswordEncoder.encode(signUpDTO.getPassword()));
        userRepository.save(user);
    }
}
