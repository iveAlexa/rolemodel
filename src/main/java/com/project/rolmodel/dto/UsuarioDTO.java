package com.project.rolmodel.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class UsuarioDTO {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createAt;
    private UsuarioDetalleDTO usuarioDetalleDTO;

}
