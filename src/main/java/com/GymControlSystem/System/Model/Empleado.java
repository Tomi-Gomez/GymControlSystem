package com.GymControlSystem.System.Model;

import com.GymControlSystem.System.Model.Enums.Usuarios;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empleado extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idEmpleado;
    private String usuario = this.getNombre();
    private String contrasenia;
    @Enumerated(value = EnumType.STRING)
    private Usuarios posicion;
}
