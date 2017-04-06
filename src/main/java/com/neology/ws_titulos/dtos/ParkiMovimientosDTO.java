package com.neology.ws_titulos.dtos;

import java.io.Serializable;

public class ParkiMovimientosDTO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5615344401908583235L;
	private String strTarjetaID;
	private long dFechaMovimiento;
	private int iMonto;
	private int tipoMovimiento;
	
	public String getStrTarjetaID() {
		return strTarjetaID;
	}
	public void setStrTarjetaID(String strTarjetaID) {
		this.strTarjetaID = strTarjetaID;
	}
	public long getdFechaMovimiento() {
		return dFechaMovimiento;
	}
	public void setdFechaMovimiento(long dFechaMovimiento) {
		this.dFechaMovimiento = dFechaMovimiento;
	}
	public int getiMonto() {
		return iMonto;
	}
	public void setiMonto(int iMonto) {
		this.iMonto = iMonto;
	}
	public int getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(int tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	
	
	
}
