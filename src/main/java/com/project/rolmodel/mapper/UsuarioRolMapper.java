package com.project.rolmodel.mapper;

import com.project.rolmodel.domain.entities.UsuarioRol;
import com.project.rolmodel.dto.UsuarioRolDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRolMapper implements CustomMapper<UsuarioRolDTO, UsuarioRol>{


    @Override
    public UsuarioRolDTO toDto(UsuarioRol usuarioRol) {
        UsuarioRolDTO usuarioRolDTO = new UsuarioRolDTO();
        usuarioRolDTO.setId(usuarioRol.getId());
        usuarioRolDTO.setActive(usuarioRol.getActive());
        usuarioRolDTO.setCreatedAt(usuarioRol.getCreatedAt());
        return usuarioRolDTO;
    }

    @Override
    public UsuarioRol toEntity(UsuarioRolDTO usuarioRolDTO) {
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setId(usuarioRolDTO.getId());
        usuarioRol.setActive(usuarioRolDTO.getActive());
        usuarioRol.setCreatedAt(usuarioRolDTO.getCreatedAt());

        return usuarioRol;

    }
}
