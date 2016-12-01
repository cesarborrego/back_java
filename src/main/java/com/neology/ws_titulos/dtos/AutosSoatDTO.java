package com.neology.ws_titulos.dtos;

import java.io.Serializable;

public class AutosSoatDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1934498135000199814L;
	
	private String strFolio;
	private String dtmFechaExpiracion;

	public String getStrFolio() {
		return strFolio;
	}

	public void setStrFolio(String strFolio) {
		this.strFolio = strFolio;
	}

	public String getDtmFechaExpiracion() {
		return dtmFechaExpiracion;
	}

	public void setDtmFechaExpiracion(String dtmFechaExpiracion) {
		this.dtmFechaExpiracion = dtmFechaExpiracion;
	}
	
}
