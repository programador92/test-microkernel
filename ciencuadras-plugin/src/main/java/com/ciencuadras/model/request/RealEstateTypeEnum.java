package com.ciencuadras.model.request;

public enum RealEstateTypeEnum {  

	HOUSE("casa"),
	APARTMENT("apartamento");  
	
	private final String description;        
	
    public String getDescription() {       
		return description;
	} 
	
    RealEstateTypeEnum(String description) { 
		this.description = description;
	}
	
}
