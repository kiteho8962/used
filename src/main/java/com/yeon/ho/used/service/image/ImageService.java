package com.yeon.ho.used.service.image;

import com.yeon.ho.used.config.auth.PrincipalDetails;
import com.yeon.ho.used.domain.image.Image;
import com.yeon.ho.used.domain.user.User;
import com.yeon.ho.used.web.dto.image.ImageUploadDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ImageService {

    void imageUpload(ImageUploadDTO imageUploadDTO, PrincipalDetails principalDetails);

    Page<Image> getImages(Pageable pageable);

    default Image ImageUploadDTOToEntity(ImageUploadDTO imageUploadDTO, User user, String imageUrl) {
        return Image.builder()
                .title(imageUploadDTO.getTitle())
                .email(imageUploadDTO.getEmail())
                .price(imageUploadDTO.getPrice())
                .imageUrl(imageUrl)
                .message(imageUploadDTO.getMessage())
                .user(user)
                .build();
    }

}
