package com.yeon.ho.used.service.image;

import com.yeon.ho.used.config.auth.PrincipalDetails;
import com.yeon.ho.used.domain.image.Image;
import com.yeon.ho.used.domain.image.ImageRepository;
import com.yeon.ho.used.web.dto.image.ImageUploadDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService{

    private final ImageRepository imageRepository;

    @Value("${file.path}")
    private String uploadFolder;

    @Override
    public void imageUpload(ImageUploadDTO imageUploadDTO, PrincipalDetails principalDetails) {
        // 폴더에 저장
        UUID uuid = UUID.randomUUID();
        String imageFileName = uuid+"_"+imageUploadDTO.getFile().getOriginalFilename();
        log.info(imageFileName);
        Path imageFilePath = Paths.get(uploadFolder+imageFileName);
        try {
            Files.write(imageFilePath, imageUploadDTO.getFile().getBytes());
        }catch (Exception e) {
            e.printStackTrace();
        }
        // DB에 저장
        Image image = ImageUploadDTOToEntity(imageUploadDTO, principalDetails.getUser(), imageFileName);
        imageRepository.save(image);
    }
}
