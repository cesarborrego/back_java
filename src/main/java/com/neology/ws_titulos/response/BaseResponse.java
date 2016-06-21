package com.neology.ws_titulos.response;

import java.io.Serializable;

public class BaseResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6567495960300048165L;
	private String msj;
	private int code;
	
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
}
