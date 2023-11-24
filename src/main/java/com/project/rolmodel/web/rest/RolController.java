package com.project.rolmodel.web.rest;

import com.project.rolmodel.domain.entities.Rol;
import com.project.rolmodel.dto.RolDTO;
import com.project.rolmodel.services.RolService;
import com.project.rolmodel.services.implement.RolServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping ( "/roles" )
public class RolController {
    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<RolDTO> getRolById(@PathVariable("id") final Integer id) {
        return ResponseEntity.ok().body(rolService.getRolById(id)
                .orElseThrow(() -> new IllegalArgumentException("Not found for the id:" + id)));
    }
    @GetMapping
    public ResponseEntity<List<RolDTO>> listRol(){
       return ResponseEntity.ok().body(rolService.listAllRoles());
    }

    @PostMapping
    public ResponseEntity<RolDTO> create(@RequestBody final RolDTO dto ) throws URISyntaxException{
        if (dto.getId() != null) {
            throw new IllegalArgumentException("The new rol cannot already have an id.");
        }
        RolDTO rolDB= rolService.save(dto);
        return ResponseEntity.created(new URI("/roles/" + rolDB.getId())).body(rolDB);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable ("id")  final Integer id){
        rolService.deleteRol(id);
        return ResponseEntity.noContent().build();
    }
}
