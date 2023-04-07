package com.psuti.Popko.security;

import com.psuti.Popko.dao.UsersEntityRepository;
import com.psuti.Popko.entities.UsersEntity;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UsersEntityRepository userCrudService;

    public UserDetailsServiceImpl(UsersEntityRepository userCrudService) {
        this.userCrudService = userCrudService;
    }

    public UserDetails loadUserById(int id) {
        return fromEntity(userCrudService.getReferenceById(id));
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return fromEntity(userCrudService.findByEmail(email));
    }

    UserDetails fromEntity(UsersEntity user) {
        boolean enabled = user.isEnabled();
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                enabled, enabled, enabled, enabled,
                grantedAuthorities()
        );
    }

    public static List<GrantedAuthority> grantedAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(
                "USER")
        );
    }
}

