package com.GymControlSystem.System.Model;

import jakarta.persistence.Entity;


@Entity
public class Cliente extends Persona{
    private Servicio servicio;
}
