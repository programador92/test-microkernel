package com.metrocuadrado.model.request;

public enum RealEstateTypeListEnum {
	
	HOUSE("casa"),
	APARTMENT("apartamento");
	
	private final String description;      
	
    public String getDescription() {     
		return description;
	} 
	
    RealEstateTypeListEnum(String description) { 
		this.description = description;
	}
	
}
