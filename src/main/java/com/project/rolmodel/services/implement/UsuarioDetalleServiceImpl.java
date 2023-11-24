package com.project.rolmodel.services.implement;

import com.project.rolmodel.domain.entities.UsuarioDetalle;
import com.project.rolmodel.dto.UsuarioDetalleDTO;
import com.project.rolmodel.mapper.UsuarioDetalleMapper;
import com.project.rolmodel.repositories.UsuarioDetalleRepository;
import com.project.rolmodel.services.UsuarioDetalleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UsuarioDetalleServiceImpl implements UsuarioDetalleService {
    public UsuarioDetalleServiceImpl(UsuarioDetalleRepository usuarioDetalleRepository, UsuarioDetalleMapper usuarioDetalleMapper) {
        this.usuarioDetalleRepository = usuarioDetalleRepository;
        this.usuarioDetalleMapper = usuarioDetalleMapper;
    }

    private final UsuarioDetalleRepository  usuarioDetalleRepository;
    private final UsuarioDetalleMapper usuarioDetalleMapper;

    @Override
    public List<UsuarioDetalleDTO> getAllUsuariosDetalle() {
        return usuarioDetalleRepository
                .findAll()
                .stream()
                .map(usuarioDetalleMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioDetalleDTO save(UsuarioDetalleDTO dto) {
        UsuarioDetalle usuarioDetalle = usuarioDetalleRepository.save(usuarioDetalleMapper.toEntity(dto));
        return usuarioDetalleMapper.toDto(usuarioDetalle);
    }

    //@Override
   // public UsuarioDetalleDTO createUsuarioDetalle(UsuarioDetalleDTO dto) {
        //UsuarioDetalle usuarioDetalle = usuarioDetalleRepository.save(usuarioDetalleMapper.toEntity(dto));
        //return usuarioDetalleMapper.toDto(usuarioDetalle);
   // }

    @Override
    public void delete(Integer id) {

    }
}
