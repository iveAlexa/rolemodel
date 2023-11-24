package com.project.rolmodel.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class UsuarioRolDTO {
    private Integer id;
    private Boolean active;
    private LocalDateTime createdAt;

    public UsuarioRolDTO() {
    }
}
