package com.yeon.ho.used.service.auth;

import com.yeon.ho.used.domain.user.User;
import com.yeon.ho.used.domain.user.UserRepository;
import com.yeon.ho.used.handler.exception.CustomApiException;
import com.yeon.ho.used.web.dto.auth.SignUpDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Value("${file.path}")
    private String uploadFolder;

    @Override
    public void signUp(SignUpDTO signUpDTO) {
        User user = SignUpDTOToEntity(signUpDTO);
        user.setPassword(bCryptPasswordEncoder.encode(signUpDTO.getPassword()));
        userRepository.save(user);
    }

    @Override
    @Transactional
    public User updateImage(int principalId, MultipartFile profileImageUrl) {
        UUID uuid = UUID.randomUUID();
        String imageFileName = uuid + "_" + profileImageUrl.getOriginalFilename();
        log.info(imageFileName);
        Path imageFilePath = Paths.get(uploadFolder+imageFileName);

        try {
            Files.write(imageFilePath, profileImageUrl.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        User userEntity = userRepository.findById(principalId).orElseThrow(() -> {
            throw new CustomApiException("유저를 찾을수 없습니다.");
        });
        userEntity.setProfileImageUrl(imageFileName);
        return userEntity;
    }
}
