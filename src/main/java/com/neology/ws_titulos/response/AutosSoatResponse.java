package com.neology.ws_titulos.response;

import java.io.Serializable;

import com.neology.ws_titulos.model.AutosSoat;

public class AutosSoatResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4428574272867000876L;
	private String msg;
	private int code;
	private AutosSoat autosSoat;
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
	public AutosSoat getAutosSoat() {
		return autosSoat;
	}
	public void setAutosSoat(AutosSoat autosSoat) {
		this.autosSoat = autosSoat;
	}
}
