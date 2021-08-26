package com.yeon.ho.used.config.auth;

import com.yeon.ho.used.domain.user.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
public class PrincipalDetails implements UserDetails {

    private static final long serialVersionUID = 1L;

    private User user;

    // PrincipalDetailsService에서 UserRepository에서 찾은 Entity를 받음
    public PrincipalDetails(User user) {
        this.user = user;
    }

    // 권한
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // 만료?
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // 잠김?
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // 1년동안 비번 바꿈?
    }

    @Override
    public boolean isEnabled() {
        return true; // 활성화?
    }
}
