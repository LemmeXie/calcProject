package com.psuti.Popko.email;

import com.psuti.Popko.service.DTO.RegDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnRegistrationEvent {
    private RegDto regDto;
    public OnRegistrationEvent(RegDto regDto){
        this.regDto = regDto;
    }
}

