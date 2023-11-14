package com.metrocuadrado.model.request;

public enum RealEstateBusinessListEnum {
	
	SELL("venta"),
	RENT("arriendo");
	
	private final String description;      
	
    public String getDescription() { 
		return description;
	}
	
    RealEstateBusinessListEnum(String description) { 
		this.description = description;
	}
    
}
