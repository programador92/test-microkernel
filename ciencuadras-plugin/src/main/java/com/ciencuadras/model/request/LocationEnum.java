package com.ciencuadras.model.request;

public enum LocationEnum {

	BOGOTA("bogota", "cundinamarca"),   
	MEDELLIN("medellin", "antioquia"),     
	CALI("cali", "valle-del-cauca"),   
	BARRANQUILLA("barranquilla", "atlantico"), 
	MANIZALES("manizales", "caldas"), 
	CARTAGENA("cartagena", "bolivar"),   
	BUCARAMANGA("bucaramanga", "santander"); 
	
	private final String city;
	private final String department;

	LocationEnum(String city, String department) {
		this.city = city;
		this.department = department;
	}
 
	public String getCity() {
		return city;
	}

	public String getDepartment() {  
		return department;
	}
	
}
