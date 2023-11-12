package api.house_finder.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import api.house_finder.model.Area;
import api.house_finder.model.Location;
import api.house_finder.model.OfferType;
import api.house_finder.model.Price;
import api.house_finder.model.RealEstateType;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RealEstateSearchRequestDTO {  

	private Location location;
	private RealEstateType realEstateType;  
	private OfferType offerType;  
	private Price price;
	private Area area;  
	private Integer numRooms;  
	private Integer numBaths; 
	private Integer numGarages;
	private Integer stratum;  
	
	public RealEstateSearchRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealEstateSearchRequestDTO(Location location, RealEstateType realEstateType, OfferType offerType,
			Price price, Area area, Integer numRooms, Integer numBaths, Integer numGarages, Integer stratum) {
		super();
		this.location = location;
		this.realEstateType = realEstateType;
		this.offerType = offerType;
		this.price = price;
		this.area = area;
		this.numRooms = numRooms;
		this.numBaths = numBaths;
		this.numGarages = numGarages;
		this.stratum = stratum;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public RealEstateType getRealEstateType() {
		return realEstateType;
	}

	public void setRealEstateType(RealEstateType realEstateType) {
		this.realEstateType = realEstateType;
	}

	public OfferType getOfferType() {
		return offerType;
	}

	public void setOfferType(OfferType offerType) {
		this.offerType = offerType;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Integer getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(Integer numRooms) {
		this.numRooms = numRooms;
	}

	public Integer getNumBaths() {
		return numBaths;
	}

	public void setNumBaths(Integer numBaths) {
		this.numBaths = numBaths;
	}

	public Integer getNumGarages() {
		return numGarages;
	}

	public void setNumGarages(Integer numGarages) {
		this.numGarages = numGarages;
	}

	public Integer getStratum() {
		return stratum;
	}

	public void setStratum(Integer stratum) {
		this.stratum = stratum;
	}

	@Override
	public String toString() {
		return "RealEstateSearchRequestDTO [location=" + location + ", realEstateType=" + realEstateType
				+ ", offerType=" + offerType + ", price=" + price + ", area=" + area + ", numRooms=" + numRooms
				+ ", numBaths=" + numBaths + ", numGarages=" + numGarages + ", stratum=" + stratum + "]";
	}	
 
}
