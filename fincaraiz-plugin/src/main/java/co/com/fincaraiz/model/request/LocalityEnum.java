package co.com.fincaraiz.model.request;
 
public enum LocalityEnum {  

	USAQUEN("locality-colombia-bogota-dc-001-11-01"),
	CHAPINERO("locality-colombia-bogota-dc-001-11-02"), 
	SANTA_FE("locality-colombia-bogota-dc-001-11-03"),
	SAN_CRISTOBAL("locality-colombia-bogota-dc-001-11-04"),
	USME("locality-colombia-bogota-dc-001-11-05"),
	TUNJUELITO("locality-colombia-bogota-dc-001-11-06"),
	BOSA("locality-colombia-bogota-dc-001-11-07"),
	KENNEDY("locality-colombia-bogota-dc-001-11-08"),
	FONTIBON("locality-colombia-bogota-dc-001-11-09"), 
	ENGATIVA("locality-colombia-bogota-dc-001-11-10"),     
	SUBA("locality-colombia-bogota-dc-001-11-11"), 
	BARRIOS_UNIDOS("locality-colombia-bogota-dc-001-11-12"),
	TEUSAQUILLO("locality-colombia-bogota-dc-001-11-13"),
	MARTIRES("locality-colombia-bogota-dc-001-11-14"),
	ANTONIO_NARINO("locality-colombia-bogota-dc-001-11-15"),
	PUENTE_ARANDA("locality-colombia-bogota-dc-001-11-16"),
	CANDELARIA("locality-colombia-bogota-dc-001-11-17"),
	RAFAEL_URIBE_URIBE("locality-colombia-bogota-dc-001-11-18"),
	CIUDAD_BOLIVAR("locality-colombia-bogota-dc-001-11-19");  
	
	private final String description;  
	
    public String getDescription() {      
		return description;
	}

    LocalityEnum(String description) { 
		this.description = description;
	}
	
}
