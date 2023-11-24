package com.project.rolmodel.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.core.SpringVersion;

@Getter
@Setter
@ToString
public class RolDTO {
    private Integer id;
    private String name;

    public RolDTO() {

    }
}

