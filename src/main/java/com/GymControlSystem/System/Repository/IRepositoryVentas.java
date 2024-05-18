package com.GymControlSystem.System.Repository;

import com.GymControlSystem.System.Model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryVentas extends JpaRepository<Ventas, Long> {
}
