package com.yeon.ho.used.web.api;

import com.yeon.ho.used.config.auth.PrincipalDetails;
import com.yeon.ho.used.domain.user.User;
import com.yeon.ho.used.service.auth.AuthService;
import com.yeon.ho.used.web.dto.CMResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class UserApiController {

    private final AuthService authService;

    @PutMapping("/api/user/{principalId}/profileImageUrl")
    public ResponseEntity<?> profileImageUrlUpdate(@PathVariable int principalId, MultipartFile profileImageUrl,
                                                   @AuthenticationPrincipal PrincipalDetails principalDetails) {
        User userEntity = authService.updateImage(principalId, profileImageUrl);
        principalDetails.setUser(userEntity);
        return new ResponseEntity<>(new CMResponseDTO<>(1, "프로필 사진 변경 성공", null), HttpStatus.OK);
    }


}
