package com.yeon.ho.used.web.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpDTO {
    // @Validation

    @Size(min = 2, max = 30)
    private String userName;
    @NotBlank
    private String email;
    @NotBlank
    private String address;
    @NotBlank
    private String phone;
    @NotBlank
    private String password;

}
