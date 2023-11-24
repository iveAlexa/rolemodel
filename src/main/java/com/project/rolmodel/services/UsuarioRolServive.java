package com.project.rolmodel.services;

import com.project.rolmodel.domain.entities.Rol;
import com.project.rolmodel.domain.entities.UsuarioDetalle;
import com.project.rolmodel.domain.entities.UsuarioRol;
import com.project.rolmodel.dto.RolDTO;
import com.project.rolmodel.dto.UsuarioDTO;
import com.project.rolmodel.dto.UsuarioRolDTO;

import java.util.List;
import java.util.Optional;

public interface UsuarioRolServive {
    List<UsuarioRolDTO> listAllUsuariosRoles();
    UsuarioRolDTO save(UsuarioRolDTO dto);
    void deleteRol(Integer id);
}
