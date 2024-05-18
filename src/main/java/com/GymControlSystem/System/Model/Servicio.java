package com.GymControlSystem.System.Model;

import com.GymControlSystem.System.Model.Enums.Frecuencia;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicio;
    @NotBlank
    private String name;
    @NotNull
    private double precio;
    private String descripcion;
    @Enumerated(value = EnumType.STRING)
    private Frecuencia frecuencia;
}
