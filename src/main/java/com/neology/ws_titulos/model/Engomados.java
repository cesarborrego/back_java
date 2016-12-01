package com.neology.ws_titulos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tbl3raPlaca")
@NamedQuery(name = "Engomados.findAll", query = "SELECT t FROM Engomados t")
public class Engomados implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 781179052286672399L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer idtbl3raPlaca;
	
	@Column(nullable = false)
	private String placa;
	
	@Column(nullable = false)
	private String vin;
	
	@Column(nullable = false)
	private String marca;
	
	@Column(nullable = false)
	private String submarca;
	
	@Column(nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private String version;
	
	@Column(nullable = false)
	private String clase_tipo;
	
	@Column(nullable = false)
	private String color;
	
	@Column(nullable = false)
	private String uso_vehiculo;
	
	@Column(nullable = false)
	private String propietario;
	
	@Lob
	@Column(nullable = false)
	private byte[] foto;

	public Integer getIdtbl3raPlaca() {
		return idtbl3raPlaca;
	}

	public void setIdtbl3raPlaca(Integer idtbl3raPlaca) {
		this.idtbl3raPlaca = idtbl3raPlaca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSubmarca() {
		return submarca;
	}

	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getClase_tipo() {
		return clase_tipo;
	}

	public void setClase_tipo(String clase_tipo) {
		this.clase_tipo = clase_tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUso_vehiculo() {
		return uso_vehiculo;
	}

	public void setUso_vehiculo(String uso_vehiculo) {
		this.uso_vehiculo = uso_vehiculo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	
}
