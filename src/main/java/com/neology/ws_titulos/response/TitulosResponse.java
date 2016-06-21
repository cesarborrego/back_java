package com.neology.ws_titulos.response;

import java.io.Serializable;

import com.neology.ws_titulos.model.Titulos;

public class TitulosResponse implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2976831673127226340L;
	private String msj;
	private int code;
	private Titulos titulos;
//	private String fotoOriginal;
//	private String fotoMiniatura;
//	private String firmaDigital;
	
//	public String getFotoOriginal() {
//		return fotoOriginal;
//	}
//	public void setFotoOriginal(String fotoOriginal) {
//		this.fotoOriginal = fotoOriginal;
//	}
//	public String getFotoMiniatura() {
//		return fotoMiniatura;
//	}
//	public void setFotoMiniatura(String fotoMiniatura) {
//		this.fotoMiniatura = fotoMiniatura;
//	}
//	public String getFirmaDigital() {
//		return firmaDigital;
//	}
//	public void setFirmaDigital(String firmaDigital) {
//		this.firmaDigital = firmaDigital;
//	}
	public String getMsj() {
		return msj;
	}
	public void setMsj(String msj) {
		this.msj = msj;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Titulos getTitulos() {
		return titulos;
	}
	public void setTitulos(Titulos titulos) {
		this.titulos = titulos;
	}	
	
}
