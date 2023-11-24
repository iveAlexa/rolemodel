package com.project.rolmodel.domain.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="rol")
public class Rol {

    @Id
    @SequenceGenerator(name="rol_sequence", allocationSize =  1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rol_sequence")
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "rol")
    private Set<UsuarioRol> usuarioRols;

    public Rol(String name) {
        this.name = name;
    }

    public Rol() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UsuarioRol> getUsuarioRols() {
        return usuarioRols;
    }

    public void setUsuarioRols(Set<UsuarioRol> usuarioRols) {
        this.usuarioRols = usuarioRols;
    }
}
