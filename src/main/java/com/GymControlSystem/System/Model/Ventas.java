package com.GymControlSystem.System.Model;

import com.GymControlSystem.System.Model.Enums.MetodoPago;
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
    @OneToOne
    @JoinColumn(name = "id_Empleado",
    referencedColumnName = "idEmpleado")
    private Empleado empleado;
    @OneToOne
    @JoinColumn(name = "id_Cliente",
            referencedColumnName = "idCliente")
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name = "id_Servicio",
            referencedColumnName = "idServicio")
    private Servicio servicio;
}
