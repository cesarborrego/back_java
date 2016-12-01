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
@Table(name = "tblTipoAuto_Bol")
@NamedQuery(name = "TipoAutoSoat.findAll", query = "SELECT t FROM TipoAutoSoat t")
public class TipoAutoSoat implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8962570139484617614L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer intIdTipoAuto;
	
	@Column(nullable = true)
	private String strTipoAuto;

	public Integer getIntIdTipoAuto() {
		return intIdTipoAuto;
	}

	public void setIntIdTipoAuto(Integer intIdTipoAuto) {
		this.intIdTipoAuto = intIdTipoAuto;
	}

	public String getStrTipoAuto() {
		return strTipoAuto;
	}

	public void setStrTipoAuto(String strTipoAuto) {
		this.strTipoAuto = strTipoAuto;
	}

}
