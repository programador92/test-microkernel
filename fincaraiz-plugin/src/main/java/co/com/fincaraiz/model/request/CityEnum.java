package co.com.fincaraiz.model.request;

public enum CityEnum {

	BOGOTA("city-colombia-11-001", "colombia-cundinamarca-3630001-bogot\u00e1"),          
	MEDELLIN("city-colombia-05-001", "colombia-antioquia-5500006-medell\u00edn"),  
	CALI("city-colombia-76-001", "colombia-valle-del-cauca-8200006-cali"), 
	BARRANQUILLA("city-colombia-08-001", "colombia-atl\u00e1ntico-5700003-barranquilla"),
	MANIZALES("city-colombia-17-001", "colombia-caldas-6000006-manizales"),
	CARTAGENA("city-colombia-13-001", "colombia-bol\u00edvar-5800003-cartagena"),
	BUCARAMANGA("city-colombia-68-001","colombia-santander-7500007-bucaramanga");
	 
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
