package com.neology.ws_titulos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tblTarjetasParquimetro")
@NamedQuery(name = "Parquimetros.findAll", query = "SELECT t FROM Parquimetros t")
public class Parquimetros implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2805554696629775932L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer idtblTarjetasParquimetro;

	@Column(nullable = false)
	private String strTarjetaID;
	
	@ManyToOne
	@JoinColumn(name = "intEntidad", nullable = false)
	private EstadosMexico estadosMexico;
	
	@ManyToOne
	@JoinColumn(name = "intTipoServicio", nullable = false)
	private TipoAutoSoat tipoAutoSoat;

	@Column(nullable = false)
	private Date dFechaRegistro;

	@Column(nullable = true)
	private Date dFechaVencimiento;

	@Column(nullable = false)
	private int iSaldo;

	public Integer getIdtblTarjetasParquimetro() {
		return idtblTarjetasParquimetro;
	}

	public void setIdtblTarjetasParquimetro(Integer idtblTarjetasParquimetro) {
		this.idtblTarjetasParquimetro = idtblTarjetasParquimetro;
	}

	public String getStrTarjetaID() {
		return strTarjetaID;
	}

	public void setStrTarjetaID(String strTarjetaID) {
		this.strTarjetaID = strTarjetaID;
	}

	public EstadosMexico getEstadosMexico() {
		return estadosMexico;
	}

	public void setEstadosMexico(EstadosMexico estadosMexico) {
		this.estadosMexico = estadosMexico;
	}

	public TipoAutoSoat getTipoAutoSoat() {
		return tipoAutoSoat;
	}

	public void setTipoAutoSoat(TipoAutoSoat tipoAutoSoat) {
		this.tipoAutoSoat = tipoAutoSoat;
	}

	public Date getdFechaRegistro() {
		return dFechaRegistro;
	}

	public void setdFechaRegistro(Date dFechaRegistro) {
		this.dFechaRegistro = dFechaRegistro;
	}

	public Date getdFechaVencimiento() {
		return dFechaVencimiento;
	}

	public void setdFechaVencimiento(Date dFechaVencimiento) {
		this.dFechaVencimiento = dFechaVencimiento;
	}

	public int getiSaldo() {
		return iSaldo;
	}

	public void setiSaldo(int iSaldo) {
		this.iSaldo = iSaldo;
	}
	
	
}
