package com.yeon.ho.used.web.dto.image;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ImageUploadDTO {

    private MultipartFile file;
    private String title;
    private String email;
    private String price;
    private String message;
}
