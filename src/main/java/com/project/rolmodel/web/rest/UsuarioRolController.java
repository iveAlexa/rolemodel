package com.project.rolmodel.web.rest;

import com.project.rolmodel.dto.RolDTO;
import com.project.rolmodel.dto.UsuarioRolDTO;
import com.project.rolmodel.services.implement.UsuarioRolServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/usuariorol")
public class UsuarioRolController {
  private UsuarioRolServiceImpl usuarioRolServiceImpl;

    public UsuarioRolController(UsuarioRolServiceImpl usuarioRolServiceImpl) {
        this.usuarioRolServiceImpl = usuarioRolServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioRolDTO>> listRol(){
        return ResponseEntity.ok().body(usuarioRolServiceImpl.listAllUsuariosRoles());
    }
    @PostMapping
    public ResponseEntity<UsuarioRolDTO> create(@RequestBody final UsuarioRolDTO dto ) throws URISyntaxException {
        if (dto.getId() != null) {
            throw new IllegalArgumentException("The new userrol cannot already have an id.");
        }
        UsuarioRolDTO usariorolDB= usuarioRolServiceImpl.save(dto);
        return ResponseEntity.created(new URI("/usuariorol/" + usariorolDB.getId())).body(usariorolDB);
    }
}
