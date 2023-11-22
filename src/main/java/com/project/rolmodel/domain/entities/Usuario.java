package com.project.rolmodel.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @SequenceGenerator(name="usuario_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_sequence")
    private Integer id;
    private String username;
    private String password;
    private String email;
    @Column(name = "creat_at")
    private LocalDateTime createAt;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private usuarioDetalle usuarioDetalle;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<usuarioRol> usuarioRols;
    public Usuario(String username, String password, String email, LocalDateTime createAt) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.createAt = createAt;
    }

    public Usuario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public com.project.rolmodel.domain.entities.usuarioDetalle getUsuarioDetalle() {
        return usuarioDetalle;
    }

    public void setUsuarioDetalle(com.project.rolmodel.domain.entities.usuarioDetalle usuarioDetalle) {
        this.usuarioDetalle = usuarioDetalle;
    }

    public Set<usuarioRol> getUsuarioRols() {
        return usuarioRols;
    }

    public void setUsuarioRols(Set<usuarioRol> usuarioRols) {
        this.usuarioRols = usuarioRols;
    }
}