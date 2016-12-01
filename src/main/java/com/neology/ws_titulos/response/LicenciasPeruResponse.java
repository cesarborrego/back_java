package com.neology.ws_titulos.response;

import java.io.Serializable;

import com.neology.ws_titulos.model.Licencias_Peru;

public class LicenciasPeruResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6279954041487604036L;
	private String msg;
	private int code;
	private Licencias_Peru licencias_Peru;
	
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
	public Licencias_Peru getLicencias_Peru() {
		return licencias_Peru;
	}
	public void setLicencias_Peru(Licencias_Peru licencias_Peru) {
		this.licencias_Peru = licencias_Peru;
	}
}
