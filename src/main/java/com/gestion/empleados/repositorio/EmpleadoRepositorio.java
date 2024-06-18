package com.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelos.empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<empleado, Long>  {

}
