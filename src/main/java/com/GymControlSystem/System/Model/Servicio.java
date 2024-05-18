package com.GymControlSystem.System.Model;

import com.GymControlSystem.System.Model.Enums.Frecuencia;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idServicio;
    @NotBlank
    private String name;
    @NotNull
    private Double precio;
    private String descripcion;
    @Enumerated(value = EnumType.STRING)
    private Frecuencia frecuencia;
}
