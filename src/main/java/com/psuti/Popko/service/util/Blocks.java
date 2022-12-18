package com.psuti.Popko.service.util;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Blocks implements Serializable {
    private String title;
    private List<PostBody> blocks;
}
