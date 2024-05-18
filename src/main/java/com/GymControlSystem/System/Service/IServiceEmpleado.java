package com.GymControlSystem.System.Service;

import com.GymControlSystem.System.Model.Cliente;
import com.GymControlSystem.System.Model.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IServiceEmpleado {
    Empleado crear(Empleado empleado);
    void borrarEmpleado(Long id);
    Empleado traerEmpleado(Long id);
    List<Empleado> traerTodosLosEmpleado();
    void modificarEmpleado(Empleado empleado);
}
