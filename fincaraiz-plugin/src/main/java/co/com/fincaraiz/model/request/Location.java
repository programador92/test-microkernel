package co.com.fincaraiz.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Location {  
	
	private City cities;
	private Locality localities;
	  
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(City cities, Locality localities) {
		super();
		this.cities = cities;
		this.localities = localities;
	}
	public City getCities() {
		return cities;
	}
	public void setCities(City cities) {
		this.cities = cities;
	}
	public Locality getLocalities() {
		return localities;
	}
	public void setLocalities(Locality localities) {
		this.localities = localities;
	}
	@Override
	public String toString() {
		return "Location [cities=" + cities + ", localities=" + localities + "]";
	}
	
} 
