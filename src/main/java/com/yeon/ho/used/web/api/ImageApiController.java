package com.yeon.ho.used.web.api;

import com.yeon.ho.used.domain.image.Image;
import com.yeon.ho.used.service.image.ImageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ImageApiController {

    private final ImageService imageService;

    @GetMapping("/api/image")
    public ResponseEntity<?> getList(@PageableDefault(size = 3) Pageable pageable) {
        Page<Image> images = (Page<Image>) imageService.getImages(pageable);
        return ResponseEntity.ok(images);
    }
}
