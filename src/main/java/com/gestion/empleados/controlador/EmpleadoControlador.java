package com.gestion.empleados.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.modelos.empleado;
import com.gestion.empleados.modelos.horario;
import com.gestion.empleados.modelos.roles;
import com.gestion.empleados.repositorio.EmpleadoRepositorio;
import com.gestion.empleados.repositorio.HorarioRepositorio;
import com.gestion.empleados.repositorio.RolesRepositorio;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoControlador {

	@Autowired
	private EmpleadoRepositorio repositorio;
	@Autowired
	private RolesRepositorio repositoriorol;
	@Autowired
	private HorarioRepositorio repositoriohorario;
	
	@GetMapping("/empleados")
	public List<empleado> ListarTodosLosEmpleados(){
		return repositorio.findAll();
	}
	
	@GetMapping("/roles")
	public List<roles> ListarTodosLosRoles(){
		return repositoriorol.findAll();
	}
	
	@GetMapping("/horarios")
	public List<horario> ListarTodosLosHorarios(){
		return repositoriohorario.findAll();
	}
	
	@PostMapping("/empleados")
	public empleado GuardarEmpleado(@RequestBody empleado empleado) {
		return repositorio.save(empleado);
	}
	
}
