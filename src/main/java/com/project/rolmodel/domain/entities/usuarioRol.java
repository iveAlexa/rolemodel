package com.project.rolmodel.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name="usuario_rol")
public class usuarioRol {

    @Id
    @SequenceGenerator(name="usuario_rol_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_rol_sequence")
    private Integer id;
    private Boolean active;
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name="rol_id")
    private rol rol;

    public usuarioRol(Boolean active, LocalDateTime createdAt, Usuario usuario, com.project.rolmodel.domain.entities.rol rol) {
        this.active = active;
        this.createdAt = createdAt;
        this.usuario = usuario;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public com.project.rolmodel.domain.entities.rol getRol() {
        return rol;
    }

    public void setRol(com.project.rolmodel.domain.entities.rol rol) {
        this.rol = rol;
    }

    public usuarioRol() {

    }
}
