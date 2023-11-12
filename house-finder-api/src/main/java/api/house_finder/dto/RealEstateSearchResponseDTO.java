package api.house_finder.dto;

import java.util.List;

import api.house_finder.model.Location;
import api.house_finder.model.OfferType;
import api.house_finder.model.RealEstateType;

public class RealEstateSearchResponseDTO {     
	
	private String price;
	private Location location;
	private RealEstateType real_estate_type;
	private OfferType offer_type;  
	private String description;
	private String area;
	private Integer num_rooms;
	private Integer num_baths;   
	private Integer num_garages;  
	private Integer stratum; 
	private String real_estate_platform; 
	private String contact_phone; 
	private String contact_whatsapp;
	private List<String> photos;
	
	public RealEstateSearchResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealEstateSearchResponseDTO(String price, Location location, RealEstateType real_estate_type,
			OfferType offer_type, String description, String area, Integer num_rooms, Integer num_baths,
			Integer num_garages, Integer stratum, String real_estate_platform, String contact_phone,
			String contact_whatsapp, List<String> photos) {
		super();
		this.price = price;
		this.location = location;
		this.real_estate_type = real_estate_type;
		this.offer_type = offer_type;
		this.description = description;
		this.area = area;
		this.num_rooms = num_rooms;
		this.num_baths = num_baths;
		this.num_garages = num_garages;
		this.stratum = stratum;
		this.real_estate_platform = real_estate_platform;
		this.contact_phone = contact_phone;
		this.contact_whatsapp = contact_whatsapp;
		this.photos = photos;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public RealEstateType getReal_estate_type() {
		return real_estate_type;
	}

	public void setReal_estate_type(RealEstateType real_estate_type) {
		this.real_estate_type = real_estate_type;
	}

	public OfferType getOffer_type() {
		return offer_type;
	}

	public void setOffer_type(OfferType offer_type) {
		this.offer_type = offer_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getNum_rooms() {
		return num_rooms;
	}

	public void setNum_rooms(Integer num_rooms) {
		this.num_rooms = num_rooms;
	}

	public Integer getNum_baths() {
		return num_baths;
	}

	public void setNum_baths(Integer num_baths) {
		this.num_baths = num_baths;
	}

	public Integer getNum_garages() {
		return num_garages;
	}

	public void setNum_garages(Integer num_garages) {
		this.num_garages = num_garages;
	}

	public Integer getStratum() {
		return stratum;
	}

	public void setStratum(Integer stratum) {
		this.stratum = stratum;
	}

	public String getReal_estate_platform() {
		return real_estate_platform;
	}

	public void setReal_estate_platform(String real_estate_platform) {
		this.real_estate_platform = real_estate_platform;
	}

	public String getContact_phone() {
		return contact_phone;
	}

	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}

	public String getContact_whatsapp() {
		return contact_whatsapp;
	}

	public void setContact_whatsapp(String contact_whatsapp) {
		this.contact_whatsapp = contact_whatsapp;
	}

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return "RealEstateSearchResponseDTO [price=" + price + ", location=" + location + ", real_estate_type="
				+ real_estate_type + ", offer_type=" + offer_type + ", description=" + description + ", area=" + area
				+ ", num_rooms=" + num_rooms + ", num_baths=" + num_baths + ", num_garages=" + num_garages
				+ ", stratum=" + stratum + ", real_estate_platform=" + real_estate_platform + ", contact_phone="
				+ contact_phone + ", contact_whatsapp=" + contact_whatsapp + ", photos=" + photos + "]";
	}

}
