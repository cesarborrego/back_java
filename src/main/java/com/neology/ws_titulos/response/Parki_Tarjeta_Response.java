package com.neology.ws_titulos.response;

import java.io.Serializable;
import java.util.List;

import com.neology.ws_titulos.model.Parquimetros;

public class Parki_Tarjeta_Response implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7693978244369890016L;
	
	private Parquimetros parquimetros;
	private String msg;
	private int code;
	
	public Parquimetros getParquimetros() {
		return parquimetros;
	}
	public void setParquimetros(Parquimetros parquimetros) {
		this.parquimetros = parquimetros;
	}
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
}
