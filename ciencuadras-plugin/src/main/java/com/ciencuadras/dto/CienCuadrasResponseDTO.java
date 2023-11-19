package com.ciencuadras.dto;

import com.ciencuadras.model.response.Data;

public class CienCuadrasResponseDTO {
	
	private Data data;

	public CienCuadrasResponseDTO() {     
		super();
		// TODO Auto-generated constructor stub
	}

	public CienCuadrasResponseDTO(Data data) {
		super();
		this.data = data;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {      
		return "CienCuadrasResponseDTO [data=" + data + "]";
	}   
	
}
