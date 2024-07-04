package com.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelos.roles;

@Repository
public interface RolesRepositorio extends JpaRepository<roles, Long> {

}
