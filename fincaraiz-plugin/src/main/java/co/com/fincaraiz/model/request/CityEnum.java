package co.com.fincaraiz.model.request;

public enum CityEnum {

	BOGOTA("city-colombia-05-002", "colombia-cundinamarca"),     
	MEDELLIN("city-colombia-05-001", "colombia-antioquia-5500006-medellín");
	
	private final String code; 
	private final String description;
	 
	CityEnum(String code, String description) {
		this.code = code; 
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
}
