package com.psuti.Popko.service.token;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "token")
@Table(name = "tokens")
public class Token implements Serializable {
    @Column(nullable = false, unique = true)
    private String value;
    @JsonIgnore
    private boolean killed;
    @Id
    @Column(name = "user_id")
    private UUID userId;
}

