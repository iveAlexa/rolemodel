package com.project.rolmodel.services.implement;

import com.project.rolmodel.domain.entities.Rol;
import com.project.rolmodel.dto.RolDTO;
import com.project.rolmodel.mapper.RolMapper;
import com.project.rolmodel.repositories.RolRepository;
import com.project.rolmodel.services.RolService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;
    private final RolMapper rolMapper;
    public RolServiceImpl(RolRepository rolRepository, RolMapper rolMapper) {
        this.rolRepository= rolRepository;
        this.rolMapper = rolMapper;
    }

    @Override
    public List<RolDTO> listAllRoles() {
        return rolRepository.findAll()
                .stream()
                .map(rolMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public RolDTO save(RolDTO dto) {
        Rol rol =  rolRepository.save(rolMapper.toEntity(dto));
        return rolMapper.toDto(rol);
    }

    public Rol createRol(Rol rol) {
        return rolRepository.save(rol);
    }

    public Rol updateRol(Integer id, Rol updatedRol) {
        Optional<Rol> existingRol = rolRepository.findById(id);

        if (existingRol.isPresent()) {
            Rol rolToUpdate = existingRol.get();
            rolToUpdate.setName(updatedRol.getName());
            rolToUpdate.setUsuarioRols(updatedRol.getUsuarioRols()); // Actualizar según sea necesario
            return rolRepository.save(rolToUpdate);
        } else {
            // Manejar el caso en el que el rol no existe
            return null;
        }
    }

    @Override
    public Optional<RolDTO> getRolById(Integer id) {
        return rolRepository.findById(id).map(rolMapper::toDto);
    }

    @Override
    public void deleteRol(Integer id) {
        rolRepository.deleteById(id);
    }
}
