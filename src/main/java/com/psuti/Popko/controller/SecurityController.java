package com.psuti.Popko.controller;

import ch.qos.logback.core.util.Duration;
import com.psuti.Popko.service.AuthCredentialsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class SecurityController {

//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @PostMapping("login")
//    public ResponseEntity<?> login(@RequestBody AuthCredentialsRequest request) {
//        try {
//            Authentication authenticate = authenticationManager
//                    .authenticate(
//                            new UsernamePasswordAuthenticationToken(
//                                    request.getUsername(), request.getPassword()));
//
//            User user = (User) authenticate.getPrincipal();
//            user.setPassword(null);
//
//            String token = jwtUtil.generateToken(user);
//            ResponseCookie cookie = ResponseCookie.from("jwt", token)
//                    .domain(domain)
//                    .path("/")
//                    .maxAge(Duration.buildByDays(365).getMilliseconds())
//                    .build();
//            return ResponseEntity.ok()
//                    .header(HttpHeaders.SET_COOKIE, cookie.toString())
//                    .body(token);
//        } catch (BadCredentialsException ex) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//    }

}
