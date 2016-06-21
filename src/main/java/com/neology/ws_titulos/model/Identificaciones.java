package com.neology.ws_titulos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tblIdentificaciones")
@NamedQuery(name = "Identificaciones.findAll", query = "SELECT t FROM Identificaciones t")
public class Identificaciones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3892742034714392635L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer ID;
	
	@Column(nullable = false)
	private String carrera;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String apePaterno;
	
	@Column(nullable = true)
	private String apeMaterno;
	
	@Column(nullable = false)
	private Integer folioIdentificacion;
	
	@Column(nullable = false)
	private Integer ci;
	
	@Column(nullable = false)
	private byte [] fotografia;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public Integer getFolioIdentificacion() {
		return folioIdentificacion;
	}

	public void setFolioIdentificacion(Integer folioIdentificacion) {
		this.folioIdentificacion = folioIdentificacion;
	}

	public Integer getCi() {
		return ci;
	}

	public void setCi(Integer ci) {
		this.ci = ci;
	}

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}
	
	
}
