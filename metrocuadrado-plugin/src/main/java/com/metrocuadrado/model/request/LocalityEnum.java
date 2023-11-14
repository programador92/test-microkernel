package com.metrocuadrado.model.request;

public enum LocalityEnum {     
 
	USAQUEN("Usaquen"),  
	CHAPINERO("Chapinero"),  
	SANTA_FE("Santafe"), 
	SAN_CRISTOBAL("San Cristobal"), 
	USME("Usme"),
	TUNJUELITO("Tunjuelito"),
	BOSA("Bosa"),
	KENNEDY("Kennedy"),
	FONTIBON("Fontibon"),  
	ENGATIVA("Engativa"),       
	SUBA("Suba"), 
	BARRIOS_UNIDOS("Barrios Unidos"),
	TEUSAQUILLO("Teusaquillo"),
	MARTIRES("Los Martires"),
	ANTONIO_NARINO("Antonio Nari\u00f1o"),  
	PUENTE_ARANDA("Puente Aranda"),
	CANDELARIA("La Candelaria"), 
	RAFAEL_URIBE_URIBE("Rafael Uribe Uribe"), 
	CIUDAD_BOLIVAR("Ciudad Bolivar");     
	
	private final String description;  
	
    public String getDescription() {           
		return description;
	}

    LocalityEnum(String description) { 
		this.description = description;
	}
	
}
