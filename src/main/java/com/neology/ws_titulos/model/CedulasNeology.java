package com.neology.ws_titulos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tblCedulas_NEO")
@NamedQuery(name = "CedulasNeology.findAll", query = "SELECT t FROM CedulasNeology t")
public class CedulasNeology implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2469385154330989737L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private long intNoCedula;
	
	@Column(nullable = true)
	private String strMatricula;
	
	@Column(nullable = true)
	private String dateFechaEmision;
	
	@Column(nullable = true)
	private String dateFechaExpiracion;
	
	@Column(nullable = true)
	private int intSerie;
	
	@Column(nullable = true)
	private int intSeccion;
	
	@ManyToOne
	@JoinColumn(name = "intLugarEmision", nullable = false)
	private EstadosMexico estadosMexico;
	
	@ManyToOne
	@JoinColumn(name = "intPersona", nullable = false)
	private Personas personas;

	public long getIntNoCedula() {
		return intNoCedula;
	}

	public void setIntNoCedula(long intNoCedula) {
		this.intNoCedula = intNoCedula;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getDateFechaEmision() {
		return dateFechaEmision;
	}

	public void setDateFechaEmision(String dateFechaEmision) {
		this.dateFechaEmision = dateFechaEmision;
	}

	public String getDateFechaExpiracion() {
		return dateFechaExpiracion;
	}

	public void setDateFechaExpiracion(String dateFechaExpiracion) {
		this.dateFechaExpiracion = dateFechaExpiracion;
	}

	public int getIntSerie() {
		return intSerie;
	}

	public void setIntSerie(int intSerie) {
		this.intSerie = intSerie;
	}

	public int getIntSeccion() {
		return intSeccion;
	}

	public void setIntSeccion(int intSeccion) {
		this.intSeccion = intSeccion;
	}

	public EstadosMexico getEstadosMexico() {
		return estadosMexico;
	}

	public void setEstadosMexico(EstadosMexico estadosMexico) {
		this.estadosMexico = estadosMexico;
	}

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

}
