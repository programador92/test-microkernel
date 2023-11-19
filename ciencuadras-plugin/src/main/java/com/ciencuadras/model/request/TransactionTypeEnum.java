package com.ciencuadras.model.request;

public enum TransactionTypeEnum {

	SELL("venta"),
	RENT("arriendo");
	
	private final String description;          
	
    public String getDescription() { 
		return description;
	}
	
    TransactionTypeEnum(String description) {  
		this.description = description;
	}
	
}
