package com.project.rolmodel.repositories;

import com.project.rolmodel.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{
}
