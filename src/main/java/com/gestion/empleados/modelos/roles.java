package com.gestion.empleados.modelos;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class roles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idroles")
	private Long id;

	@Column(name = "nombreRol", length = 30, nullable = false)
	private String nombrerol;

	@Column(name = "salario", length = 30, nullable = false)
	private double salario;

	@Column(name = "descripcion", length = 30)
	private String descripcion;

	@JsonIgnore
	//Mapeo de la relacion entre la tabla empleados y la tabla roles
	@OneToMany(mappedBy = "rolesempleado")
	private List<empleado> empleadorol;

	public roles() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getNombrerol() {
		return nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<empleado> getEmpleadorol() {
		return empleadorol;
	}

	public void setEmpleadorol(List<empleado> empleadorol) {
		this.empleadorol = empleadorol;
	}

	public roles(Long id, String nombrerol, double salario, String descripcion, List<empleado> empleadorol) {
		super();
		this.id = id;
		this.nombrerol = nombrerol;
		this.salario = salario;
		this.descripcion = descripcion;
		this.empleadorol = empleadorol;
	}

	



}
