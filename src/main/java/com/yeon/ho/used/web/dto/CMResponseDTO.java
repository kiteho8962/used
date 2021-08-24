package com.yeon.ho.used.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CMResponseDTO<T> {
    // 공통 응답 DTO

    private int code;
    private String message;
    private T data;

}
