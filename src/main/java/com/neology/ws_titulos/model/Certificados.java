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
@Table(name = "tblCertificados")
@NamedQuery(name = "Certifiados.findAll", query = "SELECT t FROM Certificados t")
public class Certificados implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -604189742727766368L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer intNumeroIdentificacionCert;
	
	@Column(nullable = false)
	private Integer intPlanEstudios;
	
	@Column(nullable = false)
	private Integer intCreditosObligatorios;
	
	@Column(nullable = false)
	private Integer intCreditosOptativos;
	
	@Column(nullable = false)
	private Integer intCreditosTotales;
	
	@Column(nullable = false)
	private Integer intAsignaturasAprobadas;
	
	@Column(nullable = false)
	private Integer intAsignaturasNoAprobadas;
	
	@Column(nullable = false)
	private Integer intAsignaturasTotal;
	
	@Column(nullable = false)
	private double dPromedio;

	public Integer getIntNumeroIdentificacionCert() {
		return intNumeroIdentificacionCert;
	}

	public void setIntNumeroIdentificacionCert(Integer intNumeroIdentificacionCert) {
		this.intNumeroIdentificacionCert = intNumeroIdentificacionCert;
	}

	public Integer getIntPlanEstudios() {
		return intPlanEstudios;
	}

	public void setIntPlanEstudios(Integer intPlanEstudios) {
		this.intPlanEstudios = intPlanEstudios;
	}

	public Integer getIntCreditosObligatorios() {
		return intCreditosObligatorios;
	}

	public void setIntCreditosObligatorios(Integer intCreditosObligatorios) {
		this.intCreditosObligatorios = intCreditosObligatorios;
	}

	public Integer getIntCreditosOptativos() {
		return intCreditosOptativos;
	}

	public void setIntCreditosOptativos(Integer intCreditosOptativos) {
		this.intCreditosOptativos = intCreditosOptativos;
	}

	public Integer getIntCreditosTotales() {
		return intCreditosTotales;
	}

	public void setIntCreditosTotales(Integer intCreditosTotales) {
		this.intCreditosTotales = intCreditosTotales;
	}

	public Integer getIntAsignaturasAprobadas() {
		return intAsignaturasAprobadas;
	}

	public void setIntAsignaturasAprobadas(Integer intAsignaturasAprobadas) {
		this.intAsignaturasAprobadas = intAsignaturasAprobadas;
	}

	public Integer getIntAsignaturasNoAprobadas() {
		return intAsignaturasNoAprobadas;
	}

	public void setIntAsignaturasNoAprobadas(Integer intAsignaturasNoAprobadas) {
		this.intAsignaturasNoAprobadas = intAsignaturasNoAprobadas;
	}

	public Integer getIntAsignaturasTotal() {
		return intAsignaturasTotal;
	}

	public void setIntAsignaturasTotal(Integer intAsignaturasTotal) {
		this.intAsignaturasTotal = intAsignaturasTotal;
	}

	public double getdPromedio() {
		return dPromedio;
	}

	public void setdPromedio(double dPromedio) {
		this.dPromedio = dPromedio;
	}

}
