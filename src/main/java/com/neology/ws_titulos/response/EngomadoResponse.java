package com.neology.ws_titulos.response;

import java.io.Serializable;

import com.neology.ws_titulos.model.Engomados;

public class EngomadoResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5489563157709880782L;
	private String msg;
	private int code;
	private Engomados engomados;
	
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
	public Engomados getEngomados() {
		return engomados;
	}
	public void setEngomados(Engomados engomados) {
		this.engomados = engomados;
	}

}
