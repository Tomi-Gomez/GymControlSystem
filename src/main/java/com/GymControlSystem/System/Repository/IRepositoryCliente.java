package com.GymControlSystem.System.Repository;

import com.GymControlSystem.System.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryCliente extends JpaRepository<Cliente, Long> {
}
