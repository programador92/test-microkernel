package co.com.fincaraiz.model.request;

public enum OfferType {
	
	SELL("sell"),
	RENT("rent");
	
	private final String description;
	
    public String getDescription() {  
		return description;
	}

	OfferType(String description) { 
		this.description = description;
	}
    
}
