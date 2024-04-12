package com.GymControlSystem.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empleado extends Persona{
    private String usuario = this.getNombre();
    private String contrasenia;
    @Enumerated(value = EnumType.STRING)
    private Usuarios posicion;
}
