package com.project.rolmodel.repositories;

import com.project.rolmodel.domain.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository <Rol,Integer> {
}
