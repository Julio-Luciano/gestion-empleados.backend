package com.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelos.horario;

@Repository
public interface HorarioRepositorio extends JpaRepository<horario, Long>{

}
