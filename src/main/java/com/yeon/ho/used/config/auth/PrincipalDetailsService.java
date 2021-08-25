package com.yeon.ho.used.config.auth;

import com.yeon.ho.used.domain.user.User;
import com.yeon.ho.used.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PrincipalDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userEntity = userRepository.findByEmail(username);
        if(userEntity == null) {
            return null;
        }else {
            return new PrincipalDetails(userEntity);
        }
    }
}
