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
@Table(name = "tblPersonas")
@NamedQuery(name = "Personas.findAll", query = "SELECT t FROM Personas t")
public class Personas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4679114358648029193L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer intPersona;
	
	@Column(nullable = false)
	private String strNombre;
	
	@Column(nullable = false)
	private String strApellidos;
	
	@Column(nullable = false)
	private String strCURP;
	
	@Column(nullable = true)
	private String strRFC;
	
	@Column(nullable = true)
	private Integer intNoSeguroSocial;
	
	@Column(nullable = false)
	private Date dateFechaNacimiento;
	
	@Column(nullable = true)
	private String strPaisNacimiento;
	
	@Column(nullable = true)
	private String strNacionalidad;
	
	@Column(nullable = true)
	private String strLugarNacimiento;
	
	@Column(nullable = false)
	private String strGenero;
	
	@Column(nullable = true)
	private String strTipoSangre;
	
	@Column(nullable = true)
	private String strRegistroNacimiento;
	
	@Column(nullable = true)
	private String strEstadoCivil;
	
	@Column(nullable = true)
	private String strProfesion;
	
	@Column(nullable = true)
	private String strDomicilio;
	
	@Column(nullable = true)
	private String strCP;
	
	@Column(nullable = true)
	private String strOCR1;
	
	@Column(nullable = true)
	private String strOCR2;
	
	@Column(nullable = true)
	private String strOCR3;
	
	@Lob
	@Column(nullable = true)
	private byte[] strURLfoto;
	
	@Lob
	@Column(nullable = true)
	private byte[] strURLfirma;
	
	@Lob
	@Column(nullable = true)
	private byte[] strURLhuella;

	public Integer getIntConsecutivo() {
		return intPersona;
	}

	public void setIntConsecutivo(Integer intConsecutivo) {
		this.intPersona = intConsecutivo;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApellidos() {
		return strApellidos;
	}

	public void setStrApellidos(String strApellidos) {
		this.strApellidos = strApellidos;
	}

	public String getStrCURP() {
		return strCURP;
	}

	public void setStrCURP(String strCURP) {
		this.strCURP = strCURP;
	}

	public String getStrRFC() {
		return strRFC;
	}

	public void setStrRFC(String strRFC) {
		this.strRFC = strRFC;
	}

	public Integer getIntNoSeguroSocial() {
		return intNoSeguroSocial;
	}

	public void setIntNoSeguroSocial(Integer intNoSeguroSocial) {
		this.intNoSeguroSocial = intNoSeguroSocial;
	}

	public Date getDateFechaNacimiento() {
		return dateFechaNacimiento;
	}

	public void setDateFechaNacimiento(Date dateFechaNacimiento) {
		this.dateFechaNacimiento = dateFechaNacimiento;
	}

	public String getStrPaisNacimiento() {
		return strPaisNacimiento;
	}

	public void setStrPaisNacimiento(String strPaisNacimiento) {
		this.strPaisNacimiento = strPaisNacimiento;
	}

	public String getStrNacionalidad() {
		return strNacionalidad;
	}

	public void setStrNacionalidad(String strNacionalidad) {
		this.strNacionalidad = strNacionalidad;
	}

	public String getStrLugarNacimiento() {
		return strLugarNacimiento;
	}

	public void setStrLugarNacimiento(String strLugarNacimiento) {
		this.strLugarNacimiento = strLugarNacimiento;
	}

	public String getStrGenero() {
		return strGenero;
	}

	public void setStrGenero(String strGenero) {
		this.strGenero = strGenero;
	}

	public String getStrTipoSangre() {
		return strTipoSangre;
	}

	public void setStrTipoSangre(String strTipoSangre) {
		this.strTipoSangre = strTipoSangre;
	}

	public String getStrRegistroNacimiento() {
		return strRegistroNacimiento;
	}

	public void setStrRegistroNacimiento(String strRegistroNacimiento) {
		this.strRegistroNacimiento = strRegistroNacimiento;
	}

	public String getStrEstadoCivil() {
		return strEstadoCivil;
	}

	public void setStrEstadoCivil(String strEstadoCivil) {
		this.strEstadoCivil = strEstadoCivil;
	}

	public String getStrProfesion() {
		return strProfesion;
	}

	public void setStrProfesion(String strProfesion) {
		this.strProfesion = strProfesion;
	}

	public String getStrDomicilio() {
		return strDomicilio;
	}

	public void setStrDomicilio(String strDomicilio) {
		this.strDomicilio = strDomicilio;
	}

	public String getStrCP() {
		return strCP;
	}

	public void setStrCP(String strCP) {
		this.strCP = strCP;
	}

	public String getStrOCR1() {
		return strOCR1;
	}

	public void setStrOCR1(String strOCR1) {
		this.strOCR1 = strOCR1;
	}

	public String getStrOCR2() {
		return strOCR2;
	}

	public void setStrOCR2(String strOCR2) {
		this.strOCR2 = strOCR2;
	}

	public String getStrOCR3() {
		return strOCR3;
	}

	public void setStrOCR3(String strOCR3) {
		this.strOCR3 = strOCR3;
	}

	public byte[] getStrURLfoto() {
		return strURLfoto;
	}

	public void setStrURLfoto(byte[] strURLfoto) {
		this.strURLfoto = strURLfoto;
	}

	public byte[] getStrURLfirma() {
		return strURLfirma;
	}

	public void setStrURLfirma(byte[] strURLfirma) {
		this.strURLfirma = strURLfirma;
	}

	public byte[] getStrURLhuella() {
		return strURLhuella;
	}

	public void setStrURLhuella(byte[] strURLhuella) {
		this.strURLhuella = strURLhuella;
	}	

}
