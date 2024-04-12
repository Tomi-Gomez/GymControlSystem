package com.GymControlSystem.System.Controller;

import com.GymControlSystem.System.Model.Empleado;
import com.GymControlSystem.System.Service.IServiceEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleado")
public class ControllerEmpleado {

    @Autowired
    IServiceEmpleado IservEmpleado;

    @PostMapping("/crear")
    public String crearEmpleado(@RequestBody Empleado emple){
        IservEmpleado.crear(emple);
        return "El empleado ha sido creado correctamente";
    }

    @GetMapping("/traer/{id}")
    public Empleado traerEmpleado(@PathVariable Long id){
        return IservEmpleado.traerEmpleado(id);
    }

    @GetMapping("/traerTodos")
    public List<Empleado> traerTodos(){
        return IservEmpleado.traerTodosLosEmpleado();
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable Long id){
        IservEmpleado.borrarEmpleado(id);
        return "El empleado ha sido eliminado correctamente";
    }

    @PutMapping("/modificar/{id}")
    public Empleado modificarEmpleado(@RequestBody Empleado empleado){
        IservEmpleado.modificarEmpleado(empleado);
        return IservEmpleado.crear(empleado);
    }
}

