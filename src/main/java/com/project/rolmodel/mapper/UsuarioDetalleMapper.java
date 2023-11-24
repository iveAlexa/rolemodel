package com.project.rolmodel.mapper;

import com.project.rolmodel.domain.entities.UsuarioDetalle;
import com.project.rolmodel.dto.UsuarioDetalleDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioDetalleMapper implements CustomMapper<UsuarioDetalleDTO, UsuarioDetalle> {

    @Override
    public UsuarioDetalleDTO toDto(UsuarioDetalle usuarioDetalle) {
        UsuarioDetalleDTO usuarioDetalleDTO= new UsuarioDetalleDTO();
        usuarioDetalleDTO.setId(usuarioDetalle.getId());
        usuarioDetalleDTO.setFirstName(usuarioDetalle.getFirstname());
        usuarioDetalleDTO.setLastName(usuarioDetalle.getLastname());
        usuarioDetalleDTO.setAge(usuarioDetalle.getAge());
        usuarioDetalleDTO.setBirthday(usuarioDetalle.getBirthday());

        return usuarioDetalleDTO;
    }

    @Override
    public UsuarioDetalle toEntity(UsuarioDetalleDTO usuarioDetalleDTO) {
        UsuarioDetalle usuarioDetalle = new UsuarioDetalle();
        usuarioDetalle.setId(usuarioDetalleDTO.getId());
        usuarioDetalle.setFirstname(usuarioDetalleDTO.getFirstName());
        usuarioDetalle.setLastname(usuarioDetalleDTO.getLastName());
        usuarioDetalle.setBirthday(usuarioDetalleDTO.getBirthday());
        return usuarioDetalle;
    }
}
