package co.com.fincaraiz.model.request;

public enum PropertyTypeEnum {

	HOUSE("house"),
	APARTMENT("apartment");
	
	private final String description;    
	
    public String getDescription() { 
		return description;
	}

    PropertyTypeEnum(String description) { 
		this.description = description;
	}
	
}
