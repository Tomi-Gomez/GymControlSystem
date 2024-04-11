package com.GymControlSystem.System.Model;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.stereotype.Service;


@Entity
public class Cliente extends Persona{
    private Servicio servicio;
}
