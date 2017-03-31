package com.neology.ws_titulos.response;

import java.io.Serializable;
import java.util.List;

import com.neology.ws_titulos.model.MovimientosParki;

public class BaseResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6567495960300048165L;
	private String msj;
	private int code;
	private Object object;
	private List<MovimientosParki> list;
	
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
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public List<MovimientosParki> getList() {
		return list;
	}
	public void setList(List<MovimientosParki> list) {
		this.list = list;
	}
		
}
