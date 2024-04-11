package com.GymControlSystem.System.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    private Double precio;
    private String descripcion;
    @Enumerated(value = EnumType.STRING)
    private Frecuencia frecuencia;
}
