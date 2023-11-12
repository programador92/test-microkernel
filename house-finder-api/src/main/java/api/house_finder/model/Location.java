package api.house_finder.model;

public class Location { 
	
	private City city; 
	private Locality locality;

	public Location() {  
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Location(City city, Locality locality) {
		super();
		this.city = city;
		this.locality = locality;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Locality getLocality() {
		return locality;
	}

	public void setLocality(Locality locality) {
		this.locality = locality;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", locality=" + locality + "]";
	}
		
}
