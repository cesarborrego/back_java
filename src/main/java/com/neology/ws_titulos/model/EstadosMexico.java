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
@Table(name = "tblEstados_MEX")
@NamedQuery(name = "EstadosMexico.findAll", query = "SELECT t FROM EstadosMexico t")
public class EstadosMexico implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 308874616133957553L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private int intID;
	
	@Column(nullable = true)
	private String strClave;
	
	@Column(nullable = true)
	private String strNombre;
	
	@Column(nullable = true)
	private String strCapital;

	public int getIntID() {
		return intID;
	}

	public void setIntID(int intID) {
		this.intID = intID;
	}

	public String getStrClave() {
		return strClave;
	}

	public void setStrClave(String strClave) {
		this.strClave = strClave;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrCapital() {
		return strCapital;
	}

	public void setStrCapital(String strCapital) {
		this.strCapital = strCapital;
	}

}
