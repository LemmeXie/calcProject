package com.psuti.Popko.service.DTO;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthDto implements Serializable {
    private String email;
    private String password;
}



