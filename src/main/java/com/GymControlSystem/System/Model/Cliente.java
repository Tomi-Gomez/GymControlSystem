package com.GymControlSystem.System.Model;

import jakarta.persistence.*;


@Entity
public class Cliente extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idCliente;
    @OneToOne
    @JoinColumn(name="idServicio")
    private Servicio servicio;
}
