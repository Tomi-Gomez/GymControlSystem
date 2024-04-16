package com.GymControlSystem.System.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    @Size (min = 0, max = 99999999)
    private String Dni;
    @NotBlank
    private Date fechaNacimiento;
    @NotBlank
    private String celular;
    @Email
    private String email;
    private String observaciones;
    private boolean flag;
}
