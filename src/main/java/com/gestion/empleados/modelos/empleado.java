package com.gestion.empleados.modelos;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "empleados")
public class empleado {

	// Llave primaria de la tabla de empleados
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempleado")
	private Long id;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@Column(name = "apellido", length = 60, nullable = false)
	private String apellido;

	@JsonIgnore
	@OneToMany(mappedBy = "empleadohorario")
	private List<horario> empleadohorario;

	
	@ManyToOne
	@JoinColumn(name = "rolid")
	private roles rolesempleado;
	
	
	// Llave foranea que relaciona el rol con el empleado
	

	@Column(name = "fechaNacimiento", length = 60)
	@Temporal(TemporalType.DATE)
	private Calendar fechanacimiento;

	@Column(name = "telefono", length = 15)
	private Long telefono;

	@Column(name = "email", length = 60, nullable = false, unique = true)
	private String email;

	@Column(name = "estatus", length = 20)
	private String estatus;

	@Column(name = "fechaIngreso", length = 60)
	@Temporal(TemporalType.DATE)
	private Calendar fechaingreso;

	public empleado() {

	}

	public List<horario> getEmpleadohorario() {
		return empleadohorario;
	}

	public void setEmpleadohorario(List<horario> empleadohorario) {
		this.empleadohorario = empleadohorario;
	}

	public roles getRolesempleado() {
		return rolesempleado;
	}

	public void setRolesempleado(roles rolesempleado) {
		this.rolesempleado = rolesempleado;
	}

	public Calendar getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Calendar fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Calendar getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Calendar fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public empleado(Long id, String nombre, String apellido, List<horario> empleadohorario, roles rolesempleado,
			Calendar fechanacimiento, Long telefono, String email, String estatus, Calendar fechaingreso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.empleadohorario = empleadohorario;
		this.rolesempleado = rolesempleado;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.email = email;
		this.estatus = estatus;
		this.fechaingreso = fechaingreso;
	}



}
