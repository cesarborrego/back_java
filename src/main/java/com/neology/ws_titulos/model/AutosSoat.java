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
@Table(name = "tblAutos_Bol")
@NamedQuery(name = "AutosSoat.findAll", query = "SELECT t FROM AutosSoat t")
public class AutosSoat implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3610634644145276619L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer idtblAutos_Bol;
	
	@ManyToOne
	@JoinColumn(name = "intIdTipoAuto", nullable = false)
	private TipoAutoSoat tipoAutoSoat;	

	@Column(nullable = true)
	private String strFolio;
	
	@Column(nullable = true)
	private String strMarca;
	
	@Column(nullable = true)
	private String strSubMarca;
	
	@Column(nullable = true)
	private String strPlaca;
	
	@Column(nullable = true)
	private String strAnioModelo;
	
	@Column(nullable = true)
	private String strImgAuto;
	
	@Column(nullable = true)
	private String dtmFechaExpiracion;

	public Integer getIdtblAutos_Bol() {
		return idtblAutos_Bol;
	}

	public void setIdtblAutos_Bol(Integer idtblAutos_Bol) {
		this.idtblAutos_Bol = idtblAutos_Bol;
	}

	public String getStrFolio() {
		return strFolio;
	}

	public void setStrFolio(String strFolio) {
		this.strFolio = strFolio;
	}

	public String getStrMarca() {
		return strMarca;
	}

	public void setStrMarca(String strMarca) {
		this.strMarca = strMarca;
	}

	public String getStrSubMarca() {
		return strSubMarca;
	}

	public void setStrSubMarca(String strSubMarca) {
		this.strSubMarca = strSubMarca;
	}

	public String getStrPlaca() {
		return strPlaca;
	}

	public void setStrPlaca(String strPlaca) {
		this.strPlaca = strPlaca;
	}

	public String getStrAnioModelo() {
		return strAnioModelo;
	}

	public void setStrAnioModelo(String strAnioModelo) {
		this.strAnioModelo = strAnioModelo;
	}

	public String getStrImgAuto() {
		return strImgAuto;
	}

	public void setStrImgAuto(String strImgAuto) {
		this.strImgAuto = strImgAuto;
	}

	public String getDtmFechaExpiracion() {
		return dtmFechaExpiracion;
	}

	public void setDtmFechaExpiracion(String dtmFechaExpiracion) {
		this.dtmFechaExpiracion = dtmFechaExpiracion;
	}
	
	public TipoAutoSoat getTipoAutoSoat() {
		return tipoAutoSoat;
	}

	public void setTipoAutoSoat(TipoAutoSoat tipoAutoSoat) {
		this.tipoAutoSoat = tipoAutoSoat;
	}

}
