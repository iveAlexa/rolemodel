package com.project.rolmodel.mapper;

import com.project.rolmodel.domain.entities.Usuario;
import com.project.rolmodel.domain.entities.UsuarioDetalle;
import com.project.rolmodel.dto.UsuarioDTO;
import com.project.rolmodel.dto.UsuarioDetalleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper implements CustomMapper <UsuarioDTO, Usuario>{

    @Autowired
    private UsuarioDetalleMapper usuarioDetalleMapper;
    private UsuarioDetalleDTO usuarioDetalleDTO;
    @Override
    public UsuarioDTO toDto(Usuario usuario) {
        UsuarioDTO usuarioDTO= new UsuarioDTO();
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setUsername(usuario.getUsername());
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setPassword(usuario.getPassword());
        usuarioDTO.setCreateAt(usuario.getCreateAt());
        return usuarioDTO;
    }

    public UsuarioDTO toDtoDetalle(Usuario usuario){
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(usuario.getId());
        dto.setUsername(usuario.getUsername());
        dto.setPassword(usuario.getPassword());
        dto.setEmail(usuario.getEmail());
        dto.setCreateAt(usuario.getCreateAt());
        if (usuario.getUsuarioDetalle() != null){
            UsuarioDetalle usuarioDetalle = usuario.getUsuarioDetalle();
            dto.setUsuarioDetalleDTO(usuarioDetalleMapper.toDto(usuarioDetalle));
        }
        return dto; }

    @Override
    public Usuario toEntity(UsuarioDTO usuarioDTO) {
        Usuario usuario= new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setCreateAt(usuarioDTO.getCreateAt());
        return usuario;
    }


}
