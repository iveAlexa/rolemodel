package com.project.rolmodel.web.rest;

import com.project.rolmodel.dto.UsuarioDTO;
import com.project.rolmodel.dto.UsuarioDetalleDTO;
import com.project.rolmodel.mapper.UsuarioMapper;
import com.project.rolmodel.services.UsuarioService;
import com.project.rolmodel.services.implement.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    private UsuarioServiceImpl usuarioServiceImpl;

    public UsuarioController(UsuarioServiceImpl usuarioServiceImpl) {
        this.usuarioServiceImpl = usuarioServiceImpl;
    }


    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> getAllUsuarios (@RequestParam (required = false,defaultValue = "false") boolean detalle){
        if (detalle){
            return  ResponseEntity.ok().body(usuarioServiceImpl.getAllUsuariosDetalle());
        }else {
            return  ResponseEntity.ok().body(usuarioServiceImpl.getAllUsuarios());
        }
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> create(@RequestBody final UsuarioDTO dto) throws URISyntaxException{
        if (dto.getId() != null){
            throw new IllegalArgumentException(" I new user cannot already have an id.");
        }
        UsuarioDTO userDB = usuarioServiceImpl.save(dto);

        return ResponseEntity.created(new URI("/v1/students/" + userDB.getId())).body(userDB);
    }

   // @PostMapping(path = "/detalle")
   // public ResponseEntity<UsuarioDTO> createUserDetailed(@RequestBody final UsuarioDetalleDTO user)
           // throws URISyntaxException {
      //  if (user.getId() != null) {
         //   throw new IllegalArgumentException("I new user cannot already have an id");
      //  }

      //  UsuarioDTO dto = usuarioServiceImpl.createUsuario(user);

      //  return ResponseEntity.created(new URI("/usuarios/" + dto.getId())).body(dto);
  //  }


}
