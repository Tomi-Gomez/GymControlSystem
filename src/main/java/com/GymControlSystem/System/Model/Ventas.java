package com.GymControlSystem.System.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    private Date fechaVenta;
    @Enumerated(value = EnumType.STRING)
    private MetodoPago metodoPago;
    private Empleado empleado;
    private Cliente cliente;
    private Servicio servicio;
}
