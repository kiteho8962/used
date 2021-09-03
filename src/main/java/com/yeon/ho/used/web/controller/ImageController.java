package com.yeon.ho.used.web.controller;

import com.yeon.ho.used.config.auth.PrincipalDetails;
import com.yeon.ho.used.service.image.ImageService;
import com.yeon.ho.used.web.dto.image.ImageUploadDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @PostMapping("/image")
    public String imageUpload(ImageUploadDTO imageUploadDTO, @AuthenticationPrincipal PrincipalDetails principalDetails) {
        imageService.imageUpload(imageUploadDTO, principalDetails);
        return "redirect:/";
    }
}
