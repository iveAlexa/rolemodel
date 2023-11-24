package com.project.rolmodel.services;

import com.project.rolmodel.domain.entities.Rol;
import com.project.rolmodel.domain.entities.Usuario;
import com.project.rolmodel.dto.UsuarioDTO;
import com.project.rolmodel.dto.UsuarioDetalleDTO;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<UsuarioDTO> getAllUsuarios();
    List<UsuarioDTO> getAllUsuariosDetalle();

    Optional<UsuarioDTO> getUsuarioById(Integer id);
    UsuarioDTO createUsuarioDetalle(UsuarioDetalleDTO dto);
    UsuarioDTO createUsuario(UsuarioDTO dto);

    UsuarioDTO save(UsuarioDTO dto);
    void delete(Integer id);
}
