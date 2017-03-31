package com.neology.ws_titulos.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "tblMovimientos")
@NamedQuery(name = "MovimientosParki.findAll", query = "SELECT t FROM MovimientosParki t")
public class MovimientosParki implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3852900186864843505L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer idtblMovimientos;		

	@Column(nullable = true)
	private String strTarjetaID;
	
	@Column(nullable = true)
	private Date dFechaMovimiento;
	
	@Column(nullable = true)
	private int iMonto;
	
	@ManyToOne
	@JoinColumn(name = "tipoMovimiento", nullable = false)
	private TipoMovimientos tipoMovimientos;

	public Integer getIdtblMovimientos() {
		return idtblMovimientos;
	}

	public void setIdtblMovimientos(Integer idtblMovimientos) {
		this.idtblMovimientos = idtblMovimientos;
	}

	public String getStrTarjetaID() {
		return strTarjetaID;
	}

	public void setStrTarjetaID(String strTarjetaID) {
		this.strTarjetaID = strTarjetaID;
	}

	public Date getdFechaMovimiento() {
		return dFechaMovimiento;
	}

	public void setdFechaMovimiento(Date dFechaMovimiento) {
		this.dFechaMovimiento = dFechaMovimiento;
	}

	public int getiMonto() {
		return iMonto;
	}

	public void setiMonto(int iMonto) {
		this.iMonto = iMonto;
	}

	public TipoMovimientos getTipoMovimientos() {
		return tipoMovimientos;
	}

	public void setTipoMovimientos(TipoMovimientos tipoMovimientos) {
		this.tipoMovimientos = tipoMovimientos;
	}
	
}
