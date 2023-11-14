package com.metrocuadrado.model.request;

public enum CityEnum {

	BOGOTA("Bogota"),   
	MEDELLIN("Medell\u00edn"),     
	CALI("Cali"),  
	BARRANQUILLA("Barranquilla"), 
	MANIZALES("Manizales"), 
	CARTAGENA("Cartagena de Indias"),   
	BUCARAMANGA("Bucaramanga"); 
	
	private final String description;
	
	CityEnum(String description) { 
		this.description = description;
	}

	public String getDescription() {    
		return description;
	}
	
}
