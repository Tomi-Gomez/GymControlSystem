package com.GymControlSystem.System.Repository;

import com.GymControlSystem.System.Model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryServicio extends JpaRepository<Servicio, Long> {
}
