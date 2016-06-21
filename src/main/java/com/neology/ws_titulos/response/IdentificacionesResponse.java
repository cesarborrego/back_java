package com.neology.ws_titulos.response;

import java.io.Serializable;

import com.neology.ws_titulos.model.Identificaciones;

public class IdentificacionesResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2542410610675729112L;
	private String msg;
	private int code;
	private Identificaciones identificaciones;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Identificaciones getIdentificaciones() {
		return identificaciones;
	}
	public void setIdentificaciones(Identificaciones identificaciones) {
		this.identificaciones = identificaciones;
	}

}
