package com.psuti.Popko.controller;

import com.psuti.Popko.service.DTO.AuthDto;
import com.psuti.Popko.service.DTO.RegDto;
import com.psuti.Popko.service.token.Token;
import com.psuti.Popko.service.util.UserAuthService;
import com.psuti.Popko.service.util.UserRegService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthRestController {
    private final UserAuthService userAuthService;
    private final UserRegService userRegService;
    public AuthRestController(UserAuthService userAuthService,
                              UserRegService userRegService) {
        this.userAuthService = userAuthService;
        this.userRegService = userRegService;
    }
    @PostMapping(path = "/login")
    @RequestMapping(value = "/login")
    public Token createAuthenticationToken(@RequestBody AuthDto authenticationRequest)
            throws Exception {
        return userAuthService.authorization(authenticationRequest);
    }
    @PostMapping
    @RequestMapping("/reg")
    public Token createAccount(@RequestBody RegDto user) throws Exception {
        return userRegService.registration(user);
    }
}
