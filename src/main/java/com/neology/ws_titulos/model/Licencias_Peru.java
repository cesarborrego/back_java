package com.neology.ws_titulos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tblLicencias_PER")
@NamedQuery(name = "Licencias_Peru.findAll", query = "SELECT t FROM Licencias_Peru t")
public class Licencias_Peru implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7673160426024871904L;

	@Id
	@Column(unique = true, nullable = false)
	private String strNoLicencia;
	
	@Column(nullable = true)
	private Date dateFechaEmision;
	
	@Column(nullable = true)
	private Date dateFechaExpiracion;
	
	@Column(nullable = true)
	private String strClase;
	
	@Column(nullable = true)
	private String strCategoria;
	
	@Column(nullable = true)
	private String strServicio;
	
	@Column(nullable = true)
	private String strDonacion;
	
	@Column(nullable = true)
	private String strRestricciones;
	
	@ManyToOne
	@JoinColumn(name = "intPersona", nullable = false)
	private Personas personas;

	public String getStrNoLicencia() {
		return strNoLicencia;
	}

	public void setStrNoLicencia(String strNoLicencia) {
		this.strNoLicencia = strNoLicencia;
	}

	public Date getDateFechaEmision() {
		return dateFechaEmision;
	}

	public void setDateFechaEmision(Date dateFechaEmision) {
		this.dateFechaEmision = dateFechaEmision;
	}

	public Date getDateFechaExpiracion() {
		return dateFechaExpiracion;
	}

	public void setDateFechaExpiracion(Date dateFechaExpiracion) {
		this.dateFechaExpiracion = dateFechaExpiracion;
	}

	public String getStrClase() {
		return strClase;
	}

	public void setStrClase(String strClase) {
		this.strClase = strClase;
	}

	public String getStrCategoria() {
		return strCategoria;
	}

	public void setStrCategoria(String strCategoria) {
		this.strCategoria = strCategoria;
	}

	public String getStrServicio() {
		return strServicio;
	}

	public void setStrServicio(String strServicio) {
		this.strServicio = strServicio;
	}

	public String getStrDonacion() {
		return strDonacion;
	}

	public void setStrDonacion(String strDonacion) {
		this.strDonacion = strDonacion;
	}

	public String getStrRestricciones() {
		return strRestricciones;
	}

	public void setStrRestricciones(String strRestricciones) {
		this.strRestricciones = strRestricciones;
	}

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

}
