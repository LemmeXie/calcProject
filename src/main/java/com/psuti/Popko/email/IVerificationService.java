package com.psuti.Popko.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

public interface IVerificationService {
    void confirm(String token);
    void createVerificationToken(UUID userId);
    boolean shouldRemove(UUID id);
}


