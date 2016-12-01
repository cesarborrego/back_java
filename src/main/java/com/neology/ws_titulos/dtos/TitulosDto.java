package com.neology.ws_titulos.dtos;

import java.io.Serializable;

public class TitulosDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3451425420391640579L;
	private int intNumeroIdentificacion;
	private String strNombre;
	private String strApePaterno;
	private String strApeMaterno;
	private String strTitulo;
	private String strCarrera;
	private String strNivel;
	private int intNumFolioDocumento;
	private String strNacionalidad;
	private long dFechaNac;
	private String bFirmaTitulado;
	private String bFotoOriginal;
	private String bFotoMiniatura;
	private String strNombreUniversidad;
	private int intClaveUniversidad;
	private long dFechaExpedicion;
	private String genero;
	private String icn;
	
	public int getIntNumeroIdentificacion() {
		return intNumeroIdentificacion;
	}
	public void setIntNumeroIdentificacion(int intNumeroIdentificacion) {
		this.intNumeroIdentificacion = intNumeroIdentificacion;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrApePaterno() {
		return strApePaterno;
	}
	public void setStrApePaterno(String strApePaterno) {
		this.strApePaterno = strApePaterno;
	}
	public String getStrApeMaterno() {
		return strApeMaterno;
	}
	public void setStrApeMaterno(String strApeMaterno) {
		this.strApeMaterno = strApeMaterno;
	}
	public String getStrTitulo() {
		return strTitulo;
	}
	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}
	public String getStrCarrera() {
		return strCarrera;
	}
	public void setStrCarrera(String strCarrera) {
		this.strCarrera = strCarrera;
	}
	public String getStrNivel() {
		return strNivel;
	}
	public void setStrNivel(String strNivel) {
		this.strNivel = strNivel;
	}
	public int getIntNumFolioDocumento() {
		return intNumFolioDocumento;
	}
	public void setIntNumFolioDocumento(int intNumFolioDocumento) {
		this.intNumFolioDocumento = intNumFolioDocumento;
	}
	public String getStrNacionalidad() {
		return strNacionalidad;
	}
	public void setStrNacionalidad(String strNacionalidad) {
		this.strNacionalidad = strNacionalidad;
	}
	public long getdFechaNac() {
		return dFechaNac;
	}
	public void setdFechaNac(long dFechaNac) {
		this.dFechaNac = dFechaNac;
	}
	public String getbFirmaTitulado() {
		return bFirmaTitulado;
	}
	public void setbFirmaTitulado(String bFirmaTitulado) {
		this.bFirmaTitulado = bFirmaTitulado;
	}
	public String getbFotoOriginal() {
		return bFotoOriginal;
	}
	public void setbFotoOriginal(String bFotoOriginal) {
		this.bFotoOriginal = bFotoOriginal;
	}
	public String getbFotoMiniatura() {
		return bFotoMiniatura;
	}
	public void setbFotoMiniatura(String bFotoMiniatura) {
		this.bFotoMiniatura = bFotoMiniatura;
	}
	public String getStrNombreUniversidad() {
		return strNombreUniversidad;
	}
	public void setStrNombreUniversidad(String strNombreUniversidad) {
		this.strNombreUniversidad = strNombreUniversidad;
	}
	public int getIntClaveUniversidad() {
		return intClaveUniversidad;
	}
	public void setIntClaveUniversidad(int intClaveUniversidad) {
		this.intClaveUniversidad = intClaveUniversidad;
	}
	public long getdFechaExpedicion() {
		return dFechaExpedicion;
	}
	public void setdFechaExpedicion(long dFechaExpedicion) {
		this.dFechaExpedicion = dFechaExpedicion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIcn() {
		return icn;
	}
	public void setIcn(String icn) {
		this.icn = icn;
	}
	
}
