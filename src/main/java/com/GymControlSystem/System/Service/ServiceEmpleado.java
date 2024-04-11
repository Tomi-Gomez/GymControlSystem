package com.GymControlSystem.System.Service;

import com.GymControlSystem.System.Model.Cliente;
import com.GymControlSystem.System.Model.Empleado;
import com.GymControlSystem.System.Repository.IRepositoryEmpleado;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceEmpleado implements IServiceEmpleado{
    @Autowired
    IRepositoryEmpleado IrepoEmpleados;

    @Override
    public Empleado crear(Empleado empleado) {
        return IrepoEmpleados.save(empleado);
    }

    @Override
    public void borrarEmpleado(Long id) {
        Empleado emple = this.traerEmpleado(id);
        if (emple != null){
            emple.setFlag(false);
            IrepoEmpleados.save(emple);
        }
    }

    @Override
    public Empleado traerEmpleado(Long id) {
        return IrepoEmpleados.findById(id).orElse(null);
    }

    @Override
    public List<Empleado> traerTodosLosEmpleado() {
        return IrepoEmpleados.findAll();
    }

    @Override
    public void modificarEmpleado(Empleado empleado) {
        Empleado emple = this.traerEmpleado(empleado.getId());

        if(emple.getNombre() != null){
            emple.setNombre(empleado.getNombre());
        }
        if (emple.getApellido() != null){
            emple.setApellido(empleado.getApellido());
        }
        if (emple.getDni() != null){
            emple.setDni(empleado.getDni());
        }
        if (emple.getFechaNacimiento() != null){
            emple.setFechaNacimiento(empleado.getFechaNacimiento());
        }
        if (empleado.getCelular() != null){
            emple.setCelular(empleado.getCelular());
        }
        if (emple.getEmail() != null){
            emple.setEmail(empleado.getEmail());
        }
        if (empleado.getObservaciones() != null){
            emple.setObservaciones(emple.getObservaciones());
        }
        emple.setFlag(true);

        IrepoEmpleados.save(emple);
    }
}
