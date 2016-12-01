package com.neology.ws_titulos.response;

import java.io.Serializable;

import com.neology.ws_titulos.model.CedulasNeology;

public class CedulasNeoResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6766796114845025052L;
	
	private String msg;
	private int code;
	private CedulasNeology cedulasNeology;
	
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
	public CedulasNeology getCedulasNeology() {
		return cedulasNeology;
	}
	public void setCedulasNeology(CedulasNeology cedulasNeology) {
		this.cedulasNeology = cedulasNeology;
	}	
}
