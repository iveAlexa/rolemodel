package com.project.rolmodel.domain.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="rol")
public class rol {

    @Id
    @SequenceGenerator(name="rol_sequence", allocationSize =  1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rol_sequence")
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "rol")
    private Set<usuarioRol> usuarioRols;

    public rol(String name) {
        this.name = name;
    }

    public rol() {

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

    public Set<usuarioRol> getUsuarioRols() {
        return usuarioRols;
    }

    public void setUsuarioRols(Set<usuarioRol> usuarioRols) {
        this.usuarioRols = usuarioRols;
    }
}
