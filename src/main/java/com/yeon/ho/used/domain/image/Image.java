package com.yeon.ho.used.domain.image;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yeon.ho.used.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String email;
    private String price;
    private String imageUrl;
    private String message;
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties({"password"}) // user 안의 password
    private User user;

    private LocalDateTime createDate;
    @PrePersist
    public void createDate() {
        this.createDate = LocalDateTime.now();
    }

}
