package com.psuti.Popko.email;

import com.psuti.Popko.service.DTO.AuthDto;
import com.psuti.Popko.service.DTO.RegDto;
import com.psuti.Popko.service.token.Token;
import com.psuti.Popko.service.util.UserAuthService;
import com.psuti.Popko.service.util.UserRegService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthRestController {
    private final UserAuthService userAuthService;
    private final UserRegService userRegService;
    private final ApplicationEventPublisher applicationEventPublisher;
    private final VerificationService verificationService;
    public AuthRestController(UserAuthService userAuthService,
                              UserRegService userRegService,
                              ApplicationEventPublisher applicationEventPublisher, VerificationService verificationService) {
        this.userAuthService = userAuthService;
        this.userRegService = userRegService;
        this.applicationEventPublisher = applicationEventPublisher;
        this.verificationService = verificationService;
    }
    @PostMapping(path = "/login")
    @RequestMapping(value = "/login")
    public Token authorization(@RequestBody AuthDto authDto) throws Exception {//valid
        applicationEventPublisher
                .publishEvent(new OnAuthorizationEvent(authDto));
        return userAuthService.authorization(authDto);
    }
    @PostMapping
    @RequestMapping("/reg")
    public Token registration(@RequestBody RegDto user) throws Exception {//valid
        Token token = userRegService.registration(user);
        user.setId(token.getUserId());
        applicationEventPublisher.publishEvent(new OnRegistrationEvent(user));
        return token;
    }

    @PostMapping("/confirm")
    public void confirm(@RequestParam("token") String token){
        verificationService.confirm(token);
    }
}


