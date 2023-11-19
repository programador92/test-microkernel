package com.ciencuadras.model.request;

public enum LocalityEnum {

	USAQUEN("usaquen"),  
	CHAPINERO("chapinero"),  
	SANTA_FE("santa-fe"), 
	SAN_CRISTOBAL("san-cristobal"), 
	USME("usme"),
	TUNJUELITO("tunjuelito"),
	BOSA("bosa"),
	KENNEDY("kennedy"),
	FONTIBON("fontibon"),  
	ENGATIVA("engativa"),       
	SUBA("suba"), 
	BARRIOS_UNIDOS("barrios-unidos"),
	TEUSAQUILLO("teusaquillo"),
	MARTIRES("los-martires"),
	ANTONIO_NARINO("antonio-narino"),  
	PUENTE_ARANDA("puente-aranda"),
	CANDELARIA("la-candelaria"), 
	RAFAEL_URIBE_URIBE("rafael-uribe"), 
	CIUDAD_BOLIVAR("ciudad-bolivar"); 
	      
	private final String description;    
	
    public String getDescription() {            
		return description;
	}

    LocalityEnum(String description) {  
		this.description = description;
	}
	
}
