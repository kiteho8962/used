package com.yeon.ho.used.web.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;

}
