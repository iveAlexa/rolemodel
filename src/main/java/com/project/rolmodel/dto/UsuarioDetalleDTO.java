package com.project.rolmodel.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class UsuarioDetalleDTO
{
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private LocalDate birthday;

}
