package co.com.fincaraiz.model.request;
 
public enum LocalityEnum {  

	ENGATIVA("locality-colombia-bogota-dc-001-11-10");
	
	private final String description;  
	
    public String getDescription() {      
		return description;
	}

    LocalityEnum(String description) { 
		this.description = description;
	}
	
}
