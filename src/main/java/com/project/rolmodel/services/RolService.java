package com.project.rolmodel.services;

import com.project.rolmodel.domain.entities.Rol;
import com.project.rolmodel.dto.RolDTO;

import java.util.List;
import java.util.Optional;

public interface RolService {
    List<RolDTO> listAllRoles();

    RolDTO save(RolDTO dto);
    Optional<RolDTO> getRolById(Integer id);
    void deleteRol(Integer id);

}
