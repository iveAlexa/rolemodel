package com.project.rolmodel.web.rest;

import com.project.rolmodel.dto.UsuarioDetalleDTO;
import com.project.rolmodel.mapper.UsuarioDetalleMapper;
import com.project.rolmodel.services.implement.UsuarioDetalleServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/usuariosDetalle")
public class UsuarioDetalleController {
    private UsuarioDetalleServiceImpl usuarioDetalleServiceImpl;
    private final UsuarioDetalleMapper usuarioDetalleMapper;

    public UsuarioDetalleController(UsuarioDetalleServiceImpl usuarioDetalleServiceImpl, UsuarioDetalleMapper usuarioDetalleMapper) {
        this.usuarioDetalleServiceImpl = usuarioDetalleServiceImpl;
        this.usuarioDetalleMapper = usuarioDetalleMapper;
    }

    @GetMapping
    public List<UsuarioDetalleDTO> getAllUsuariosDetalle() {
        return usuarioDetalleServiceImpl.getAllUsuariosDetalle();
    }

}
