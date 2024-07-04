package com.gestion.empleados.modelos;


import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.*;

@Entity
@Table (name = "horario")
public class horario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idhorario")
	private Long id;
	
	//Relacion de la tabla horario con la tabla empleados
	@OneToOne
	@JoinColumn(name = "empleadoid")
	private empleado empleadohorario;
	
	@Column(name = "dia")
	private Date dia;
	
	@Column(name = "HotaEntrada")
	private Time horaentrada;
	
	@Column(name = "HoraSalida")
	private Time horasalida;
	
	public horario() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public empleado getEmpleado() {
		return empleadohorario;
	}

	public void setEmpleado(empleado empleado) {
		this.empleadohorario = empleado;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Time getHoraentrada() {
		return horaentrada;
	}

	public void setHoraentrada(Time horaentrada) {
		this.horaentrada = horaentrada;
	}

	public Time getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(Time horasalida) {
		this.horasalida = horasalida;
	}

	public horario(Long id, empleado empleadohorario, Date dia, Time horaentrada, Time horasalida) {
		super();
		this.id = id;
		this.empleadohorario = empleadohorario;
		this.dia = dia;
		this.horaentrada = horaentrada;
		this.horasalida = horasalida;
	}


	
}
