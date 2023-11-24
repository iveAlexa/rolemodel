package com.project.rolmodel.services;

import com.project.rolmodel.domain.entities.Rol;
import com.project.rolmodel.domain.entities.UsuarioDetalle;
import com.project.rolmodel.domain.entities.UsuarioRol;
import com.project.rolmodel.dto.UsuarioDetalleDTO;


import java.util.List;

public interface UsuarioDetalleService {
    List<UsuarioDetalleDTO> getAllUsuariosDetalle();
    //UsuarioDetalleDTO createUsuarioDetalle(UsuarioDetalleDTO dto);

    UsuarioDetalleDTO save(UsuarioDetalleDTO dto);
    void delete (Integer id);
}
