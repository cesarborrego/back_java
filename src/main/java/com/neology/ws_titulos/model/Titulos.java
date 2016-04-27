package com.neology.ws_titulos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="tblTitulos")
@NamedQuery(name="Titulos.findAll", query="SELECT t FROM Titulos t")
public class Titulos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6082155752048189675L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer intNumeroIdentificacion;
	
	@Column(nullable=false)
	private String strNombre;
	
	@Column(nullable=false)
	private String strApePaterno;
	
	@Column(nullable=true)
	private String strApeMaterno;
	
	@Column(nullable=false)
	private String strTitulo;
	
	@Column(nullable=false)
	private String strCarrera;
	
	@Column(nullable=false)
	private String strNivel;
	
	@Column(nullable=false)
	private Integer intNumFolioDocumento;
	
	@Column(nullable=false)
	private String strNacionalidad;
	
	@Column(nullable=false)
	private Date dFechaNac;
	
	@Lob
	@Column(nullable=false)
	private byte[] bFirmaTitulado;
	
	@Lob
	@Column(nullable=false)
	private byte[] bFotoOriginal;
	
	@Lob
	@Column(nullable=false)
	private byte[] bFotoMiniatura;
	
	@Column(nullable=false)
	private String strNombreUniversidad;
	
	@Column(nullable=false)
	private Integer intClaveUniversidad;

	public Integer getIntNumeroIdentificacion() {
		return intNumeroIdentificacion;
	}

	public void setIntNumeroIdentificacion(Integer intNumeroIdentificacion) {
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

	public Integer getIntNumFolioDocumento() {
		return intNumFolioDocumento;
	}

	public void setIntNumFolioDocumento(Integer intNumFolioDocumento) {
		this.intNumFolioDocumento = intNumFolioDocumento;
	}

	public String getStrNacionalidad() {
		return strNacionalidad;
	}

	public void setStrNacionalidad(String strNacionalidad) {
		this.strNacionalidad = strNacionalidad;
	}

	public Date getdFechaNac() {
		return dFechaNac;
	}

	public void setdFechaNac(Date dFechaNac) {
		this.dFechaNac = dFechaNac;
	}

	public byte[] getbFirmaTitulado() {
		return bFirmaTitulado;
	}

	public void setbFirmaTitulado(byte[] bFirmaTitulado) {
		this.bFirmaTitulado = bFirmaTitulado;
	}

	public byte[] getbFotoOriginal() {
		return bFotoOriginal;
	}

	public void setbFotoOriginal(byte[] bFotoOriginal) {
		this.bFotoOriginal = bFotoOriginal;
	}

	public byte[] getbFotoMiniatura() {
		return bFotoMiniatura;
	}

	public void setbFotoMiniatura(byte[] bFotoMiniatura) {
		this.bFotoMiniatura = bFotoMiniatura;
	}

	public String getStrNombreUniversidad() {
		return strNombreUniversidad;
	}

	public void setStrNombreUniversidad(String strNombreUniversidad) {
		this.strNombreUniversidad = strNombreUniversidad;
	}

	public Integer getIntClaveUniversidad() {
		return intClaveUniversidad;
	}

	public void setIntClaveUniversidad(Integer intClaveUniversidad) {
		this.intClaveUniversidad = intClaveUniversidad;
	}	

}
