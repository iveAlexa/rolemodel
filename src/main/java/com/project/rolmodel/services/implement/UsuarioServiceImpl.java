package com.project.rolmodel.services.implement;

import com.project.rolmodel.domain.entities.Usuario;
import com.project.rolmodel.domain.entities.UsuarioDetalle;
import com.project.rolmodel.dto.UsuarioDTO;
import com.project.rolmodel.dto.UsuarioDetalleDTO;
import com.project.rolmodel.mapper.UsuarioDetalleMapper;
import com.project.rolmodel.mapper.UsuarioMapper;
import com.project.rolmodel.repositories.UsuarioDetalleRepository;
import com.project.rolmodel.repositories.UsuarioRepository;
import com.project.rolmodel.services.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioDetalleRepository usuarioDetalleRepository;
    private final UsuarioMapper usuarioMapper;


    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, UsuarioDetalleRepository usuarioDetalleRepository, UsuarioMapper userMapper) {

        this.usuarioRepository = usuarioRepository;
        this.usuarioDetalleRepository = usuarioDetalleRepository;
        this.usuarioMapper = userMapper;
    }


    @Override
    public List<UsuarioDTO> getAllUsuarios() {
        return usuarioRepository
                .findAll()
                .stream()
                .map(usuarioMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<UsuarioDTO> getAllUsuariosDetalle() {
        return usuarioRepository.findAll()
                .stream()
                .map(usuarioMapper::toDtoDetalle)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UsuarioDTO> getUsuarioById(Integer id) {
        return Optional.empty();
    }

    @Override
    public UsuarioDTO createUsuarioDetalle(UsuarioDetalleDTO dto) {

      //  Usuario user = usuarioRepository.save(UsuarioDetalleMapper.toEntity(dto));
        //usuarioDetalleRepository.save(
               // new UsuarioDetalle(dto.getFirstName(), dto.getLastName(), dto.getAge(), dto.getBirthday(), user));
       // return usuarioMapper.toDto(user);
        return null;
    }

    // @Override
   // public List<UsuarioDetalleDTO> getAllUsuariosDetalle() {
       // return usuarioDetalleRepository
              //  .findAll()
              //  .stream()
               // .map(usuarioMapper::toDto)
             //   .collect(Collectors.toList());

  //  }

    @Override
    public UsuarioDTO save(UsuarioDTO dto) {
        Usuario user = usuarioRepository.save(usuarioMapper.toEntity(dto));
        usuarioDetalleRepository.save(new UsuarioDetalle(
                dto.getUsuarioDetalleDTO().getFirstName(),
                dto.getUsuarioDetalleDTO().getLastName(),
                dto.getUsuarioDetalleDTO().getAge(),
                dto.getUsuarioDetalleDTO().getBirthday(),
                user));
        return usuarioMapper.toDto(user);
    }

  //  @Override
   // public UsuarioDTO createUsuarioDetalle(UsuarioDetalleDTO dto) {
      //  Usuario usuario = UsuarioRepository.save(usuarioMapper.toEntity(dto));
      /// UsuarioDetalleRepository.save (
             // new UsuarioDetalle(dto.getFirstName(), dto.getLastName(), dto.getAge(), dto.getBirthday(), usuario));
      //  return usuarioMapper.toDto(usuario);
//    }

    @Override
    public UsuarioDTO createUsuario(UsuarioDTO dto) {
        Usuario usuario = usuarioRepository.save(usuarioMapper.toEntity(dto));
        return usuarioMapper.toDto(usuario);
    }


    @Override
    public void delete(Integer id) {

    }
}
