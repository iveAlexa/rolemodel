package com.project.rolmodel.services.implement;

import com.project.rolmodel.domain.entities.Usuario;
import com.project.rolmodel.domain.entities.UsuarioRol;
import com.project.rolmodel.dto.UsuarioRolDTO;
import com.project.rolmodel.mapper.UsuarioRolMapper;
import com.project.rolmodel.repositories.UsuarioRolRepository;
import com.project.rolmodel.services.UsuarioRolServive;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioRolServiceImpl implements UsuarioRolServive {

    private final UsuarioRolRepository usuarioRolRepository;
    private final UsuarioRolMapper usuarioRolMapper;
    public UsuarioRolServiceImpl(UsuarioRolRepository usuarioRolRepository, UsuarioRolMapper usuarioRolMapper) {
        this.usuarioRolRepository = usuarioRolRepository;
        this.usuarioRolMapper = usuarioRolMapper;
    }

    @Override
    public List<UsuarioRolDTO> listAllUsuariosRoles() {
        return usuarioRolRepository
                .findAll()
                .stream()
                .map(usuarioRolMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioRolDTO save(UsuarioRolDTO dto) {
        UsuarioRol usuario = usuarioRolRepository.save(usuarioRolMapper.toEntity(dto));
        return usuarioRolMapper.toDto(usuario);
    }


    @Override
    public void deleteRol(Integer id) {

    }
}
