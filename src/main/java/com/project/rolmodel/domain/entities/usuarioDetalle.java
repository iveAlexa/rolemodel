package com.project.rolmodel.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name= "usuario_detalle")
public class usuarioDetalle {

    @Id
    @SequenceGenerator(name="usuario_detalle_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_detalle_sequence")
    private Integer id;
    @Column(name="first_name")
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    private Integer age;
    @Column(name="birth_day")
    private LocalDate birthday;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public usuarioDetalle(String firstname, String lastname, Integer age, LocalDate birthday, Usuario usuario) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.birthday = birthday;
        this.usuario = usuario;
    }

    public usuarioDetalle() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
