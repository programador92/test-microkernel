package co.com.fincaraiz.model.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Filter {  
	
	private Offer offer;
	private PropertyType propertyType;   
	private Location locations;
	private Price price;
	private Room rooms;
	private Stratum stratum;
	private Area area;
	private Bath baths;
	private Garage garages; 
	
	public Filter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Filter(Offer offer, PropertyType propertyType, Location locations, Price price, Room rooms, Stratum stratum,
			Area area, Bath bath, Garage garages) {
		super();
		this.offer = offer;
		this.propertyType = propertyType;
		this.locations = locations;
		this.price = price;
		this.rooms = rooms;
		this.stratum = stratum;
		this.area = area;
		this.baths = bath;
		this.garages = garages;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public Location getLocations() {
		return locations;
	}

	public void setLocations(Location locations) {
		this.locations = locations;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Room getRooms() {
		return rooms;
	}

	public void setRooms(Room rooms) {
		this.rooms = rooms;
	}

	public Stratum getStratum() {
		return stratum;
	}

	public void setStratum(Stratum stratum) {
		this.stratum = stratum;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Bath getBaths() {
		return baths;
	}

	public void setBaths(Bath bath) {
		this.baths = bath;
	}

	public Garage getGarages() {
		return garages;
	}

	public void setGarages(Garage garages) { 
		this.garages = garages;
	}

	@Override
	public String toString() { 
		return "Filter [offer=" + offer + ", propertyType=" + propertyType + ", locations=" + locations + ", price="
				+ price + ", rooms=" + rooms + ", stratum=" + stratum + ", area=" + area + ", bath=" + baths
				+ ", garages=" + garages + "]";
	}	
	
}
